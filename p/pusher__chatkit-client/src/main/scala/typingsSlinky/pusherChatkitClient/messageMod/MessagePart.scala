package typingsSlinky.pusherChatkitClient.messageMod

import typingsSlinky.pusherChatkitClient.pusherChatkitClientStrings.`inline`
import typingsSlinky.pusherChatkitClient.pusherChatkitClientStrings.attachment
import typingsSlinky.pusherChatkitClient.pusherChatkitClientStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagePart extends js.Object {
  var partType: `inline` | url | attachment = js.native
  var payload: MessagePayload = js.native
}

object MessagePart {
  @scala.inline
  def apply(partType: `inline` | url | attachment, payload: MessagePayload): MessagePart = {
    val __obj = js.Dynamic.literal(partType = partType.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePart]
  }
  @scala.inline
  implicit class MessagePartOps[Self <: MessagePart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPartType(value: `inline` | url | attachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: MessagePayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

