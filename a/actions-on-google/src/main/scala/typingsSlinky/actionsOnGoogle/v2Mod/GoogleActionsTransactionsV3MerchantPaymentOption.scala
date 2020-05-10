package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsTransactionsV3MerchantPaymentOption extends js.Object {
  /**
    * Optional. Id of the default payment method, if any.
    */
  var defaultMerchantPaymentMethodId: js.UndefOr[String] = js.native
  /**
    * Optional. A link to the action/merchant website for managing payment
    * method.
    */
  var managePaymentMethodUrl: js.UndefOr[String] = js.native
  /**
    * Required. List of payment methods provided by Action/Merchant.
    */
  var merchantPaymentMethod: js.UndefOr[js.Array[GoogleActionsTransactionsV3MerchantPaymentMethod]] = js.native
}

object GoogleActionsTransactionsV3MerchantPaymentOption {
  @scala.inline
  def apply(): GoogleActionsTransactionsV3MerchantPaymentOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3MerchantPaymentOption]
  }
  @scala.inline
  implicit class GoogleActionsTransactionsV3MerchantPaymentOptionOps[Self <: GoogleActionsTransactionsV3MerchantPaymentOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultMerchantPaymentMethodId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMerchantPaymentMethodId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultMerchantPaymentMethodId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMerchantPaymentMethodId")(js.undefined)
        ret
    }
    @scala.inline
    def withManagePaymentMethodUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managePaymentMethodUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagePaymentMethodUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managePaymentMethodUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withMerchantPaymentMethod(value: js.Array[GoogleActionsTransactionsV3MerchantPaymentMethod]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantPaymentMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerchantPaymentMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantPaymentMethod")(js.undefined)
        ret
    }
  }
  
}

