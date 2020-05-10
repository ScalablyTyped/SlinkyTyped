package typingsSlinky.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMailboxDetailsResponse extends js.Object {
  /**
    * The maximum allowed mailbox size, in MB, for the specified user.
    */
  var MailboxQuota: js.UndefOr[typingsSlinky.awsSdk.workmailMod.MailboxQuota] = js.native
  /**
    * The current mailbox size, in MB, for the specified user.
    */
  var MailboxSize: js.UndefOr[typingsSlinky.awsSdk.workmailMod.MailboxSize] = js.native
}

object GetMailboxDetailsResponse {
  @scala.inline
  def apply(): GetMailboxDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMailboxDetailsResponse]
  }
  @scala.inline
  implicit class GetMailboxDetailsResponseOps[Self <: GetMailboxDetailsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMailboxQuota(value: MailboxQuota): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MailboxQuota")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMailboxQuota: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MailboxQuota")(js.undefined)
        ret
    }
    @scala.inline
    def withMailboxSize(value: MailboxSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MailboxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMailboxSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MailboxSize")(js.undefined)
        ret
    }
  }
  
}

