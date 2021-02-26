package typingsSlinky.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInsightsRequest extends StObject {
  
  /**
    * The ARNs of the insights to describe. If you do not provide any insight ARNs, then GetInsights returns all of your custom insights. It does not return any managed insights.
    */
  var InsightArns: js.UndefOr[ArnList] = js.native
  
  /**
    * The maximum number of items to return in the response.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.securityhubMod.MaxResults] = js.native
  
  /**
    * The token that is required for pagination. On your first call to the GetInsights operation, set the value of this parameter to NULL. For subsequent calls to the operation, to continue listing data, set the value of this parameter to the value returned from the previous response.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.securityhubMod.NextToken] = js.native
}
object GetInsightsRequest {
  
  @scala.inline
  def apply(): GetInsightsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInsightsRequest]
  }
  
  @scala.inline
  implicit class GetInsightsRequestMutableBuilder[Self <: GetInsightsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsightArns(value: ArnList): Self = StObject.set(x, "InsightArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsightArnsUndefined: Self = StObject.set(x, "InsightArns", js.undefined)
    
    @scala.inline
    def setInsightArnsVarargs(value: NonEmptyString*): Self = StObject.set(x, "InsightArns", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
