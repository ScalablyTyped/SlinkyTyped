package typingsSlinky.matrixAppserviceBridge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomInfo extends js.Object {
  var id: String = js.native
         // The raw state events for this room
  var realJoinedUsers: js.Array[String] = js.native
    //  A list of user IDs of real matrix users that have joined this room.
  var remoteJoinedUsers: js.Array[String] = js.native
           // The matrix room ID
  var state: js.Array[js.Object] = js.native
}

object RoomInfo {
  @scala.inline
  def apply(
    id: String,
    realJoinedUsers: js.Array[String],
    remoteJoinedUsers: js.Array[String],
    state: js.Array[js.Object]
  ): RoomInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], realJoinedUsers = realJoinedUsers.asInstanceOf[js.Any], remoteJoinedUsers = remoteJoinedUsers.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomInfo]
  }
  @scala.inline
  implicit class RoomInfoOps[Self <: RoomInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRealJoinedUsers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realJoinedUsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteJoinedUsers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteJoinedUsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

