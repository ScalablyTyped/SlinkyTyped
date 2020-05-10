package typingsSlinky.bitcoinjsLib.paymentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentOpts extends js.Object {
  var allowIncomplete: js.UndefOr[Boolean] = js.native
  var validate: js.UndefOr[Boolean] = js.native
}

object PaymentOpts {
  @scala.inline
  def apply(): PaymentOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentOpts]
  }
  @scala.inline
  implicit class PaymentOptsOps[Self <: PaymentOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowIncomplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowIncomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowIncomplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowIncomplete")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
  }
  
}

