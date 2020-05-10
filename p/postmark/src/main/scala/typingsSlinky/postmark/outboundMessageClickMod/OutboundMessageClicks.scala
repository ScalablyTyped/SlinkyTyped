package typingsSlinky.postmark.outboundMessageClickMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutboundMessageClicks extends js.Object {
  var Clicks: js.Array[ClickEvent] = js.native
  var TotalCount: Double = js.native
}

object OutboundMessageClicks {
  @scala.inline
  def apply(Clicks: js.Array[ClickEvent], TotalCount: Double): OutboundMessageClicks = {
    val __obj = js.Dynamic.literal(Clicks = Clicks.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutboundMessageClicks]
  }
  @scala.inline
  implicit class OutboundMessageClicksOps[Self <: OutboundMessageClicks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClicks(value: js.Array[ClickEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

