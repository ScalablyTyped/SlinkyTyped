package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Invitation extends js.Object {
  /**
    * The account ID of the Security Hub master account that the invitation was sent from.
    */
  var AccountId: js.UndefOr[typingsSlinky.awsSdk.securityhubMod.AccountId] = js.native
  /**
    * The ID of the invitation sent to the member account.
    */
  var InvitationId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The timestamp of when the invitation was sent.
    */
  var InvitedAt: js.UndefOr[js.Date] = js.native
  /**
    * The current status of the association between the member and master accounts.
    */
  var MemberStatus: js.UndefOr[NonEmptyString] = js.native
}

object Invitation {
  @scala.inline
  def apply(): Invitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invitation]
  }
  @scala.inline
  implicit class InvitationOps[Self <: Invitation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withInvitationId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvitationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvitationId")(js.undefined)
        ret
    }
    @scala.inline
    def withInvitedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvitedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvitedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withMemberStatus(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberStatus")(js.undefined)
        ret
    }
  }
  
}

