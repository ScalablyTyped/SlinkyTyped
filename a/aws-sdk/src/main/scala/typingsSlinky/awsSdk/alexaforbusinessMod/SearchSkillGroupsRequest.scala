package typingsSlinky.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchSkillGroupsRequest extends StObject {
  
  /**
    * The filters to use to list a specified set of skill groups. The supported filter key is SkillGroupName. 
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved. 
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.MaxResults] = js.native
  
  /**
    * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults. Required.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.NextToken] = js.native
  
  /**
    * The sort order to use in listing the specified set of skill groups. The supported sort key is SkillGroupName. 
    */
  var SortCriteria: js.UndefOr[SortList] = js.native
}
object SearchSkillGroupsRequest {
  
  @scala.inline
  def apply(): SearchSkillGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchSkillGroupsRequest]
  }
  
  @scala.inline
  implicit class SearchSkillGroupsRequestMutableBuilder[Self <: SearchSkillGroupsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSortCriteria(value: SortList): Self = StObject.set(x, "SortCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortCriteriaUndefined: Self = StObject.set(x, "SortCriteria", js.undefined)
    
    @scala.inline
    def setSortCriteriaVarargs(value: Sort*): Self = StObject.set(x, "SortCriteria", js.Array(value :_*))
  }
}
