package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusDetailFilters extends js.Object {
  /**
    * The 12-digit account ID of the member account within an organization.
    */
  var AccountId: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.AccountId] = js.native
  /**
    * Indicates deployment status for config rule in the member account. When master account calls PutOrganizationConfigRule action for the first time, config rule status is created in the member account. When master account calls PutOrganizationConfigRule action for the second time, config rule status is updated in the member account. Config rule status is deleted when the master account deletes OrganizationConfigRule and disables service access for config-multiaccountsetup.amazonaws.com.  AWS Config sets the state of the rule to:    CREATE_SUCCESSFUL when config rule has been created in the member account.    CREATE_IN_PROGRESS when config rule is being created in the member account.    CREATE_FAILED when config rule creation has failed in the member account.    DELETE_FAILED when config rule deletion has failed in the member account.    DELETE_IN_PROGRESS when config rule is being deleted in the member account.    DELETE_SUCCESSFUL when config rule has been deleted in the member account.    UPDATE_SUCCESSFUL when config rule has been updated in the member account.    UPDATE_IN_PROGRESS when config rule is being updated in the member account.    UPDATE_FAILED when config rule deletion has failed in the member account.  
    */
  var MemberAccountRuleStatus: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.MemberAccountRuleStatus] = js.native
}

object StatusDetailFilters {
  @scala.inline
  def apply(): StatusDetailFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusDetailFilters]
  }
  @scala.inline
  implicit class StatusDetailFiltersOps[Self <: StatusDetailFilters] (val x: Self) extends AnyVal {
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
    def withMemberAccountRuleStatus(value: MemberAccountRuleStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberAccountRuleStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberAccountRuleStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberAccountRuleStatus")(js.undefined)
        ret
    }
  }
  
}

