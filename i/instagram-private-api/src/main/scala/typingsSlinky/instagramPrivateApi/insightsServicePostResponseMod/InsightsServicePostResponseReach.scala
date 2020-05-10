package typingsSlinky.instagramPrivateApi.insightsServicePostResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightsServicePostResponseReach extends js.Object {
  var follow_status: InsightsServicePostResponseFollowStatus = js.native
  var value: Double = js.native
}

object InsightsServicePostResponseReach {
  @scala.inline
  def apply(follow_status: InsightsServicePostResponseFollowStatus, value: Double): InsightsServicePostResponseReach = {
    val __obj = js.Dynamic.literal(follow_status = follow_status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseReach]
  }
  @scala.inline
  implicit class InsightsServicePostResponseReachOps[Self <: InsightsServicePostResponseReach] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFollow_status(value: InsightsServicePostResponseFollowStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

