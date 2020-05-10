package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendBounceResponse extends js.Object {
  /**
    * The message ID of the bounce message.
    */
  var MessageId: js.UndefOr[typingsSlinky.awsSdk.sesMod.MessageId] = js.native
}

object SendBounceResponse {
  @scala.inline
  def apply(): SendBounceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendBounceResponse]
  }
  @scala.inline
  implicit class SendBounceResponseOps[Self <: SendBounceResponse] (val x: Self) extends AnyVal {
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

