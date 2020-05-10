package typingsSlinky.actionsOnGoogle.v2Mod

import typingsSlinky.actionsOnGoogle.decisionMod.TransactionDecisionArgument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsTransactionsV3TransactionDecisionValue extends TransactionDecisionArgument {
  /**
    * If user requests for delivery address update, this field includes the
    * new delivery address. This field will be present only when
    * `transaction_decision` is `DELIVERY_ADDRESS_UPDATED`.
    */
  var deliveryAddress: js.UndefOr[GoogleActionsV2Location] = js.native
  /**
    * The order that user has approved. This field will be present only when
    * `transaction_decision` is `ORDER_ACCEPTED`.
    */
  var order: js.UndefOr[GoogleActionsOrdersV3Order] = js.native
  /**
    * Decision regarding the order.
    */
  var transactionDecision: js.UndefOr[GoogleActionsTransactionsV3TransactionDecisionValueTransactionDecision] = js.native
}

object GoogleActionsTransactionsV3TransactionDecisionValue {
  @scala.inline
  def apply(): GoogleActionsTransactionsV3TransactionDecisionValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3TransactionDecisionValue]
  }
  @scala.inline
  implicit class GoogleActionsTransactionsV3TransactionDecisionValueOps[Self <: GoogleActionsTransactionsV3TransactionDecisionValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliveryAddress(value: GoogleActionsV2Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryAddress")(js.undefined)
        ret
    }
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
    def withTransactionDecision(value: GoogleActionsTransactionsV3TransactionDecisionValueTransactionDecision): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionDecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactionDecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionDecision")(js.undefined)
        ret
    }
  }
  
}

