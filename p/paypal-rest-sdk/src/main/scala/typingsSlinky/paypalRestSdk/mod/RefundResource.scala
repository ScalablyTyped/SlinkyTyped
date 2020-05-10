package typingsSlinky.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefundResource extends Resource {
  val capture_id: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var invoice_number: js.UndefOr[String] = js.native
  var reason: js.UndefOr[String] = js.native
  val refund_funding_type: js.UndefOr[String] = js.native
  val refund_reason_code: js.UndefOr[String] = js.native
  val sale_id: js.UndefOr[String] = js.native
}

object RefundResource {
  @scala.inline
  def apply(amount: Amount, id: String): RefundResource = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefundResource]
  }
  @scala.inline
  implicit class RefundResourceOps[Self <: RefundResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapture_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapture_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture_id")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withInvoice_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvoice_number: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice_number")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
    @scala.inline
    def withRefund_funding_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund_funding_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefund_funding_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund_funding_type")(js.undefined)
        ret
    }
    @scala.inline
    def withRefund_reason_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund_reason_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefund_reason_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund_reason_code")(js.undefined)
        ret
    }
    @scala.inline
    def withSale_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sale_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSale_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sale_id")(js.undefined)
        ret
    }
  }
  
}

