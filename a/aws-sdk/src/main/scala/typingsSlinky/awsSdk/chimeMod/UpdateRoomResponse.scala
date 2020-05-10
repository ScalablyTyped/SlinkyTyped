package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRoomResponse extends js.Object {
  /**
    * The room details.
    */
  var Room: js.UndefOr[typingsSlinky.awsSdk.chimeMod.Room] = js.native
}

object UpdateRoomResponse {
  @scala.inline
  def apply(): UpdateRoomResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRoomResponse]
  }
  @scala.inline
  implicit class UpdateRoomResponseOps[Self <: UpdateRoomResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoom(value: Room): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Room")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Room")(js.undefined)
        ret
    }
  }
  
}

