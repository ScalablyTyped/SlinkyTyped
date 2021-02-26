package typingsSlinky.applepayjs.ApplePayJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A customizable error type that you create to indicate problems with the address or contact information on an Apple Pay sheet.
  */
@js.native
trait ApplePayError extends StObject {
  
  /**
    * The error code for this instance.
    */
  var code: ApplePayErrorCode = js.native
  
  /**
    * The name of the field that contains the error.
    */
  var contactField: js.UndefOr[ApplePayErrorContactField] = js.native
  
  /**
    * A localized, user-facing string that describes the error.
    */
  var message: String = js.native
}
object ApplePayError {
  
  @scala.inline
  def apply(code: ApplePayErrorCode, message: String): ApplePayError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayError]
  }
  
  @scala.inline
  implicit class ApplePayErrorMutableBuilder[Self <: ApplePayError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: ApplePayErrorCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactField(value: ApplePayErrorContactField): Self = StObject.set(x, "contactField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactFieldUndefined: Self = StObject.set(x, "contactField", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
