package typingsSlinky.openpgp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var message: typingsSlinky.openpgp.mod.message.Message
}

object Message {
  @scala.inline
  def apply(message: typingsSlinky.openpgp.mod.message.Message): Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

