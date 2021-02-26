package typingsSlinky.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregateComplianceByConfigRule extends StObject {
  
  /**
    * The 12-digit account ID of the source account.
    */
  var AccountId: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.AccountId] = js.native
  
  /**
    * The source region from where the data is aggregated.
    */
  var AwsRegion: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.AwsRegion] = js.native
  
  /**
    * Indicates whether an AWS resource or AWS Config rule is compliant and provides the number of contributors that affect the compliance.
    */
  var Compliance: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.Compliance] = js.native
  
  /**
    * The name of the AWS Config rule.
    */
  var ConfigRuleName: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ConfigRuleName] = js.native
}
object AggregateComplianceByConfigRule {
  
  @scala.inline
  def apply(): AggregateComplianceByConfigRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateComplianceByConfigRule]
  }
  
  @scala.inline
  implicit class AggregateComplianceByConfigRuleMutableBuilder[Self <: AggregateComplianceByConfigRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    @scala.inline
    def setAwsRegion(value: AwsRegion): Self = StObject.set(x, "AwsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsRegionUndefined: Self = StObject.set(x, "AwsRegion", js.undefined)
    
    @scala.inline
    def setCompliance(value: Compliance): Self = StObject.set(x, "Compliance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceUndefined: Self = StObject.set(x, "Compliance", js.undefined)
    
    @scala.inline
    def setConfigRuleName(value: ConfigRuleName): Self = StObject.set(x, "ConfigRuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigRuleNameUndefined: Self = StObject.set(x, "ConfigRuleName", js.undefined)
  }
}
