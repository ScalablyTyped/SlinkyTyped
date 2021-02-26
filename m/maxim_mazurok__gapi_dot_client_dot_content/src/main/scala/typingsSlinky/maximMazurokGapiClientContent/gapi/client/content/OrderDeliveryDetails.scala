package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderDeliveryDetails extends StObject {
  
  /** The delivery address */
  var address: js.UndefOr[OrderAddress] = js.native
  
  /** The phone number of the person receiving the delivery. */
  var phoneNumber: js.UndefOr[String] = js.native
}
object OrderDeliveryDetails {
  
  @scala.inline
  def apply(): OrderDeliveryDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderDeliveryDetails]
  }
  
  @scala.inline
  implicit class OrderDeliveryDetailsMutableBuilder[Self <: OrderDeliveryDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: OrderAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
  }
}
