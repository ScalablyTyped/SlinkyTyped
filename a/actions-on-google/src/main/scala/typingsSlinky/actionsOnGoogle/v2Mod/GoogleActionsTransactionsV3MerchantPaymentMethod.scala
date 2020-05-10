package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsTransactionsV3MerchantPaymentMethod extends js.Object {
  /**
    * Required. Display info of this payment method.
    */
  var paymentMethodDisplayInfo: js.UndefOr[GoogleActionsTransactionsV3PaymentMethodDisplayInfo] = js.native
  /**
    * Optional. The group / profile name that the payment method belongs to.
    */
  var paymentMethodGroup: js.UndefOr[String] = js.native
  /**
    * Required. Id of the payment method passed from merchant / action.
    * Note this id is should be unique if multiple payment methods are sent from
    * Merchant/Action.
    */
  var paymentMethodId: js.UndefOr[String] = js.native
  /**
    * Optional. Status of the payment method.
    * If not present, the payment method is assumed to be in OK status.
    */
  var paymentMethodStatus: js.UndefOr[GoogleActionsTransactionsV3PaymentMethodStatus] = js.native
}

object GoogleActionsTransactionsV3MerchantPaymentMethod {
  @scala.inline
  def apply(): GoogleActionsTransactionsV3MerchantPaymentMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3MerchantPaymentMethod]
  }
  @scala.inline
  implicit class GoogleActionsTransactionsV3MerchantPaymentMethodOps[Self <: GoogleActionsTransactionsV3MerchantPaymentMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaymentMethodDisplayInfo(value: GoogleActionsTransactionsV3PaymentMethodDisplayInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentMethodDisplayInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentMethodDisplayInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentMethodDisplayInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withPaymentMethodGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentMethodGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentMethodGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentMethodGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withPaymentMethodId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentMethodId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentMethodId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentMethodId")(js.undefined)
        ret
    }
    @scala.inline
    def withPaymentMethodStatus(value: GoogleActionsTransactionsV3PaymentMethodStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentMethodStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentMethodStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentMethodStatus")(js.undefined)
        ret
    }
  }
  
}

