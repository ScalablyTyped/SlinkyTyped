package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsTransactionsV3PaymentParameters extends js.Object {
  /**
    * Info for requesting payment info from google.
    */
  var googlePaymentOption: js.UndefOr[GoogleActionsTransactionsV3GooglePaymentOption] = js.native
  /**
    * Info for payment methods provided by Action/Merchant.
    */
  var merchantPaymentOption: js.UndefOr[GoogleActionsTransactionsV3MerchantPaymentOption] = js.native
}

object GoogleActionsTransactionsV3PaymentParameters {
  @scala.inline
  def apply(): GoogleActionsTransactionsV3PaymentParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3PaymentParameters]
  }
  @scala.inline
  implicit class GoogleActionsTransactionsV3PaymentParametersOps[Self <: GoogleActionsTransactionsV3PaymentParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGooglePaymentOption(value: GoogleActionsTransactionsV3GooglePaymentOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googlePaymentOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGooglePaymentOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googlePaymentOption")(js.undefined)
        ret
    }
    @scala.inline
    def withMerchantPaymentOption(value: GoogleActionsTransactionsV3MerchantPaymentOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantPaymentOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerchantPaymentOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantPaymentOption")(js.undefined)
        ret
    }
  }
  
}

