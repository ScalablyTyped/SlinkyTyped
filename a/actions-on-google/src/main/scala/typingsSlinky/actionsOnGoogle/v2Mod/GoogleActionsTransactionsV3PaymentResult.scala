package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsTransactionsV3PaymentResult extends js.Object {
  /**
    * Google provided payment method data.
    * If your payment processor is listed as Google supported payment processor
    * here: https://developers.google.com/pay/api/ Navigate to your payment
    * processor through the link to find out more details.
    * Otherwise, refer to following documentation for payload details.
    * https://developers.google.com/pay/api/payment-data-cryptography
    */
  var googlePaymentData: js.UndefOr[String] = js.native
  /**
    * Merchant/Action provided payment method chosen by user.
    */
  var merchantPaymentMethodId: js.UndefOr[String] = js.native
}

object GoogleActionsTransactionsV3PaymentResult {
  @scala.inline
  def apply(): GoogleActionsTransactionsV3PaymentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3PaymentResult]
  }
  @scala.inline
  implicit class GoogleActionsTransactionsV3PaymentResultOps[Self <: GoogleActionsTransactionsV3PaymentResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGooglePaymentData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googlePaymentData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGooglePaymentData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googlePaymentData")(js.undefined)
        ret
    }
    @scala.inline
    def withMerchantPaymentMethodId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantPaymentMethodId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerchantPaymentMethodId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantPaymentMethodId")(js.undefined)
        ret
    }
  }
  
}

