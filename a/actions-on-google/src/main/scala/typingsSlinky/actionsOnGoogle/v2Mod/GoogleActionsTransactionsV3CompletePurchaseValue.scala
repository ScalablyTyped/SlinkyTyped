package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsTransactionsV3CompletePurchaseValue extends js.Object {
  /**
    * A unique order identifier for the transaction. This identifier corresponds
    * to the Google provided order ID.
    */
  var orderId: js.UndefOr[String] = js.native
  /**
    * Status of current purchase.
    */
  var purchaseStatus: js.UndefOr[GoogleActionsTransactionsV3CompletePurchaseValuePurchaseStatus] = js.native
  /**
    * A opaque token that uniquely identifies a purchase for a given item and
    * user pair.
    */
  var purchaseToken: js.UndefOr[String] = js.native
}

object GoogleActionsTransactionsV3CompletePurchaseValue {
  @scala.inline
  def apply(): GoogleActionsTransactionsV3CompletePurchaseValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3CompletePurchaseValue]
  }
  @scala.inline
  implicit class GoogleActionsTransactionsV3CompletePurchaseValueOps[Self <: GoogleActionsTransactionsV3CompletePurchaseValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderId")(js.undefined)
        ret
    }
    @scala.inline
    def withPurchaseStatus(value: GoogleActionsTransactionsV3CompletePurchaseValuePurchaseStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchaseStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurchaseStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchaseStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withPurchaseToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchaseToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurchaseToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchaseToken")(js.undefined)
        ret
    }
  }
  
}

