package typingsSlinky.instagramPrivateApi.reelsMediaFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReelsMediaFeedResponseRootObject extends js.Object {
  var reels: ReelsMediaFeedResponseReels = js.native
  var status: String = js.native
}

object ReelsMediaFeedResponseRootObject {
  @scala.inline
  def apply(reels: ReelsMediaFeedResponseReels, status: String): ReelsMediaFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(reels = reels.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsMediaFeedResponseRootObject]
  }
  @scala.inline
  implicit class ReelsMediaFeedResponseRootObjectOps[Self <: ReelsMediaFeedResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReels(value: ReelsMediaFeedResponseReels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

