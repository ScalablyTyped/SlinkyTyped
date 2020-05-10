package typingsSlinky.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiveMessageResult extends js.Object {
  /**
    * A list of messages.
    */
  var Messages: js.UndefOr[MessageList] = js.native
}

object ReceiveMessageResult {
  @scala.inline
  def apply(): ReceiveMessageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReceiveMessageResult]
  }
  @scala.inline
  implicit class ReceiveMessageResultOps[Self <: ReceiveMessageResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessages(value: MessageList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Messages")(js.undefined)
        ret
    }
  }
  
}

