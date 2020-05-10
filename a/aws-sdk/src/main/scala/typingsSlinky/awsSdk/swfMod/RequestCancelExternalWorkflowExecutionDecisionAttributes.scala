package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestCancelExternalWorkflowExecutionDecisionAttributes extends js.Object {
  /**
    * The data attached to the event that can be used by the decider in subsequent workflow tasks.
    */
  var control: js.UndefOr[Data] = js.native
  /**
    * The runId of the external workflow execution to cancel.
    */
  var runId: js.UndefOr[WorkflowRunIdOptional] = js.native
  /**
    *  The workflowId of the external workflow execution to cancel.
    */
  var workflowId: WorkflowId = js.native
}

object RequestCancelExternalWorkflowExecutionDecisionAttributes {
  @scala.inline
  def apply(workflowId: WorkflowId): RequestCancelExternalWorkflowExecutionDecisionAttributes = {
    val __obj = js.Dynamic.literal(workflowId = workflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestCancelExternalWorkflowExecutionDecisionAttributes]
  }
  @scala.inline
  implicit class RequestCancelExternalWorkflowExecutionDecisionAttributesOps[Self <: RequestCancelExternalWorkflowExecutionDecisionAttributes] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withControl(value: Data): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(js.undefined)
        ret
    }
    @scala.inline
    def withRunId(value: WorkflowRunIdOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runId")(js.undefined)
        ret
    }
  }
  
}

