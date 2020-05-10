package typingsSlinky.actionsOnGoogle.v2Mod

import typingsSlinky.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2OrdersOrderUpdate extends js.Object {
  /**
    * Required. The canonical order id referencing this order.
    * If integrators don't generate the canonical order id in their system,
    * they can simply copy over google_order_id included in order.
    */
  var actionOrderId: js.UndefOr[String] = js.native
  /**
    * Information about cancellation state.
    */
  var cancellationInfo: js.UndefOr[GoogleActionsV2OrdersCancellationInfo] = js.native
  /**
    * Information about fulfillment state.
    */
  var fulfillmentInfo: js.UndefOr[GoogleActionsV2OrdersFulfillmentInfo] = js.native
  /**
    * Id of the order is the Google-issued id.
    */
  var googleOrderId: js.UndefOr[String] = js.native
  /**
    * Information about in transit state.
    */
  var inTransitInfo: js.UndefOr[GoogleActionsV2OrdersInTransitInfo] = js.native
  /**
    * Extra data based on a custom order state or in addition to info of a
    * standard state.
    */
  var infoExtension: js.UndefOr[ApiClientObjectMap[_]] = js.native
  /**
    * Map of line item-level changes, keyed by item id. Optional.
    */
  var lineItemUpdates: js.UndefOr[ApiClientObjectMap[GoogleActionsV2OrdersLineItemUpdate]] = js.native
  /**
    * Updated applicable management actions for the order, e.g. manage, modify,
    * contact support.
    */
  var orderManagementActions: js.UndefOr[js.Array[GoogleActionsV2OrdersOrderUpdateAction]] = js.native
  /**
    * The new state of the order.
    */
  var orderState: js.UndefOr[GoogleActionsV2OrdersOrderState] = js.native
  /**
    * Receipt for order.
    */
  var receipt: js.UndefOr[GoogleActionsV2OrdersReceipt] = js.native
  /**
    * Information about rejection state.
    */
  var rejectionInfo: js.UndefOr[GoogleActionsV2OrdersRejectionInfo] = js.native
  /**
    * Information about returned state.
    */
  var returnInfo: js.UndefOr[GoogleActionsV2OrdersReturnInfo] = js.native
  /**
    * New total price of the order
    */
  var totalPrice: js.UndefOr[GoogleActionsV2OrdersPrice] = js.native
  /**
    * When the order was updated from the app's perspective.
    */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * If specified, displays a notification to the user with the specified
    * title and text. Specifying a notification is a suggestion to
    * notify and is not guaranteed to result in a notification.
    */
  var userNotification: js.UndefOr[GoogleActionsV2OrdersOrderUpdateUserNotification] = js.native
}

object GoogleActionsV2OrdersOrderUpdate {
  @scala.inline
  def apply(): GoogleActionsV2OrdersOrderUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersOrderUpdate]
  }
  @scala.inline
  implicit class GoogleActionsV2OrdersOrderUpdateOps[Self <: GoogleActionsV2OrdersOrderUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionOrderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionOrderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionOrderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionOrderId")(js.undefined)
        ret
    }
    @scala.inline
    def withCancellationInfo(value: GoogleActionsV2OrdersCancellationInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancellationInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancellationInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancellationInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withFulfillmentInfo(value: GoogleActionsV2OrdersFulfillmentInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillmentInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFulfillmentInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillmentInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogleOrderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleOrderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleOrderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleOrderId")(js.undefined)
        ret
    }
    @scala.inline
    def withInTransitInfo(value: GoogleActionsV2OrdersInTransitInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inTransitInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInTransitInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inTransitInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withInfoExtension(value: ApiClientObjectMap[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfoExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoExtension")(js.undefined)
        ret
    }
    @scala.inline
    def withLineItemUpdates(value: ApiClientObjectMap[GoogleActionsV2OrdersLineItemUpdate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineItemUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineItemUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineItemUpdates")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderManagementActions(value: js.Array[GoogleActionsV2OrdersOrderUpdateAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderManagementActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderManagementActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderManagementActions")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderState(value: GoogleActionsV2OrdersOrderState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderState")(js.undefined)
        ret
    }
    @scala.inline
    def withReceipt(value: GoogleActionsV2OrdersReceipt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receipt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReceipt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receipt")(js.undefined)
        ret
    }
    @scala.inline
    def withRejectionInfo(value: GoogleActionsV2OrdersRejectionInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectionInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectionInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnInfo(value: GoogleActionsV2OrdersReturnInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalPrice(value: GoogleActionsV2OrdersPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withUserNotification(value: GoogleActionsV2OrdersOrderUpdateUserNotification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userNotification")(js.undefined)
        ret
    }
  }
  
}

