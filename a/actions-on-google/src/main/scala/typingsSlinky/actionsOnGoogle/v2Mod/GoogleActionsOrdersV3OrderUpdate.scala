package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsOrdersV3OrderUpdate extends js.Object {
  var order: js.UndefOr[GoogleActionsOrdersV3Order] = js.native
  /**
    * Reason for the change/update.
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * Deprecated: Use OrderUpdate.update_mask instead.
    * If type = SNAPSHOT, OrderUpdate.order should be the entire order.
    * If type = ORDER_STATUS, this is the order level status change. Only
    * order.last_update_time and this vertical status are picked up.
    * Note: type.ORDER_STATUS only supports PurcahaseOrderExtension status
    * updates and there is no plan to extend this support. Instead, we recommend
    * using update_mask as it is more generic, extensible and can be used for all
    * verticals.
    */
  var `type`: js.UndefOr[GoogleActionsOrdersV3OrderUpdateType] = js.native
  /**
    * Note: There are following consideration/recommendations for following
    * special fields:
    * 1. order.last_update_time will always be updated as part of the update
    * request.
    * 2. order.create_time, order.google_order_id and order.merchant_order_id
    * will be ignored if provided as part of the update_mask.
    */
  var updateMask: js.UndefOr[String] = js.native
  /**
    * If specified, displays a notification to the user with the specified
    * title and text. Specifying a notification is a suggestion to
    * notify and is not guaranteed to result in a notification.
    */
  var userNotification: js.UndefOr[GoogleActionsOrdersV3OrderUpdateUserNotification] = js.native
}

object GoogleActionsOrdersV3OrderUpdate {
  @scala.inline
  def apply(): GoogleActionsOrdersV3OrderUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3OrderUpdate]
  }
  @scala.inline
  implicit class GoogleActionsOrdersV3OrderUpdateOps[Self <: GoogleActionsOrdersV3OrderUpdate] (val x: Self) extends AnyVal {
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
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: GoogleActionsOrdersV3OrderUpdateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateMask(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(js.undefined)
        ret
    }
    @scala.inline
    def withUserNotification(value: GoogleActionsOrdersV3OrderUpdateUserNotification): Self = {
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

