package typingsSlinky.instagramPrivateApi.friendshipRepositoryChangeResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FriendshipRepositoryChangeResponseRootObject extends js.Object {
  var friendship_status: FriendshipRepositoryChangeResponseFriendshipStatus = js.native
  var status: String = js.native
}

object FriendshipRepositoryChangeResponseRootObject {
  @scala.inline
  def apply(friendship_status: FriendshipRepositoryChangeResponseFriendshipStatus, status: String): FriendshipRepositoryChangeResponseRootObject = {
    val __obj = js.Dynamic.literal(friendship_status = friendship_status.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FriendshipRepositoryChangeResponseRootObject]
  }
  @scala.inline
  implicit class FriendshipRepositoryChangeResponseRootObjectOps[Self <: FriendshipRepositoryChangeResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFriendship_status(value: FriendshipRepositoryChangeResponseFriendshipStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendship_status")(value.asInstanceOf[js.Any])
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

