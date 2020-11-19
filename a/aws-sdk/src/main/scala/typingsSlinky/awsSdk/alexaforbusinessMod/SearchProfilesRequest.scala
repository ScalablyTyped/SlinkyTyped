package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchProfilesRequest extends js.Object {
  
  /**
    * The filters to use to list a specified set of room profiles. Supported filter keys are ProfileName and Address. Required. 
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.MaxResults] = js.native
  
  /**
    * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.NextToken] = js.native
  
  /**
    * The sort order to use in listing the specified set of room profiles. Supported sort keys are ProfileName and Address.
    */
  var SortCriteria: js.UndefOr[SortList] = js.native
}
object SearchProfilesRequest {
  
  @scala.inline
  def apply(): SearchProfilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchProfilesRequest]
  }
  
  @scala.inline
  implicit class SearchProfilesRequestOps[Self <: SearchProfilesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setSortCriteriaVarargs(value: Sort*): Self = this.set("SortCriteria", js.Array(value :_*))
    
    @scala.inline
    def setSortCriteria(value: SortList): Self = this.set("SortCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortCriteria: Self = this.set("SortCriteria", js.undefined)
  }
}
