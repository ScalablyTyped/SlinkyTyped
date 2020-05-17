package typingsSlinky.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailboxName extends js.Object {
  var mailboxName: String = js.native
}

object MailboxName {
  @scala.inline
  def apply(mailboxName: String): MailboxName = {
    val __obj = js.Dynamic.literal(mailboxName = mailboxName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailboxName]
  }
  @scala.inline
  implicit class MailboxNameOps[Self <: MailboxName] (val x: Self) extends AnyVal {
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
  }
  
}

