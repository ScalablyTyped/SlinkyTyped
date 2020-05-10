package typingsSlinky.instagramPrivateApi.usertagsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsertagsFeedResponseFriendshipStatus extends js.Object {
  var following: Boolean = js.native
  var is_bestie: Boolean = js.native
  var is_restricted: Boolean = js.native
  var outgoing_request: Boolean = js.native
}

object UsertagsFeedResponseFriendshipStatus {
  @scala.inline
  def apply(following: Boolean, is_bestie: Boolean, is_restricted: Boolean, outgoing_request: Boolean): UsertagsFeedResponseFriendshipStatus = {
    val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_restricted = is_restricted.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsertagsFeedResponseFriendshipStatus]
  }
  @scala.inline
  implicit class UsertagsFeedResponseFriendshipStatusOps[Self <: UsertagsFeedResponseFriendshipStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFollowing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("following")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_bestie(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_bestie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_restricted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_restricted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutgoing_request(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoing_request")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

