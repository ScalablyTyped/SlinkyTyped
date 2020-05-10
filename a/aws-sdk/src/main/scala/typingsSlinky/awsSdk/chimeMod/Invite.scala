package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Invite extends js.Object {
  /**
    * The email address to which the invite is sent.
    */
  var EmailAddress: js.UndefOr[typingsSlinky.awsSdk.chimeMod.EmailAddress] = js.native
  /**
    * The status of the invite email.
    */
  var EmailStatus: js.UndefOr[typingsSlinky.awsSdk.chimeMod.EmailStatus] = js.native
  /**
    * The invite ID.
    */
  var InviteId: js.UndefOr[String] = js.native
  /**
    * The status of the invite.
    */
  var Status: js.UndefOr[InviteStatus] = js.native
}

object Invite {
  @scala.inline
  def apply(): Invite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invite]
  }
  @scala.inline
  implicit class InviteOps[Self <: Invite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmailAddress(value: EmailAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailStatus(value: EmailStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withInviteId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InviteId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInviteId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InviteId")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: InviteStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

