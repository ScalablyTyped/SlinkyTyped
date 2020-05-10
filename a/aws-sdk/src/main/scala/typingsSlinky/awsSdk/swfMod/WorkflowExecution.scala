package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowExecution extends js.Object {
  /**
    * A system-generated unique identifier for the workflow execution.
    */
  var runId: WorkflowRunId = js.native
  /**
    * The user defined identifier associated with the workflow execution.
    */
  var workflowId: WorkflowId = js.native
}

object WorkflowExecution {
  @scala.inline
  def apply(runId: WorkflowRunId, workflowId: WorkflowId): WorkflowExecution = {
    val __obj = js.Dynamic.literal(runId = runId.asInstanceOf[js.Any], workflowId = workflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecution]
  }
  @scala.inline
  implicit class WorkflowExecutionOps[Self <: WorkflowExecution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRunId(value: WorkflowRunId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkflowId(value: WorkflowId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflowId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

