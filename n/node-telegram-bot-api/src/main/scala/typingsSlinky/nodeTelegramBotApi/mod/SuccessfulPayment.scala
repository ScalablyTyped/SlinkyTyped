package typingsSlinky.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuccessfulPayment extends StObject {
  
  var currency: String = js.native
  
  var invoice_payload: String = js.native
  
  var order_info: js.UndefOr[OrderInfo] = js.native
  
  var provider_payment_charge_id: String = js.native
  
  var shipping_option_id: js.UndefOr[String] = js.native
  
  var telegram_payment_charge_id: String = js.native
  
  var total_amount: Double = js.native
}
object SuccessfulPayment {
  
  @scala.inline
  def apply(
    currency: String,
    invoice_payload: String,
    provider_payment_charge_id: String,
    telegram_payment_charge_id: String,
    total_amount: Double
  ): SuccessfulPayment = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], invoice_payload = invoice_payload.asInstanceOf[js.Any], provider_payment_charge_id = provider_payment_charge_id.asInstanceOf[js.Any], telegram_payment_charge_id = telegram_payment_charge_id.asInstanceOf[js.Any], total_amount = total_amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuccessfulPayment]
  }
  
  @scala.inline
  implicit class SuccessfulPaymentMutableBuilder[Self <: SuccessfulPayment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvoice_payload(value: String): Self = StObject.set(x, "invoice_payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder_info(value: OrderInfo): Self = StObject.set(x, "order_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder_infoUndefined: Self = StObject.set(x, "order_info", js.undefined)
    
    @scala.inline
    def setProvider_payment_charge_id(value: String): Self = StObject.set(x, "provider_payment_charge_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipping_option_id(value: String): Self = StObject.set(x, "shipping_option_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipping_option_idUndefined: Self = StObject.set(x, "shipping_option_id", js.undefined)
    
    @scala.inline
    def setTelegram_payment_charge_id(value: String): Self = StObject.set(x, "telegram_payment_charge_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_amount(value: Double): Self = StObject.set(x, "total_amount", value.asInstanceOf[js.Any])
  }
}
