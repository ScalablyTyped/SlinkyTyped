package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestCancelWorkflowExecutionInput extends js.Object {
  /**
    * The name of the domain containing the workflow execution to cancel.
    */
  var domain: DomainName = js.native
  /**
    * The runId of the workflow execution to cancel.
    */
  var runId: js.UndefOr[WorkflowRunIdOptional] = js.native
  /**
    * The workflowId of the workflow execution to cancel.
    */
  var workflowId: WorkflowId = js.native
}

object RequestCancelWorkflowExecutionInput {
  @scala.inline
  def apply(domain: DomainName, workflowId: WorkflowId): RequestCancelWorkflowExecutionInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], workflowId = workflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestCancelWorkflowExecutionInput]
  }
  @scala.inline
  implicit class RequestCancelWorkflowExecutionInputOps[Self <: RequestCancelWorkflowExecutionInput] (val x: Self) extends AnyVal {
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
    def withWorkflowId(value: WorkflowId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflowId")(value.asInstanceOf[js.Any])
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

