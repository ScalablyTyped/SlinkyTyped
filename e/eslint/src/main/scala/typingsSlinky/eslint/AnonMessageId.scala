package typingsSlinky.eslint

import typingsSlinky.eslint.mod.Rule.ReportDescriptorMessage
import typingsSlinky.eslint.mod.Rule.SuggestionDescriptorMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMessageId
  extends ReportDescriptorMessage
     with SuggestionDescriptorMessage {
  var messageId: String = js.native
}

object AnonMessageId {
  @scala.inline
  def apply(messageId: String): AnonMessageId = {
    val __obj = js.Dynamic.literal(messageId = messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMessageId]
  }
  @scala.inline
  implicit class AnonMessageIdOps[Self <: AnonMessageId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

