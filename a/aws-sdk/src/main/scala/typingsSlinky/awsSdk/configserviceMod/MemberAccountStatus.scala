package typingsSlinky.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemberAccountStatus extends StObject {
  
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
  implicit class MemberAccountStatusMutableBuilder[Self <: MemberAccountStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigRuleName(value: StringWithCharLimit64): Self = StObject.set(x, "ConfigRuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCode(value: String): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setLastUpdateTime(value: js.Date): Self = StObject.set(x, "LastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTimeUndefined: Self = StObject.set(x, "LastUpdateTime", js.undefined)
    
    @scala.inline
    def setMemberAccountRuleStatus(value: MemberAccountRuleStatus): Self = StObject.set(x, "MemberAccountRuleStatus", value.asInstanceOf[js.Any])
  }
}
