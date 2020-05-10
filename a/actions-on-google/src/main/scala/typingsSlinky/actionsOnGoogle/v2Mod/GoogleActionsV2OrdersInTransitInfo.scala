package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2OrdersInTransitInfo extends js.Object {
  /**
    * Last updated time for in transit.
    */
  var updatedTime: js.UndefOr[String] = js.native
}

object GoogleActionsV2OrdersInTransitInfo {
  @scala.inline
  def apply(): GoogleActionsV2OrdersInTransitInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersInTransitInfo]
  }
  @scala.inline
  implicit class GoogleActionsV2OrdersInTransitInfoOps[Self <: GoogleActionsV2OrdersInTransitInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpdatedTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedTime")(js.undefined)
        ret
    }
  }
  
}

