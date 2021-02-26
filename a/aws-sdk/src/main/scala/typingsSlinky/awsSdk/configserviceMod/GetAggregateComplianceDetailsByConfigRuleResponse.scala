package typingsSlinky.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAggregateComplianceDetailsByConfigRuleResponse extends StObject {
  
  /**
    * Returns an AggregateEvaluationResults object.
    */
  var AggregateEvaluationResults: js.UndefOr[AggregateEvaluationResultList] = js.native
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.NextToken] = js.native
}
object GetAggregateComplianceDetailsByConfigRuleResponse {
  
  @scala.inline
  def apply(): GetAggregateComplianceDetailsByConfigRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAggregateComplianceDetailsByConfigRuleResponse]
  }
  
  @scala.inline
  implicit class GetAggregateComplianceDetailsByConfigRuleResponseMutableBuilder[Self <: GetAggregateComplianceDetailsByConfigRuleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregateEvaluationResults(value: AggregateEvaluationResultList): Self = StObject.set(x, "AggregateEvaluationResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateEvaluationResultsUndefined: Self = StObject.set(x, "AggregateEvaluationResults", js.undefined)
    
    @scala.inline
    def setAggregateEvaluationResultsVarargs(value: AggregateEvaluationResult*): Self = StObject.set(x, "AggregateEvaluationResults", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
