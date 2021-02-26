package typingsSlinky.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShippingQuery extends StObject {
  
  var from: User = js.native
  
  var id: String = js.native
  
  var invoice_payload: String = js.native
  
  var shipping_address: ShippingAddress = js.native
}
object ShippingQuery {
  
  @scala.inline
  def apply(from: User, id: String, invoice_payload: String, shipping_address: ShippingAddress): ShippingQuery = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invoice_payload = invoice_payload.asInstanceOf[js.Any], shipping_address = shipping_address.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShippingQuery]
  }
  
  @scala.inline
  implicit class ShippingQueryMutableBuilder[Self <: ShippingQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: User): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvoice_payload(value: String): Self = StObject.set(x, "invoice_payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipping_address(value: ShippingAddress): Self = StObject.set(x, "shipping_address", value.asInstanceOf[js.Any])
  }
}
