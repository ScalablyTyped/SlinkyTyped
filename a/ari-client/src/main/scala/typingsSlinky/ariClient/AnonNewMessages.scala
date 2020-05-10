package typingsSlinky.ariClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNewMessages extends js.Object {
  var mailboxName: String = js.native
  var newMessages: Double = js.native
  var oldMessages: Double = js.native
}

object AnonNewMessages {
  @scala.inline
  def apply(mailboxName: String, newMessages: Double, oldMessages: Double): AnonNewMessages = {
    val __obj = js.Dynamic.literal(mailboxName = mailboxName.asInstanceOf[js.Any], newMessages = newMessages.asInstanceOf[js.Any], oldMessages = oldMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNewMessages]
  }
  @scala.inline
  implicit class AnonNewMessagesOps[Self <: AnonNewMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMailboxName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailboxName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewMessages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldMessages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldMessages")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

