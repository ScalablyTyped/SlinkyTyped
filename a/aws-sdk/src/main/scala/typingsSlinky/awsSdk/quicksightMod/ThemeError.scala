package typingsSlinky.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeError extends StObject {
  
  /**
    * The error message.
    */
  var Message: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The type of error.
    */
  var Type: js.UndefOr[ThemeErrorType] = js.native
}
object ThemeError {
  
  @scala.inline
  def apply(): ThemeError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeError]
  }
  
  @scala.inline
  implicit class ThemeErrorMutableBuilder[Self <: ThemeError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: NonEmptyString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setType(value: ThemeErrorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
