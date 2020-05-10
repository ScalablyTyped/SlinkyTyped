package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChatInfo extends js.Object {
  var messageId: js.UndefOr[String] = js.native
  var replyChainMessageId: js.UndefOr[String] = js.native
  var threadId: js.UndefOr[String] = js.native
}

object ChatInfo {
  @scala.inline
  def apply(): ChatInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatInfo]
  }
  @scala.inline
  implicit class ChatInfoOps[Self <: ChatInfo] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutMessageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageId")(js.undefined)
        ret
    }
    @scala.inline
    def withReplyChainMessageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyChainMessageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplyChainMessageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyChainMessageId")(js.undefined)
        ret
    }
    @scala.inline
    def withThreadId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threadId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreadId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threadId")(js.undefined)
        ret
    }
  }
  
}

