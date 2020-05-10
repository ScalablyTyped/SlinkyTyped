package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignalWorkflowExecutionInput extends js.Object {
  /**
    * The name of the domain containing the workflow execution to signal.
    */
  var domain: DomainName = js.native
  /**
    * Data to attach to the WorkflowExecutionSignaled event in the target workflow execution's history.
    */
  var input: js.UndefOr[Data] = js.native
  /**
    * The runId of the workflow execution to signal.
    */
  var runId: js.UndefOr[WorkflowRunIdOptional] = js.native
  /**
    * The name of the signal. This name must be meaningful to the target workflow.
    */
  var signalName: SignalName = js.native
  /**
    * The workflowId of the workflow execution to signal.
    */
  var workflowId: WorkflowId = js.native
}

object SignalWorkflowExecutionInput {
  @scala.inline
  def apply(domain: DomainName, signalName: SignalName, workflowId: WorkflowId): SignalWorkflowExecutionInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], signalName = signalName.asInstanceOf[js.Any], workflowId = workflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalWorkflowExecutionInput]
  }
  @scala.inline
  implicit class SignalWorkflowExecutionInputOps[Self <: SignalWorkflowExecutionInput] (val x: Self) extends AnyVal {
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
    def withSignalName(value: SignalName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkflowId(value: WorkflowId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflowId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: Data): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
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

