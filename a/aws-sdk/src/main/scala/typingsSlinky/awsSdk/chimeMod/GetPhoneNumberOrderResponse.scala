package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPhoneNumberOrderResponse extends StObject {
  
  /**
    * The phone number order details.
    */
  var PhoneNumberOrder: js.UndefOr[typingsSlinky.awsSdk.chimeMod.PhoneNumberOrder] = js.native
}
object GetPhoneNumberOrderResponse {
  
  @scala.inline
  def apply(): GetPhoneNumberOrderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPhoneNumberOrderResponse]
  }
  
  @scala.inline
  implicit class GetPhoneNumberOrderResponseMutableBuilder[Self <: GetPhoneNumberOrderResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPhoneNumberOrder(value: PhoneNumberOrder): Self = StObject.set(x, "PhoneNumberOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberOrderUndefined: Self = StObject.set(x, "PhoneNumberOrder", js.undefined)
  }
}
