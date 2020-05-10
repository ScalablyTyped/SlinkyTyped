package typingsSlinky.instagramPrivateApi.friendshipRepositoryShowResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FriendshipRepositoryShowResponseRootObject extends js.Object {
  var blocking: Boolean = js.native
  var followed_by: Boolean = js.native
  var following: Boolean = js.native
  var incoming_request: Boolean = js.native
  var is_bestie: Boolean = js.native
  var is_blocking_reel: Boolean = js.native
  var is_muting_reel: Boolean = js.native
  var is_private: Boolean = js.native
  var muting: Boolean = js.native
  var outgoing_request: Boolean = js.native
  var status: String = js.native
}

object FriendshipRepositoryShowResponseRootObject {
  @scala.inline
  def apply(
    blocking: Boolean,
    followed_by: Boolean,
    following: Boolean,
    incoming_request: Boolean,
    is_bestie: Boolean,
    is_blocking_reel: Boolean,
    is_muting_reel: Boolean,
    is_private: Boolean,
    muting: Boolean,
    outgoing_request: Boolean,
    status: String
  ): FriendshipRepositoryShowResponseRootObject = {
    val __obj = js.Dynamic.literal(blocking = blocking.asInstanceOf[js.Any], followed_by = followed_by.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], incoming_request = incoming_request.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_blocking_reel = is_blocking_reel.asInstanceOf[js.Any], is_muting_reel = is_muting_reel.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], muting = muting.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FriendshipRepositoryShowResponseRootObject]
  }
  @scala.inline
  implicit class FriendshipRepositoryShowResponseRootObjectOps[Self <: FriendshipRepositoryShowResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlocking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollowed_by(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followed_by")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withIs_blocking_reel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_blocking_reel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_muting_reel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_muting_reel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_private(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_private")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMuting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutgoing_request(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoing_request")(value.asInstanceOf[js.Any])
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

