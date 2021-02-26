package typingsSlinky.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizationAdjustment extends StObject {
  
  var amount: String = js.native
  
  var processorResponseCode: String = js.native
  
  var processorResponseText: String = js.native
  
  var processorResponseType: String = js.native
  
  var success: Boolean = js.native
  
  var timestamp: js.Date = js.native
}
object AuthorizationAdjustment {
  
  @scala.inline
  def apply(
    amount: String,
    processorResponseCode: String,
    processorResponseText: String,
    processorResponseType: String,
    success: Boolean,
    timestamp: js.Date
  ): AuthorizationAdjustment = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], processorResponseCode = processorResponseCode.asInstanceOf[js.Any], processorResponseText = processorResponseText.asInstanceOf[js.Any], processorResponseType = processorResponseType.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationAdjustment]
  }
  
  @scala.inline
  implicit class AuthorizationAdjustmentMutableBuilder[Self <: AuthorizationAdjustment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessorResponseCode(value: String): Self = StObject.set(x, "processorResponseCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessorResponseText(value: String): Self = StObject.set(x, "processorResponseText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessorResponseType(value: String): Self = StObject.set(x, "processorResponseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
