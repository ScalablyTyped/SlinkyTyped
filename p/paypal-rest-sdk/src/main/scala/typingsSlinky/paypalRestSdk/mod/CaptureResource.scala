package typingsSlinky.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptureResource extends Resource {
  var invoice_number: js.UndefOr[String] = js.native
  var is_final_capture: js.UndefOr[Boolean] = js.native
  var transaction_fee: js.UndefOr[Currency] = js.native
}

object CaptureResource {
  @scala.inline
  def apply(amount: Amount, id: String): CaptureResource = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureResource]
  }
  @scala.inline
  implicit class CaptureResourceOps[Self <: CaptureResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withIs_final_capture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_final_capture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_final_capture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_final_capture")(js.undefined)
        ret
    }
    @scala.inline
    def withTransaction_fee(value: Currency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction_fee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransaction_fee: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction_fee")(js.undefined)
        ret
    }
  }
  
}

