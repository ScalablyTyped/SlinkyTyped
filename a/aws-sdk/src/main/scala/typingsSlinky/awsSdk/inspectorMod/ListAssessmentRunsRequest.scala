package typingsSlinky.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAssessmentRunsRequest extends StObject {
  
  /**
    * The ARNs that specify the assessment templates whose assessment runs you want to list.
    */
  var assessmentTemplateArns: js.UndefOr[ListParentArnList] = js.native
  
  /**
    * You can use this parameter to specify a subset of data to be included in the action's response. For a record to match a filter, all specified filter attributes must match. When multiple values are specified for a filter attribute, any of the values can match.
    */
  var filter: js.UndefOr[AssessmentRunFilter] = js.native
  
  /**
    * You can use this parameter to indicate the maximum number of items that you want in the response. The default value is 10. The maximum value is 500.
    */
  var maxResults: js.UndefOr[ListMaxResults] = js.native
  
  /**
    * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the ListAssessmentRuns action. Subsequent calls to the action fill nextToken in the request with the value of NextToken from the previous response to continue listing data.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}
object ListAssessmentRunsRequest {
  
  @scala.inline
  def apply(): ListAssessmentRunsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssessmentRunsRequest]
  }
  
  @scala.inline
  implicit class ListAssessmentRunsRequestMutableBuilder[Self <: ListAssessmentRunsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssessmentTemplateArns(value: ListParentArnList): Self = StObject.set(x, "assessmentTemplateArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssessmentTemplateArnsUndefined: Self = StObject.set(x, "assessmentTemplateArns", js.undefined)
    
    @scala.inline
    def setAssessmentTemplateArnsVarargs(value: Arn*): Self = StObject.set(x, "assessmentTemplateArns", js.Array(value :_*))
    
    @scala.inline
    def setFilter(value: AssessmentRunFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setMaxResults(value: ListMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
