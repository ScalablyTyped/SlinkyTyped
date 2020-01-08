package typingsSlinky.atPusherChatkitDashClient.messageMod

import typingsSlinky.atPusherChatkitDashClient.userMod.PusherUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageFromPusher extends js.Object {
  var createdAt: js.Date
  var id: String
  var parts: js.Array[MessagePart]
  var sender: PusherUser
}

object MessageFromPusher {
  @scala.inline
  def apply(createdAt: js.Date, id: String, parts: js.Array[MessagePart], sender: PusherUser): MessageFromPusher = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageFromPusher]
  }
}

