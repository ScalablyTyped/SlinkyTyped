package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignalExternalWorkflowExecutionDecisionAttributes extends js.Object {
  /**
    * The data attached to the event that can be used by the decider in subsequent decision tasks.
    */
  var control: js.UndefOr[Data] = js.native
  /**
    *  The input data to be provided with the signal. The target workflow execution uses the signal name and input data to process the signal.
    */
  var input: js.UndefOr[Data] = js.native
  /**
    * The runId of the workflow execution to be signaled.
    */
  var runId: js.UndefOr[WorkflowRunIdOptional] = js.native
  /**
    *  The name of the signal.The target workflow execution uses the signal name and input to process the signal.
    */
  var signalName: SignalName = js.native
  /**
    *  The workflowId of the workflow execution to be signaled.
    */
  var workflowId: WorkflowId = js.native
}

object SignalExternalWorkflowExecutionDecisionAttributes {
  @scala.inline
  def apply(signalName: SignalName, workflowId: WorkflowId): SignalExternalWorkflowExecutionDecisionAttributes = {
    val __obj = js.Dynamic.literal(signalName = signalName.asInstanceOf[js.Any], workflowId = workflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalExternalWorkflowExecutionDecisionAttributes]
  }
  @scala.inline
  implicit class SignalExternalWorkflowExecutionDecisionAttributesOps[Self <: SignalExternalWorkflowExecutionDecisionAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

