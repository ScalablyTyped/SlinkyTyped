package typingsSlinky.pusherChatkitClient.messageMod

import typingsSlinky.pusherChatkitClient.pusherChatkitClientStrings.`inline`
import typingsSlinky.pusherChatkitClient.pusherChatkitClientStrings.attachment
import typingsSlinky.pusherChatkitClient.pusherChatkitClientStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagePart extends js.Object {
  var partType: `inline` | url | attachment
  var payload: MessagePayload
}

object MessagePart {
  @scala.inline
  def apply(partType: `inline` | url | attachment, payload: MessagePayload): MessagePart = {
    val __obj = js.Dynamic.literal(partType = partType.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePart]
  }
}

