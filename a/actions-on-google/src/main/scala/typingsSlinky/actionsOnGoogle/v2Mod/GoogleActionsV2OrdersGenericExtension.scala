package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2OrdersGenericExtension extends js.Object {
  /**
    * Locations associated with the order. Up to 2 locations.
    */
  var locations: js.UndefOr[js.Array[GoogleActionsV2OrdersOrderLocation]] = js.native
  /**
    * Time indicator associated with the proposed order.
    */
  var time: js.UndefOr[GoogleActionsV2OrdersTime] = js.native
}

object GoogleActionsV2OrdersGenericExtension {
  @scala.inline
  def apply(): GoogleActionsV2OrdersGenericExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersGenericExtension]
  }
  @scala.inline
  implicit class GoogleActionsV2OrdersGenericExtensionOps[Self <: GoogleActionsV2OrdersGenericExtension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocations(value: js.Array[GoogleActionsV2OrdersOrderLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: GoogleActionsV2OrdersTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
  }
  
}

