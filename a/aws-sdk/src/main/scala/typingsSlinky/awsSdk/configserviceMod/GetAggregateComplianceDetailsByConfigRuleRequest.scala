package typingsSlinky.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAggregateComplianceDetailsByConfigRuleRequest extends StObject {
  
  /**
    * The 12-digit account ID of the source account.
    */
  var AccountId: typingsSlinky.awsSdk.configserviceMod.AccountId = js.native
  
  /**
    * The source region from where the data is aggregated.
    */
  var AwsRegion: typingsSlinky.awsSdk.configserviceMod.AwsRegion = js.native
  
  /**
    * The resource compliance status.  For the GetAggregateComplianceDetailsByConfigRuleRequest data type, AWS Config supports only the COMPLIANT and NON_COMPLIANT. AWS Config does not support the NOT_APPLICABLE and INSUFFICIENT_DATA values. 
    */
  var ComplianceType: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ComplianceType] = js.native
  
  /**
    * The name of the AWS Config rule for which you want compliance information.
    */
  var ConfigRuleName: typingsSlinky.awsSdk.configserviceMod.ConfigRuleName = js.native
  
  /**
    * The name of the configuration aggregator.
    */
  var ConfigurationAggregatorName: typingsSlinky.awsSdk.configserviceMod.ConfigurationAggregatorName = js.native
  
  /**
    * The maximum number of evaluation results returned on each page. The default is 50. You cannot specify a number greater than 100. If you specify 0, AWS Config uses the default.
    */
  var Limit: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.Limit] = js.native
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.NextToken] = js.native
}
object GetAggregateComplianceDetailsByConfigRuleRequest {
  
  @scala.inline
  def apply(
    AccountId: AccountId,
    AwsRegion: AwsRegion,
    ConfigRuleName: ConfigRuleName,
    ConfigurationAggregatorName: ConfigurationAggregatorName
  ): GetAggregateComplianceDetailsByConfigRuleRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], AwsRegion = AwsRegion.asInstanceOf[js.Any], ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any], ConfigurationAggregatorName = ConfigurationAggregatorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAggregateComplianceDetailsByConfigRuleRequest]
  }
  
  @scala.inline
  implicit class GetAggregateComplianceDetailsByConfigRuleRequestMutableBuilder[Self <: GetAggregateComplianceDetailsByConfigRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsRegion(value: AwsRegion): Self = StObject.set(x, "AwsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceType(value: ComplianceType): Self = StObject.set(x, "ComplianceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceTypeUndefined: Self = StObject.set(x, "ComplianceType", js.undefined)
    
    @scala.inline
    def setConfigRuleName(value: ConfigRuleName): Self = StObject.set(x, "ConfigRuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationAggregatorName(value: ConfigurationAggregatorName): Self = StObject.set(x, "ConfigurationAggregatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: Limit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
