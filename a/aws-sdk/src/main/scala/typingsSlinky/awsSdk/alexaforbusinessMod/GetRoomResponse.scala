package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRoomResponse extends js.Object {
  /**
    * The details of the room requested.
    */
  var Room: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.Room] = js.native
}

object GetRoomResponse {
  @scala.inline
  def apply(): GetRoomResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRoomResponse]
  }
  @scala.inline
  implicit class GetRoomResponseOps[Self <: GetRoomResponse] (val x: Self) extends AnyVal {
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

