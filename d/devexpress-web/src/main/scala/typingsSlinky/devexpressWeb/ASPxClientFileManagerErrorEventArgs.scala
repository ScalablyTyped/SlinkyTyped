package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.ErrorOccurred event.
  */
@js.native
trait ASPxClientFileManagerErrorEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the name of the processed command.
    */
  var commandName: String = js.native
  
  /**
    * Gets a specifically generated code that uniquely identifies an error, which occurs while editing an item.
    */
  var errorCode: Double = js.native
  
  /**
    * Gets or sets the error description.
    */
  var errorText: String = js.native
  
  /**
    * Gets or sets a value specifying whether an event error message is sent to the ASPxClientFileManager.ErrorAlertDisplaying event.
    */
  var showAlert: Boolean = js.native
}
object ASPxClientFileManagerErrorEventArgs {
  
  @scala.inline
  def apply(commandName: String, errorCode: Double, errorText: String, showAlert: Boolean): ASPxClientFileManagerErrorEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], showAlert = showAlert.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerErrorEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientFileManagerErrorEventArgsMutableBuilder[Self <: ASPxClientFileManagerErrorEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommandName(value: String): Self = StObject.set(x, "commandName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAlert(value: Boolean): Self = StObject.set(x, "showAlert", value.asInstanceOf[js.Any])
  }
}
