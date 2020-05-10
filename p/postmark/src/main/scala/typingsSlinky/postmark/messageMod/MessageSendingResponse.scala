package typingsSlinky.postmark.messageMod

import typingsSlinky.postmark.defaultResponseMod.DefaultResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageSendingResponse extends DefaultResponse {
  var Bcc: js.UndefOr[String] = js.native
  var Cc: js.UndefOr[String] = js.native
  var MessageID: String = js.native
  var SubmittedAt: String = js.native
  var To: js.UndefOr[String] = js.native
}

object MessageSendingResponse {
  @scala.inline
  def apply(ErrorCode: Double, Message: String, MessageID: String, SubmittedAt: String): MessageSendingResponse = {
    val __obj = js.Dynamic.literal(ErrorCode = ErrorCode.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], SubmittedAt = SubmittedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageSendingResponse]
  }
  @scala.inline
  implicit class MessageSendingResponseOps[Self <: MessageSendingResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessageID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubmittedAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmittedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBcc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bcc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBcc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bcc")(js.undefined)
        ret
    }
    @scala.inline
    def withCc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cc")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("To")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("To")(js.undefined)
        ret
    }
  }
  
}

