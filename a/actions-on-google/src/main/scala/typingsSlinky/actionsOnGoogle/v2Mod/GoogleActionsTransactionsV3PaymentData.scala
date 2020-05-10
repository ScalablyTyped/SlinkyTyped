package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsTransactionsV3PaymentData extends js.Object {
  /**
    * Payment information regarding the order that's useful for user facing
    * interaction.
    */
  var paymentInfo: js.UndefOr[GoogleActionsTransactionsV3PaymentInfo] = js.native
  /**
    * Payment result that's used by integrator for completing a transaction.
    * This field will be populated by Actions on Google if the checkout
    * experience is managed by Actions-on-Google.
    */
  var paymentResult: js.UndefOr[GoogleActionsTransactionsV3PaymentResult] = js.native
}

object GoogleActionsTransactionsV3PaymentData {
  @scala.inline
  def apply(): GoogleActionsTransactionsV3PaymentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3PaymentData]
  }
  @scala.inline
  implicit class GoogleActionsTransactionsV3PaymentDataOps[Self <: GoogleActionsTransactionsV3PaymentData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaymentInfo(value: GoogleActionsTransactionsV3PaymentInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withPaymentResult(value: GoogleActionsTransactionsV3PaymentResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentResult")(js.undefined)
        ret
    }
  }
  
}

