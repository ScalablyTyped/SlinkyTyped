package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapSpinEditEventMap extends BootstrapClientEditEventMap {
  
  var buttonClick: ButtonEditClickEventArgs = js.native
  
  var keyDown: EditKeyEventArgs = js.native
  
  var keyPress: EditKeyEventArgs = js.native
  
  var keyUp: EditKeyEventArgs = js.native
  
  var numberChanged: ProcessingModeEventArgs = js.native
  
  var textChanged: ProcessingModeEventArgs = js.native
  
  var userInput: EventArgs = js.native
}
object BootstrapSpinEditEventMap {
  
  @scala.inline
  def apply(
    buttonClick: ButtonEditClickEventArgs,
    gotFocus: EventArgs,
    init: EventArgs,
    keyDown: EditKeyEventArgs,
    keyPress: EditKeyEventArgs,
    keyUp: EditKeyEventArgs,
    lostFocus: EventArgs,
    numberChanged: ProcessingModeEventArgs,
    textChanged: ProcessingModeEventArgs,
    userInput: EventArgs,
    validation: EditValidationEventArgs,
    valueChanged: ProcessingModeEventArgs
  ): BootstrapSpinEditEventMap = {
    val __obj = js.Dynamic.literal(buttonClick = buttonClick.asInstanceOf[js.Any], gotFocus = gotFocus.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], keyDown = keyDown.asInstanceOf[js.Any], keyPress = keyPress.asInstanceOf[js.Any], keyUp = keyUp.asInstanceOf[js.Any], lostFocus = lostFocus.asInstanceOf[js.Any], numberChanged = numberChanged.asInstanceOf[js.Any], textChanged = textChanged.asInstanceOf[js.Any], userInput = userInput.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapSpinEditEventMap]
  }
  
  @scala.inline
  implicit class BootstrapSpinEditEventMapMutableBuilder[Self <: BootstrapSpinEditEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtonClick(value: ButtonEditClickEventArgs): Self = StObject.set(x, "buttonClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyDown(value: EditKeyEventArgs): Self = StObject.set(x, "keyDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPress(value: EditKeyEventArgs): Self = StObject.set(x, "keyPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUp(value: EditKeyEventArgs): Self = StObject.set(x, "keyUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberChanged(value: ProcessingModeEventArgs): Self = StObject.set(x, "numberChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextChanged(value: ProcessingModeEventArgs): Self = StObject.set(x, "textChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInput(value: EventArgs): Self = StObject.set(x, "userInput", value.asInstanceOf[js.Any])
  }
}
