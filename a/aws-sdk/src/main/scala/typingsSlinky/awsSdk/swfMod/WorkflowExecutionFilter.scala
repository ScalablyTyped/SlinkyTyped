package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowExecutionFilter extends js.Object {
  /**
    * The workflowId to pass of match the criteria of this filter.
    */
  var workflowId: WorkflowId = js.native
}

object WorkflowExecutionFilter {
  @scala.inline
  def apply(workflowId: WorkflowId): WorkflowExecutionFilter = {
    val __obj = js.Dynamic.literal(workflowId = workflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionFilter]
  }
  @scala.inline
  implicit class WorkflowExecutionFilterOps[Self <: WorkflowExecutionFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorkflowId(value: WorkflowId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflowId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

