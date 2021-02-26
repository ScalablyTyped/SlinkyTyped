package typingsSlinky.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatusDetailFilters extends StObject {
  
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
  implicit class StatusDetailFiltersMutableBuilder[Self <: StatusDetailFilters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    @scala.inline
    def setMemberAccountRuleStatus(value: MemberAccountRuleStatus): Self = StObject.set(x, "MemberAccountRuleStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberAccountRuleStatusUndefined: Self = StObject.set(x, "MemberAccountRuleStatus", js.undefined)
  }
}
