package typingsSlinky.instagramPrivateApi.usertagsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsertagsFeedResponseInItem extends js.Object {
  var duration_in_video_in_sec: Null = js.native
  var position: js.Array[Double | String] = js.native
  var start_time_in_video_in_sec: Null = js.native
  var user: UsertagsFeedResponseUser = js.native
}

object UsertagsFeedResponseInItem {
  @scala.inline
  def apply(
    duration_in_video_in_sec: Null,
    position: js.Array[Double | String],
    start_time_in_video_in_sec: Null,
    user: UsertagsFeedResponseUser
  ): UsertagsFeedResponseInItem = {
    val __obj = js.Dynamic.literal(duration_in_video_in_sec = duration_in_video_in_sec.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], start_time_in_video_in_sec = start_time_in_video_in_sec.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsertagsFeedResponseInItem]
  }
  @scala.inline
  implicit class UsertagsFeedResponseInItemOps[Self <: UsertagsFeedResponseInItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration_in_video_in_sec(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration_in_video_in_sec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: js.Array[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart_time_in_video_in_sec(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_time_in_video_in_sec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: UsertagsFeedResponseUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

