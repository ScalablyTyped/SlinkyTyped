package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountOpenWorkflowExecutionsInput extends js.Object {
  /**
    * The name of the domain containing the workflow executions to count.
    */
  var domain: DomainName = js.native
  /**
    * If specified, only workflow executions matching the WorkflowId in the filter are counted.   executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var executionFilter: js.UndefOr[WorkflowExecutionFilter] = js.native
  /**
    * Specifies the start time criteria that workflow executions must meet in order to be counted.
    */
  var startTimeFilter: ExecutionTimeFilter = js.native
  /**
    * If specified, only executions that have a tag that matches the filter are counted.   executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var tagFilter: js.UndefOr[TagFilter] = js.native
  /**
    * Specifies the type of the workflow executions to be counted.   executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var typeFilter: js.UndefOr[WorkflowTypeFilter] = js.native
}

object CountOpenWorkflowExecutionsInput {
  @scala.inline
  def apply(domain: DomainName, startTimeFilter: ExecutionTimeFilter): CountOpenWorkflowExecutionsInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], startTimeFilter = startTimeFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountOpenWorkflowExecutionsInput]
  }
  @scala.inline
  implicit class CountOpenWorkflowExecutionsInputOps[Self <: CountOpenWorkflowExecutionsInput] (val x: Self) extends AnyVal {
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
    def withStartTimeFilter(value: ExecutionTimeFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeFilter")(value.asInstanceOf[js.Any])
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

