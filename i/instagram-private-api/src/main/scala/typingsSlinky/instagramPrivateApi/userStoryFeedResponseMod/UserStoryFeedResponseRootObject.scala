package typingsSlinky.instagramPrivateApi.userStoryFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserStoryFeedResponseRootObject extends js.Object {
  var broadcast: Null = js.native
  var reel: UserStoryFeedResponseReel = js.native
  var status: String = js.native
}

object UserStoryFeedResponseRootObject {
  @scala.inline
  def apply(broadcast: Null, reel: UserStoryFeedResponseReel, status: String): UserStoryFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(broadcast = broadcast.asInstanceOf[js.Any], reel = reel.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserStoryFeedResponseRootObject]
  }
  @scala.inline
  implicit class UserStoryFeedResponseRootObjectOps[Self <: UserStoryFeedResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBroadcast(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReel(value: UserStoryFeedResponseReel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reel")(value.asInstanceOf[js.Any])
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

