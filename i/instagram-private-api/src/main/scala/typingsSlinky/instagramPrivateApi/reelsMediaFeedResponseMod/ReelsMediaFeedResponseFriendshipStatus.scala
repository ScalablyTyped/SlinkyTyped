package typingsSlinky.instagramPrivateApi.reelsMediaFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReelsMediaFeedResponseFriendshipStatus extends js.Object {
  var following: Boolean = js.native
  var incoming_request: Boolean = js.native
  var is_bestie: Boolean = js.native
  var is_private: Boolean = js.native
  var outgoing_request: Boolean = js.native
}

object ReelsMediaFeedResponseFriendshipStatus {
  @scala.inline
  def apply(
    following: Boolean,
    incoming_request: Boolean,
    is_bestie: Boolean,
    is_private: Boolean,
    outgoing_request: Boolean
  ): ReelsMediaFeedResponseFriendshipStatus = {
    val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any], incoming_request = incoming_request.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsMediaFeedResponseFriendshipStatus]
  }
  @scala.inline
  implicit class ReelsMediaFeedResponseFriendshipStatusOps[Self <: ReelsMediaFeedResponseFriendshipStatus] (val x: Self) extends AnyVal {
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
    def withIncoming_request(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incoming_request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_bestie(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_bestie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_private(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_private")(value.asInstanceOf[js.Any])
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

