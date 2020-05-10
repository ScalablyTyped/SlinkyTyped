package typingsSlinky.actionsOnGoogle.v2Mod

import typingsSlinky.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2OrdersLineItemUpdate extends js.Object {
  /**
    * Update to the line item extension. Type must match the item's
    * existing extension type.
    */
  var extension: js.UndefOr[ApiClientObjectMap[_]] = js.native
  /**
    * New line item-level state.
    */
  var orderState: js.UndefOr[GoogleActionsV2OrdersOrderState] = js.native
  /**
    * New price for the line item.
    */
  var price: js.UndefOr[GoogleActionsV2OrdersPrice] = js.native
  /**
    * Reason for the change. Required for price changes.
    */
  var reason: js.UndefOr[String] = js.native
}

object GoogleActionsV2OrdersLineItemUpdate {
  @scala.inline
  def apply(): GoogleActionsV2OrdersLineItemUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersLineItemUpdate]
  }
  @scala.inline
  implicit class GoogleActionsV2OrdersLineItemUpdateOps[Self <: GoogleActionsV2OrdersLineItemUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtension(value: ApiClientObjectMap[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(js.undefined)
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
    def withPrice(value: GoogleActionsV2OrdersPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(js.undefined)
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
  }
  
}

