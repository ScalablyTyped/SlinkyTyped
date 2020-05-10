package typingsSlinky.paypalRestSdk.mod.authorization

import typingsSlinky.paypalRestSdk.mod.Amount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptureRequest extends js.Object {
  var amount: js.UndefOr[Amount] = js.native
  var invoice_number: js.UndefOr[String] = js.native
  var is_final_capture: js.UndefOr[Boolean] = js.native
}

object CaptureRequest {
  @scala.inline
  def apply(): CaptureRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptureRequest]
  }
  @scala.inline
  implicit class CaptureRequestOps[Self <: CaptureRequest] (val x: Self) extends AnyVal {
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
  }
  
}

