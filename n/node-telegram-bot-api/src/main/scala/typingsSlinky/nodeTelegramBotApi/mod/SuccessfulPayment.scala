package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuccessfulPayment extends js.Object {
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
  implicit class SuccessfulPaymentOps[Self <: SuccessfulPayment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvoice_payload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice_payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvider_payment_charge_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider_payment_charge_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTelegram_payment_charge_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telegram_payment_charge_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_amount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder_info(value: OrderInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order_info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder_info: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order_info")(js.undefined)
        ret
    }
    @scala.inline
    def withShipping_option_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_option_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipping_option_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_option_id")(js.undefined)
        ret
    }
  }
  
}

