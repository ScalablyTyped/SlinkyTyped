package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2OrdersActionProvidedPaymentOptions extends js.Object {
  /**
    * Name of the instrument displayed on the receipt.
    * Required for action-provided payment info.
    * For `PAYMENT_CARD`, this could be \"VISA-1234\".
    * For `BANK`, this could be \"Chase Checking-1234\".
    * For `LOYALTY_PROGRAM`, this could be \"Starbuck's points\".
    * For `ON_FULFILLMENT`, this could be something like \"pay on delivery\".
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Type of payment.
    * Required.
    */
  var paymentType: js.UndefOr[GoogleActionsV2OrdersActionProvidedPaymentOptionsPaymentType] = js.native
}

object GoogleActionsV2OrdersActionProvidedPaymentOptions {
  @scala.inline
  def apply(): GoogleActionsV2OrdersActionProvidedPaymentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersActionProvidedPaymentOptions]
  }
  @scala.inline
  implicit class GoogleActionsV2OrdersActionProvidedPaymentOptionsOps[Self <: GoogleActionsV2OrdersActionProvidedPaymentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withPaymentType(value: GoogleActionsV2OrdersActionProvidedPaymentOptionsPaymentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentType")(js.undefined)
        ret
    }
  }
  
}

