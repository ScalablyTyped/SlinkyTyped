package typingsSlinky.pusherChatkitClient.currentuserMod

import typingsSlinky.pusherChatkitClient.messageMod.SendMessagePayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendMultipartMessageParams extends js.Object {
  var parts: js.Array[SendMessagePayload] = js.native
  var roomId: String = js.native
}

object SendMultipartMessageParams {
  @scala.inline
  def apply(parts: js.Array[SendMessagePayload], roomId: String): SendMultipartMessageParams = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any], roomId = roomId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMultipartMessageParams]
  }
  @scala.inline
  implicit class SendMultipartMessageParamsOps[Self <: SendMultipartMessageParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParts(value: js.Array[SendMessagePayload]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoomId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roomId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

