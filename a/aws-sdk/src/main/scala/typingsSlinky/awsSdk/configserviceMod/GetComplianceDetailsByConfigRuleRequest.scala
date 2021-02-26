package typingsSlinky.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetComplianceDetailsByConfigRuleRequest extends StObject {
  
  /**
    * Filters the results by compliance. The allowed values are COMPLIANT, NON_COMPLIANT, and NOT_APPLICABLE.
    */
  var ComplianceTypes: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ComplianceTypes] = js.native
  
  /**
    * The name of the AWS Config rule for which you want compliance information.
    */
  var ConfigRuleName: StringWithCharLimit64 = js.native
  
  /**
    * The maximum number of evaluation results returned on each page. The default is 10. You cannot specify a number greater than 100. If you specify 0, AWS Config uses the default.
    */
  var Limit: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.Limit] = js.native
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.NextToken] = js.native
}
object GetComplianceDetailsByConfigRuleRequest {
  
  @scala.inline
  def apply(ConfigRuleName: StringWithCharLimit64): GetComplianceDetailsByConfigRuleRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComplianceDetailsByConfigRuleRequest]
  }
  
  @scala.inline
  implicit class GetComplianceDetailsByConfigRuleRequestMutableBuilder[Self <: GetComplianceDetailsByConfigRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplianceTypes(value: ComplianceTypes): Self = StObject.set(x, "ComplianceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceTypesUndefined: Self = StObject.set(x, "ComplianceTypes", js.undefined)
    
    @scala.inline
    def setComplianceTypesVarargs(value: ComplianceType*): Self = StObject.set(x, "ComplianceTypes", js.Array(value :_*))
    
    @scala.inline
    def setConfigRuleName(value: StringWithCharLimit64): Self = StObject.set(x, "ConfigRuleName", value.asInstanceOf[js.Any])
    
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
