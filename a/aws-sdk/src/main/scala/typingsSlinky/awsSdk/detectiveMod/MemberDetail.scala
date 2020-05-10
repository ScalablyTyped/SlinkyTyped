package typingsSlinky.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberDetail extends js.Object {
  /**
    * The AWS account identifier for the member account.
    */
  var AccountId: js.UndefOr[typingsSlinky.awsSdk.detectiveMod.AccountId] = js.native
  /**
    * The AWS account root user email address for the member account.
    */
  var EmailAddress: js.UndefOr[typingsSlinky.awsSdk.detectiveMod.EmailAddress] = js.native
  /**
    * The ARN of the behavior graph that the member account was invited to.
    */
  var GraphArn: js.UndefOr[typingsSlinky.awsSdk.detectiveMod.GraphArn] = js.native
  /**
    * The date and time that Detective sent the invitation to the member account. The value is in milliseconds since the epoch.
    */
  var InvitedTime: js.UndefOr[js.Date] = js.native
  /**
    * The AWS account identifier of the master account for the behavior graph.
    */
  var MasterId: js.UndefOr[AccountId] = js.native
  /**
    * The current membership status of the member account. The status can have one of the following values:    INVITED - Indicates that the member was sent an invitation but has not yet responded.    VERIFICATION_IN_PROGRESS - Indicates that Detective is verifying that the account identifier and email address provided for the member account match. If they do match, then Detective sends the invitation. If the email address and account identifier don't match, then the member cannot be added to the behavior graph.    VERIFICATION_FAILED - Indicates that the account and email address provided for the member account do not match, and Detective did not send an invitation to the account.    ENABLED - Indicates that the member account accepted the invitation to contribute to the behavior graph.   Member accounts that declined an invitation or that were removed from the behavior graph are not included.
    */
  var Status: js.UndefOr[MemberStatus] = js.native
  /**
    * The date and time that the member account was last updated. The value is in milliseconds since the epoch.
    */
  var UpdatedTime: js.UndefOr[js.Date] = js.native
}

object MemberDetail {
  @scala.inline
  def apply(): MemberDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberDetail]
  }
  @scala.inline
  implicit class MemberDetailOps[Self <: MemberDetail] (val x: Self) extends AnyVal {
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
    def withGraphArn(value: GraphArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GraphArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraphArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GraphArn")(js.undefined)
        ret
    }
    @scala.inline
    def withInvitedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvitedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvitedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterId(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MasterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MasterId")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: MemberStatus): Self = {
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
    @scala.inline
    def withUpdatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedTime")(js.undefined)
        ret
    }
  }
  
}

