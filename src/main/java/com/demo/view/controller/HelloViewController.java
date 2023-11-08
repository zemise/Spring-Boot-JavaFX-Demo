package com.demo.view.controller;

import de.felixroske.jfxsupport.FXMLController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * <p>
 *
 * </p>
 *
 * @author <a href= "https://github.com/zemise">zemise</a>
 * @Date 2023/11/8
 * @since 1.0
 */
@FXMLController
public class HelloViewController implements Initializable {
    @FXML
    private Text wellcomeText;

    @FXML
    private Button button;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        button.setOnAction(event -> {
            wellcomeText.setText("Hello! Springboot and javaFX");
        });


    }

    public void resetText(ActionEvent actionEvent) {
        wellcomeText.setText("Hello!");
    }
}
