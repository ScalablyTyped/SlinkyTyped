package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2OrdersFulfillmentInfo extends js.Object {
  /**
    * When the order will be fulfilled.
    */
  var deliveryTime: js.UndefOr[String] = js.native
}

object GoogleActionsV2OrdersFulfillmentInfo {
  @scala.inline
  def apply(): GoogleActionsV2OrdersFulfillmentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersFulfillmentInfo]
  }
  @scala.inline
  implicit class GoogleActionsV2OrdersFulfillmentInfoOps[Self <: GoogleActionsV2OrdersFulfillmentInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliveryTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryTime")(js.undefined)
        ret
    }
  }
  
}

