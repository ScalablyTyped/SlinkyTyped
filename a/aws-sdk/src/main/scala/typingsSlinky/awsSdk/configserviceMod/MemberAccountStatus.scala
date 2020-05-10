package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberAccountStatus extends js.Object {
  /**
    * The 12-digit account ID of a member account.
    */
  var AccountId: typingsSlinky.awsSdk.configserviceMod.AccountId = js.native
  /**
    * The name of config rule deployed in the member account.
    */
  var ConfigRuleName: StringWithCharLimit64 = js.native
  /**
    * An error code that is returned when config rule creation or deletion failed in the member account.
    */
  var ErrorCode: js.UndefOr[String] = js.native
  /**
    * An error message indicating that config rule account creation or deletion has failed due to an error in the member account.
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  /**
    * The timestamp of the last status update.
    */
  var LastUpdateTime: js.UndefOr[js.Date] = js.native
  /**
    * Indicates deployment status for config rule in the member account. When master account calls PutOrganizationConfigRule action for the first time, config rule status is created in the member account. When master account calls PutOrganizationConfigRule action for the second time, config rule status is updated in the member account. Config rule status is deleted when the master account deletes OrganizationConfigRule and disables service access for config-multiaccountsetup.amazonaws.com.   AWS Config sets the state of the rule to:    CREATE_SUCCESSFUL when config rule has been created in the member account.     CREATE_IN_PROGRESS when config rule is being created in the member account.    CREATE_FAILED when config rule creation has failed in the member account.    DELETE_FAILED when config rule deletion has failed in the member account.    DELETE_IN_PROGRESS when config rule is being deleted in the member account.    DELETE_SUCCESSFUL when config rule has been deleted in the member account.     UPDATE_SUCCESSFUL when config rule has been updated in the member account.    UPDATE_IN_PROGRESS when config rule is being updated in the member account.    UPDATE_FAILED when config rule deletion has failed in the member account.  
    */
  var MemberAccountRuleStatus: typingsSlinky.awsSdk.configserviceMod.MemberAccountRuleStatus = js.native
}

object MemberAccountStatus {
  @scala.inline
  def apply(
    AccountId: AccountId,
    ConfigRuleName: StringWithCharLimit64,
    MemberAccountRuleStatus: MemberAccountRuleStatus
  ): MemberAccountStatus = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any], MemberAccountRuleStatus = MemberAccountRuleStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberAccountStatus]
  }
  @scala.inline
  implicit class MemberAccountStatusOps[Self <: MemberAccountStatus] (val x: Self) extends AnyVal {
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
    def withConfigRuleName(value: StringWithCharLimit64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemberAccountRuleStatus(value: MemberAccountRuleStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberAccountRuleStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdateTime")(js.undefined)
        ret
    }
  }
  
}

