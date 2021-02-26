package typingsSlinky.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationConfigRule extends StObject {
  
  /**
    * A comma-separated list of accounts excluded from organization config rule.
    */
  var ExcludedAccounts: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ExcludedAccounts] = js.native
  
  /**
    * The timestamp of the last update.
    */
  var LastUpdateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * Amazon Resource Name (ARN) of organization config rule.
    */
  var OrganizationConfigRuleArn: StringWithCharLimit256 = js.native
  
  /**
    * The name that you assign to organization config rule.
    */
  var OrganizationConfigRuleName: typingsSlinky.awsSdk.configserviceMod.OrganizationConfigRuleName = js.native
  
  /**
    * An OrganizationCustomRuleMetadata object.
    */
  var OrganizationCustomRuleMetadata: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.OrganizationCustomRuleMetadata] = js.native
  
  /**
    * An OrganizationManagedRuleMetadata object.
    */
  var OrganizationManagedRuleMetadata: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.OrganizationManagedRuleMetadata] = js.native
}
object OrganizationConfigRule {
  
  @scala.inline
  def apply(
    OrganizationConfigRuleArn: StringWithCharLimit256,
    OrganizationConfigRuleName: OrganizationConfigRuleName
  ): OrganizationConfigRule = {
    val __obj = js.Dynamic.literal(OrganizationConfigRuleArn = OrganizationConfigRuleArn.asInstanceOf[js.Any], OrganizationConfigRuleName = OrganizationConfigRuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationConfigRule]
  }
  
  @scala.inline
  implicit class OrganizationConfigRuleMutableBuilder[Self <: OrganizationConfigRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludedAccounts(value: ExcludedAccounts): Self = StObject.set(x, "ExcludedAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedAccountsUndefined: Self = StObject.set(x, "ExcludedAccounts", js.undefined)
    
    @scala.inline
    def setExcludedAccountsVarargs(value: AccountId*): Self = StObject.set(x, "ExcludedAccounts", js.Array(value :_*))
    
    @scala.inline
    def setLastUpdateTime(value: js.Date): Self = StObject.set(x, "LastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTimeUndefined: Self = StObject.set(x, "LastUpdateTime", js.undefined)
    
    @scala.inline
    def setOrganizationConfigRuleArn(value: StringWithCharLimit256): Self = StObject.set(x, "OrganizationConfigRuleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationConfigRuleName(value: OrganizationConfigRuleName): Self = StObject.set(x, "OrganizationConfigRuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationCustomRuleMetadata(value: OrganizationCustomRuleMetadata): Self = StObject.set(x, "OrganizationCustomRuleMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationCustomRuleMetadataUndefined: Self = StObject.set(x, "OrganizationCustomRuleMetadata", js.undefined)
    
    @scala.inline
    def setOrganizationManagedRuleMetadata(value: OrganizationManagedRuleMetadata): Self = StObject.set(x, "OrganizationManagedRuleMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationManagedRuleMetadataUndefined: Self = StObject.set(x, "OrganizationManagedRuleMetadata", js.undefined)
  }
}
