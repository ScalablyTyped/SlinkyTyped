package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2TransactionDecisionValueSpec extends js.Object {
  /**
    * Options associated with the order.
    */
  var orderOptions: js.UndefOr[GoogleActionsV2OrdersOrderOptions] = js.native
  /**
    * Payment options for this order, or empty if no payment
    * is associated with the order.
    */
  var paymentOptions: js.UndefOr[GoogleActionsV2OrdersPaymentOptions] = js.native
  /**
    * Options used to customize order presentation to the user.
    */
  var presentationOptions: js.UndefOr[GoogleActionsV2OrdersPresentationOptions] = js.native
  /**
    * The proposed order that's ready for user to approve.
    */
  var proposedOrder: js.UndefOr[GoogleActionsV2OrdersProposedOrder] = js.native
}

object GoogleActionsV2TransactionDecisionValueSpec {
  @scala.inline
  def apply(): GoogleActionsV2TransactionDecisionValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2TransactionDecisionValueSpec]
  }
  @scala.inline
  implicit class GoogleActionsV2TransactionDecisionValueSpecOps[Self <: GoogleActionsV2TransactionDecisionValueSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrderOptions(value: GoogleActionsV2OrdersOrderOptions): Self = {
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
    def withPaymentOptions(value: GoogleActionsV2OrdersPaymentOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPresentationOptions(value: GoogleActionsV2OrdersPresentationOptions): Self = {
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
    @scala.inline
    def withProposedOrder(value: GoogleActionsV2OrdersProposedOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposedOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProposedOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposedOrder")(js.undefined)
        ret
    }
  }
  
}

