package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendCustomVerificationEmailResponse extends js.Object {
  /**
    * The unique message identifier returned from the SendCustomVerificationEmail operation.
    */
  var MessageId: js.UndefOr[typingsSlinky.awsSdk.sesMod.MessageId] = js.native
}

object SendCustomVerificationEmailResponse {
  @scala.inline
  def apply(): SendCustomVerificationEmailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendCustomVerificationEmailResponse]
  }
  @scala.inline
  implicit class SendCustomVerificationEmailResponseOps[Self <: SendCustomVerificationEmailResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessageId(value: MessageId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageId")(js.undefined)
        ret
    }
  }
  
}

