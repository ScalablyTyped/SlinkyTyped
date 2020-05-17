package typingsSlinky.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailOnDuplicatePaymentMethod extends js.Object {
  var failOnDuplicatePaymentMethod: js.UndefOr[Boolean] = js.native
  var makeDefault: js.UndefOr[Boolean] = js.native
  var verifyCard: js.UndefOr[Boolean] = js.native
}

object FailOnDuplicatePaymentMethod {
  @scala.inline
  def apply(): FailOnDuplicatePaymentMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailOnDuplicatePaymentMethod]
  }
  @scala.inline
  implicit class FailOnDuplicatePaymentMethodOps[Self <: FailOnDuplicatePaymentMethod] (val x: Self) extends AnyVal {
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

