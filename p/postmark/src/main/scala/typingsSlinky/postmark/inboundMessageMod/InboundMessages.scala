package typingsSlinky.postmark.inboundMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InboundMessages extends js.Object {
  var InboundMessages: js.Array[InboundMessage] = js.native
  var TotalCount: String = js.native
}

object InboundMessages {
  @scala.inline
  def apply(InboundMessages: js.Array[InboundMessage], TotalCount: String): InboundMessages = {
    val __obj = js.Dynamic.literal(InboundMessages = InboundMessages.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[InboundMessages]
  }
  @scala.inline
  implicit class InboundMessagesOps[Self <: InboundMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInboundMessages(value: js.Array[InboundMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InboundMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

