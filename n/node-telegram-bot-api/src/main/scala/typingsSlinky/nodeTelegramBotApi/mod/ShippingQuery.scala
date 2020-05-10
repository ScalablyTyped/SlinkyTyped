package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShippingQuery extends js.Object {
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
  implicit class ShippingQueryOps[Self <: ShippingQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withShipping_address(value: ShippingAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_address")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

