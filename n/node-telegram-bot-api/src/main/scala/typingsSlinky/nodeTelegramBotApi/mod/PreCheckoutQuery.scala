package typingsSlinky.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreCheckoutQuery extends StObject {
  
  var currency: String = js.native
  
  var from: User = js.native
  
  var id: String = js.native
  
  var invoice_payload: String = js.native
  
  var order_info: js.UndefOr[OrderInfo] = js.native
  
  var shipping_option_id: js.UndefOr[String] = js.native
  
  var total_amount: Double = js.native
}
object PreCheckoutQuery {
  
  @scala.inline
  def apply(currency: String, from: User, id: String, invoice_payload: String, total_amount: Double): PreCheckoutQuery = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invoice_payload = invoice_payload.asInstanceOf[js.Any], total_amount = total_amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreCheckoutQuery]
  }
  
  @scala.inline
  implicit class PreCheckoutQueryMutableBuilder[Self <: PreCheckoutQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: User): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvoice_payload(value: String): Self = StObject.set(x, "invoice_payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder_info(value: OrderInfo): Self = StObject.set(x, "order_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder_infoUndefined: Self = StObject.set(x, "order_info", js.undefined)
    
    @scala.inline
    def setShipping_option_id(value: String): Self = StObject.set(x, "shipping_option_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipping_option_idUndefined: Self = StObject.set(x, "shipping_option_id", js.undefined)
    
    @scala.inline
    def setTotal_amount(value: Double): Self = StObject.set(x, "total_amount", value.asInstanceOf[js.Any])
  }
}
