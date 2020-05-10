package typingsSlinky.pusherChatkitClient.roomMod

import typingsSlinky.pusherChatkitClient.userMod.PusherUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PusherRoom extends js.Object {
  var createdAt: String = js.native
  var createdByUserId: String = js.native
  var customData: js.UndefOr[js.Any] = js.native
  var id: String = js.native
  var isPrivate: Boolean = js.native
  var lastMessageAt: String = js.native
  var name: String = js.native
  var unreadCount: Double = js.native
  var updatedAt: String = js.native
  var users: js.Array[PusherUser] = js.native
}

object PusherRoom {
  @scala.inline
  def apply(
    createdAt: String,
    createdByUserId: String,
    id: String,
    isPrivate: Boolean,
    lastMessageAt: String,
    name: String,
    unreadCount: Double,
    updatedAt: String,
    users: js.Array[PusherUser]
  ): PusherRoom = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], createdByUserId = createdByUserId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isPrivate = isPrivate.asInstanceOf[js.Any], lastMessageAt = lastMessageAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], unreadCount = unreadCount.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[PusherRoom]
  }
  @scala.inline
  implicit class PusherRoomOps[Self <: PusherRoom] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedByUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdByUserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPrivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrivate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastMessageAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastMessageAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnreadCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unreadCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsers(value: js.Array[PusherUser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customData")(js.undefined)
        ret
    }
  }
  
}

