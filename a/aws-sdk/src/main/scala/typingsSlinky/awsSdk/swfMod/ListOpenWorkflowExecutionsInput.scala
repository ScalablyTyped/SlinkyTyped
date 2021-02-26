package typingsSlinky.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListOpenWorkflowExecutionsInput extends StObject {
  
  /**
    * The name of the domain that contains the workflow executions to list.
    */
  var domain: DomainName = js.native
  
  /**
    * If specified, only workflow executions matching the workflow ID specified in the filter are returned.   executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var executionFilter: js.UndefOr[WorkflowExecutionFilter] = js.native
  
  /**
    * The maximum number of results that are returned per call. Use nextPageToken to obtain further pages of results. 
    */
  var maximumPageSize: js.UndefOr[PageSize] = js.native
  
  /**
    * If NextPageToken is returned there are more results available. The value of NextPageToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 60 seconds. Using an expired pagination token will return a 400 error: "Specified token has exceeded its maximum lifetime".  The configured maximumPageSize determines how many results can be returned in a single call. 
    */
  var nextPageToken: js.UndefOr[PageToken] = js.native
  
  /**
    * When set to true, returns the results in reverse order. By default the results are returned in descending order of the start time of the executions.
    */
  var reverseOrder: js.UndefOr[ReverseOrder] = js.native
  
  /**
    * Workflow executions are included in the returned results based on whether their start times are within the range specified by this filter.
    */
  var startTimeFilter: ExecutionTimeFilter = js.native
  
  /**
    * If specified, only executions that have the matching tag are listed.   executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var tagFilter: js.UndefOr[TagFilter] = js.native
  
  /**
    * If specified, only executions of the type specified in the filter are returned.   executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var typeFilter: js.UndefOr[WorkflowTypeFilter] = js.native
}
object ListOpenWorkflowExecutionsInput {
  
  @scala.inline
  def apply(domain: DomainName, startTimeFilter: ExecutionTimeFilter): ListOpenWorkflowExecutionsInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], startTimeFilter = startTimeFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOpenWorkflowExecutionsInput]
  }
  
  @scala.inline
  implicit class ListOpenWorkflowExecutionsInputMutableBuilder[Self <: ListOpenWorkflowExecutionsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionFilter(value: WorkflowExecutionFilter): Self = StObject.set(x, "executionFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionFilterUndefined: Self = StObject.set(x, "executionFilter", js.undefined)
    
    @scala.inline
    def setMaximumPageSize(value: PageSize): Self = StObject.set(x, "maximumPageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumPageSizeUndefined: Self = StObject.set(x, "maximumPageSize", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: PageToken): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setReverseOrder(value: ReverseOrder): Self = StObject.set(x, "reverseOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseOrderUndefined: Self = StObject.set(x, "reverseOrder", js.undefined)
    
    @scala.inline
    def setStartTimeFilter(value: ExecutionTimeFilter): Self = StObject.set(x, "startTimeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagFilter(value: TagFilter): Self = StObject.set(x, "tagFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagFilterUndefined: Self = StObject.set(x, "tagFilter", js.undefined)
    
    @scala.inline
    def setTypeFilter(value: WorkflowTypeFilter): Self = StObject.set(x, "typeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeFilterUndefined: Self = StObject.set(x, "typeFilter", js.undefined)
  }
}
