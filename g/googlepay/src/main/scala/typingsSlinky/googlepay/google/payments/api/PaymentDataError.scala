package typingsSlinky.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Definition of an error in PaymentData.
  */
@js.native
trait PaymentDataError extends StObject {
  
  /**
    * Intent of where the error occurs. Only data that specified in the
    * callback intent will be returned so an exception will be thrown if
    * the intent does not fall into one of the provided intents in
    * PaymentRequest.
    *
    * This field is required.
    */
  var intent: CallbackIntent = js.native
  
  /**
    * Custom user visible error that will be displayed in a dialog.
    *
    * This field is required.
    */
  var message: String = js.native
  
  /**
    * Predifined error reason
    *
    * This field is required.
    */
  var reason: ErrorReason = js.native
}
object PaymentDataError {
  
  @scala.inline
  def apply(intent: CallbackIntent, message: String, reason: ErrorReason): PaymentDataError = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentDataError]
  }
  
  @scala.inline
  implicit class PaymentDataErrorMutableBuilder[Self <: PaymentDataError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntent(value: CallbackIntent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: ErrorReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
