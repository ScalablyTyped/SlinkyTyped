package typingsSlinky.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightsServiceAccountResponseHashtagsReach extends js.Object {
  var follow_status: InsightsServiceAccountResponseFollowStatus = js.native
  var name: String = js.native
}

object InsightsServiceAccountResponseHashtagsReach {
  @scala.inline
  def apply(follow_status: InsightsServiceAccountResponseFollowStatus, name: String): InsightsServiceAccountResponseHashtagsReach = {
    val __obj = js.Dynamic.literal(follow_status = follow_status.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseHashtagsReach]
  }
  @scala.inline
  implicit class InsightsServiceAccountResponseHashtagsReachOps[Self <: InsightsServiceAccountResponseHashtagsReach] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFollow_status(value: InsightsServiceAccountResponseFollowStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

