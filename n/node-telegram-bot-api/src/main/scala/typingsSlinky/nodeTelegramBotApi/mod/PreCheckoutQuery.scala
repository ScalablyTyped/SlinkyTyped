package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreCheckoutQuery extends js.Object {
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
  implicit class PreCheckoutQueryOps[Self <: PreCheckoutQuery] (val x: Self) extends AnyVal {
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
    def withFrom(value: User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvoice_payload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice_payload")(value.asInstanceOf[js.Any])
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

