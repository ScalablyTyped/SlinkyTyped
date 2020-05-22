package typingsSlinky.eslint.mod.Rule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.eslint.anon.Message
  - typingsSlinky.eslint.anon.MessageId
*/
trait ReportDescriptorMessage extends js.Object

object ReportDescriptorMessage {
  @scala.inline
  def Message(message: String): ReportDescriptorMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportDescriptorMessage]
  }
  @scala.inline
  def MessageId(messageId: String): ReportDescriptorMessage = {
    val __obj = js.Dynamic.literal(messageId = messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportDescriptorMessage]
  }
}

