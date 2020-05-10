package typingsSlinky.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMakeDefault extends js.Object {
  var failOnDuplicatePaymentMethod: js.UndefOr[Boolean] = js.native
  var makeDefault: js.UndefOr[Boolean] = js.native
  var verificationAmount: js.UndefOr[String] = js.native
  var verificationMerchantAccountId: js.UndefOr[String] = js.native
  var verifyCard: js.UndefOr[Boolean] = js.native
}

object AnonMakeDefault {
  @scala.inline
  def apply(): AnonMakeDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMakeDefault]
  }
  @scala.inline
  implicit class AnonMakeDefaultOps[Self <: AnonMakeDefault] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailOnDuplicatePaymentMethod(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOnDuplicatePaymentMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailOnDuplicatePaymentMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOnDuplicatePaymentMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withMakeDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("makeDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMakeDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("makeDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withVerificationAmount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerificationAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withVerificationMerchantAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationMerchantAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerificationMerchantAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationMerchantAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withVerifyCard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerifyCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyCard")(js.undefined)
        ret
    }
  }
  
}

