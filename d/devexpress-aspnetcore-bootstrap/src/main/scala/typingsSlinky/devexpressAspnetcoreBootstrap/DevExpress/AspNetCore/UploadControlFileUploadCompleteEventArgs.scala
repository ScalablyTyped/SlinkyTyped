package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadControlFileUploadCompleteEventArgs extends EventArgs {
  
  val callbackData: String = js.native
  
  val errorText: String = js.native
  
  val inputIndex: Double = js.native
  
  val isValid: Boolean = js.native
}
object UploadControlFileUploadCompleteEventArgs {
  
  @scala.inline
  def apply(callbackData: String, errorText: String, inputIndex: Double, isValid: Boolean, sender: Control): UploadControlFileUploadCompleteEventArgs = {
    val __obj = js.Dynamic.literal(callbackData = callbackData.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], inputIndex = inputIndex.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadControlFileUploadCompleteEventArgs]
  }
  
  @scala.inline
  implicit class UploadControlFileUploadCompleteEventArgsMutableBuilder[Self <: UploadControlFileUploadCompleteEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallbackData(value: String): Self = StObject.set(x, "callbackData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputIndex(value: Double): Self = StObject.set(x, "inputIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
  }
}
