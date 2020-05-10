package typingsSlinky.actionsOnGoogle.v2Mod

import typingsSlinky.actionsOnGoogle.decisionMod.TransactionDecisionArgument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2TransactionDecisionValue extends TransactionDecisionArgument {
  /**
    * If `check_result` is NOT `ResultType.OK`, the rest of the fields in
    * this message should be ignored.
    */
  var checkResult: js.UndefOr[GoogleActionsV2TransactionRequirementsCheckResult] = js.native
  /**
    * If user requests for delivery address update, this field includes the
    * new delivery address. This field will be present only when `user_decision`
    * is `DELIVERY_ADDRESS_UPDATED`.
    */
  var deliveryAddress: js.UndefOr[GoogleActionsV2Location] = js.native
  /**
    * The order that user has approved. This field will be present only when
    * `user_decision` is `ORDER_ACCEPTED`.
    */
  var order: js.UndefOr[GoogleActionsV2OrdersOrder] = js.native
  /**
    * User decision regarding the proposed order.
    */
  var userDecision: js.UndefOr[GoogleActionsV2TransactionDecisionValueUserDecision] = js.native
}

object GoogleActionsV2TransactionDecisionValue {
  @scala.inline
  def apply(): GoogleActionsV2TransactionDecisionValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2TransactionDecisionValue]
  }
  @scala.inline
  implicit class GoogleActionsV2TransactionDecisionValueOps[Self <: GoogleActionsV2TransactionDecisionValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckResult(value: GoogleActionsV2TransactionRequirementsCheckResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkResult")(js.undefined)
        ret
    }
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
    def withOrder(value: GoogleActionsV2OrdersOrder): Self = {
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
    def withUserDecision(value: GoogleActionsV2TransactionDecisionValueUserDecision): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserDecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDecision")(js.undefined)
        ret
    }
  }
  
}

