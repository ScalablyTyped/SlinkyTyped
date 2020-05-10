package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsTransactionsV3PaymentMethodStatus extends js.Object {
  var status: js.UndefOr[GoogleActionsTransactionsV3PaymentMethodStatusStatus] = js.native
  /**
    * User facing message regarding the payment method status, i.e. \"Expired\".
    * Only required when payment method requires fix or is inapplicable.
    */
  var statusMessage: js.UndefOr[String] = js.native
}

object GoogleActionsTransactionsV3PaymentMethodStatus {
  @scala.inline
  def apply(): GoogleActionsTransactionsV3PaymentMethodStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3PaymentMethodStatus]
  }
  @scala.inline
  implicit class GoogleActionsTransactionsV3PaymentMethodStatusOps[Self <: GoogleActionsTransactionsV3PaymentMethodStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: GoogleActionsTransactionsV3PaymentMethodStatusStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(js.undefined)
        ret
    }
  }
  
}

