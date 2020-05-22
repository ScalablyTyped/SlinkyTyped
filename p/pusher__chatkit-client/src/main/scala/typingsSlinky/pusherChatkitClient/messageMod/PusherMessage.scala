package typingsSlinky.pusherChatkitClient.messageMod

import typingsSlinky.pusherChatkitClient.roomMod.PusherRoom
import typingsSlinky.pusherChatkitClient.userMod.PusherUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PusherMessage extends js.Object {
  var createdAt: js.Date
  var id: Double
  var parts: js.Array[MessagePart]
  var room: PusherRoom
  var sender: PusherUser
  var updatedAt: js.Date
}

object PusherMessage {
  @scala.inline
  def apply(
    createdAt: js.Date,
    id: Double,
    parts: js.Array[MessagePart],
    room: PusherRoom,
    sender: PusherUser,
    updatedAt: js.Date
  ): PusherMessage = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[PusherMessage]
  }
}

