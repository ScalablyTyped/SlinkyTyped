package typingsSlinky.matrixJsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRoomOptions extends js.Object {
  var invite: js.Array[String]
    //  <string> A list of user IDs to invite to this room.
  var name: String
           //  The name to give this room.
  var room_alias_name: String
           //  The alias localpart to assign to this room.
  var topic: String
           //  The topic to give this room.
  var visibility: String
}

object CreateRoomOptions {
  @scala.inline
  def apply(invite: js.Array[String], name: String, room_alias_name: String, topic: String, visibility: String): CreateRoomOptions = {
    val __obj = js.Dynamic.literal(invite = invite.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], room_alias_name = room_alias_name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateRoomOptions]
  }
}

