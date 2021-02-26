package typingsSlinky.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConformancePackComplianceDetailsResponse extends StObject {
  
  /**
    * Name of the conformance pack.
    */
  var ConformancePackName: typingsSlinky.awsSdk.configserviceMod.ConformancePackName = js.native
  
  /**
    * Returns a list of ConformancePackEvaluationResult objects.
    */
  var ConformancePackRuleEvaluationResults: js.UndefOr[ConformancePackRuleEvaluationResultsList] = js.native
  
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.NextToken] = js.native
}
object GetConformancePackComplianceDetailsResponse {
  
  @scala.inline
  def apply(ConformancePackName: ConformancePackName): GetConformancePackComplianceDetailsResponse = {
    val __obj = js.Dynamic.literal(ConformancePackName = ConformancePackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConformancePackComplianceDetailsResponse]
  }
  
  @scala.inline
  implicit class GetConformancePackComplianceDetailsResponseMutableBuilder[Self <: GetConformancePackComplianceDetailsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConformancePackName(value: ConformancePackName): Self = StObject.set(x, "ConformancePackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConformancePackRuleEvaluationResults(value: ConformancePackRuleEvaluationResultsList): Self = StObject.set(x, "ConformancePackRuleEvaluationResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConformancePackRuleEvaluationResultsUndefined: Self = StObject.set(x, "ConformancePackRuleEvaluationResults", js.undefined)
    
    @scala.inline
    def setConformancePackRuleEvaluationResultsVarargs(value: ConformancePackEvaluationResult*): Self = StObject.set(x, "ConformancePackRuleEvaluationResults", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
