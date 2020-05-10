package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListClosedWorkflowExecutionsInput extends js.Object {
  /**
    * If specified, only workflow executions that match this close status are listed. For example, if TERMINATED is specified, then only TERMINATED workflow executions are listed.   closeStatusFilter, executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var closeStatusFilter: js.UndefOr[CloseStatusFilter] = js.native
  /**
    * If specified, the workflow executions are included in the returned results based on whether their close times are within the range specified by this filter. Also, if this parameter is specified, the returned results are ordered by their close times.   startTimeFilter and closeTimeFilter are mutually exclusive. You must specify one of these in a request but not both. 
    */
  var closeTimeFilter: js.UndefOr[ExecutionTimeFilter] = js.native
  /**
    * The name of the domain that contains the workflow executions to list.
    */
  var domain: DomainName = js.native
  /**
    * If specified, only workflow executions matching the workflow ID specified in the filter are returned.   closeStatusFilter, executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
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
    * When set to true, returns the results in reverse order. By default the results are returned in descending order of the start or the close time of the executions.
    */
  var reverseOrder: js.UndefOr[ReverseOrder] = js.native
  /**
    * If specified, the workflow executions are included in the returned results based on whether their start times are within the range specified by this filter. Also, if this parameter is specified, the returned results are ordered by their start times.   startTimeFilter and closeTimeFilter are mutually exclusive. You must specify one of these in a request but not both. 
    */
  var startTimeFilter: js.UndefOr[ExecutionTimeFilter] = js.native
  /**
    * If specified, only executions that have the matching tag are listed.   closeStatusFilter, executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var tagFilter: js.UndefOr[TagFilter] = js.native
  /**
    * If specified, only executions of the type specified in the filter are returned.   closeStatusFilter, executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var typeFilter: js.UndefOr[WorkflowTypeFilter] = js.native
}

object ListClosedWorkflowExecutionsInput {
  @scala.inline
  def apply(domain: DomainName): ListClosedWorkflowExecutionsInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListClosedWorkflowExecutionsInput]
  }
  @scala.inline
  implicit class ListClosedWorkflowExecutionsInputOps[Self <: ListClosedWorkflowExecutionsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomain(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseStatusFilter(value: CloseStatusFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeStatusFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseStatusFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeStatusFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseTimeFilter(value: ExecutionTimeFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeTimeFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseTimeFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeTimeFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionFilter(value: WorkflowExecutionFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumPageSize(value: PageSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumPageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumPageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: PageToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withReverseOrder(value: ReverseOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverseOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTimeFilter(value: ExecutionTimeFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTimeFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withTagFilter(value: TagFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeFilter(value: WorkflowTypeFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeFilter")(js.undefined)
        ret
    }
  }
  
}

