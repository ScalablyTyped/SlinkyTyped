package typingsSlinky.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFindingsRequest extends StObject {
  
  /**
    * The finding attributes used to define a condition to filter the returned findings. You can filter by up to 10 finding attributes. For each attribute, you can provide up to 20 filter values. Note that in the available filter fields, WorkflowState is deprecated. To search for a finding based on its workflow status, use WorkflowStatus.
    */
  var Filters: js.UndefOr[AwsSecurityFindingFilters] = js.native
  
  /**
    * The maximum number of findings to return.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.securityhubMod.MaxResults] = js.native
  
  /**
    * The token that is required for pagination. On your first call to the GetFindings operation, set the value of this parameter to NULL. For subsequent calls to the operation, to continue listing data, set the value of this parameter to the value returned from the previous response.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.securityhubMod.NextToken] = js.native
  
  /**
    * The finding attributes used to sort the list of returned findings.
    */
  var SortCriteria: js.UndefOr[typingsSlinky.awsSdk.securityhubMod.SortCriteria] = js.native
}
object GetFindingsRequest {
  
  @scala.inline
  def apply(): GetFindingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFindingsRequest]
  }
  
  @scala.inline
  implicit class GetFindingsRequestMutableBuilder[Self <: GetFindingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: AwsSecurityFindingFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSortCriteria(value: SortCriteria): Self = StObject.set(x, "SortCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortCriteriaUndefined: Self = StObject.set(x, "SortCriteria", js.undefined)
    
    @scala.inline
    def setSortCriteriaVarargs(value: SortCriterion*): Self = StObject.set(x, "SortCriteria", js.Array(value :_*))
  }
}
