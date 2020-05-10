package typingsSlinky.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefundRequest extends js.Object {
  var amount: js.UndefOr[Amount] = js.native
  var description: js.UndefOr[String] = js.native
  var invoice_number: js.UndefOr[String] = js.native
  var items: js.UndefOr[js.Array[Item]] = js.native
  var payer_info: js.UndefOr[PayerInfo] = js.native
  var reason: js.UndefOr[String] = js.native
  var refund_advice: js.UndefOr[Boolean] = js.native
  var refund_source: js.UndefOr[String] = js.native
  var supplementary_data: js.UndefOr[js.Array[_]] = js.native
}

object RefundRequest {
  @scala.inline
  def apply(): RefundRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefundRequest]
  }
  @scala.inline
  implicit class RefundRequestOps[Self <: RefundRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: Amount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(js.undefined)
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
    def withItems(value: js.Array[Item]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withPayer_info(value: PayerInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payer_info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayer_info: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payer_info")(js.undefined)
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
    def withRefund_advice(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund_advice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefund_advice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund_advice")(js.undefined)
        ret
    }
    @scala.inline
    def withRefund_source(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund_source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefund_source: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund_source")(js.undefined)
        ret
    }
    @scala.inline
    def withSupplementary_data(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supplementary_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupplementary_data: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supplementary_data")(js.undefined)
        ret
    }
  }
  
}

