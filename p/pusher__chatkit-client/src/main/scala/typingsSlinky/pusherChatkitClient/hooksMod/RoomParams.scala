package typingsSlinky.pusherChatkitClient.hooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomParams extends js.Object {
  var roomId: String = js.native
}

object RoomParams {
  @scala.inline
  def apply(roomId: String): RoomParams = {
    val __obj = js.Dynamic.literal(roomId = roomId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomParams]
  }
  @scala.inline
  implicit class RoomParamsOps[Self <: RoomParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoomId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roomId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

