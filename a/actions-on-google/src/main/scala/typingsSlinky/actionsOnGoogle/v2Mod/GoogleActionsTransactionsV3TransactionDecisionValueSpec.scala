package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsTransactionsV3TransactionDecisionValueSpec extends js.Object {
  /**
    * The order that's ready for user to approve.
    */
  var order: js.UndefOr[GoogleActionsOrdersV3Order] = js.native
  /**
    * Options associated with the order.
    */
  var orderOptions: js.UndefOr[GoogleActionsTransactionsV3OrderOptions] = js.native
  /**
    * Parameters for requesting payment for this order.
    */
  var paymentParameters: js.UndefOr[GoogleActionsTransactionsV3PaymentParameters] = js.native
  /**
    * Options used to customize order presentation to the user.
    */
  var presentationOptions: js.UndefOr[GoogleActionsTransactionsV3PresentationOptions] = js.native
}

object GoogleActionsTransactionsV3TransactionDecisionValueSpec {
  @scala.inline
  def apply(): GoogleActionsTransactionsV3TransactionDecisionValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3TransactionDecisionValueSpec]
  }
  @scala.inline
  implicit class GoogleActionsTransactionsV3TransactionDecisionValueSpecOps[Self <: GoogleActionsTransactionsV3TransactionDecisionValueSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrder(value: GoogleActionsOrdersV3Order): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderOptions(value: GoogleActionsTransactionsV3OrderOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPaymentParameters(value: GoogleActionsTransactionsV3PaymentParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withPresentationOptions(value: GoogleActionsTransactionsV3PresentationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresentationOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentationOptions")(js.undefined)
        ret
    }
  }
  
}

