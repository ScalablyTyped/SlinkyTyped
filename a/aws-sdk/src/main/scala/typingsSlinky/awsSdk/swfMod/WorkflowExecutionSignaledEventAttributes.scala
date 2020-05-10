package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowExecutionSignaledEventAttributes extends js.Object {
  /**
    * The ID of the SignalExternalWorkflowExecutionInitiated event corresponding to the SignalExternalWorkflow decision to signal this workflow execution.The source event with this ID can be found in the history of the source workflow execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event. This field is set only if the signal was initiated by another workflow execution.
    */
  var externalInitiatedEventId: js.UndefOr[EventId] = js.native
  /**
    * The workflow execution that sent the signal. This is set only of the signal was sent by another workflow execution.
    */
  var externalWorkflowExecution: js.UndefOr[WorkflowExecution] = js.native
  /**
    * The inputs provided with the signal. The decider can use the signal name and inputs to determine how to process the signal.
    */
  var input: js.UndefOr[Data] = js.native
  /**
    * The name of the signal received. The decider can use the signal name and inputs to determine how to the process the signal.
    */
  var signalName: SignalName = js.native
}

object WorkflowExecutionSignaledEventAttributes {
  @scala.inline
  def apply(signalName: SignalName): WorkflowExecutionSignaledEventAttributes = {
    val __obj = js.Dynamic.literal(signalName = signalName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionSignaledEventAttributes]
  }
  @scala.inline
  implicit class WorkflowExecutionSignaledEventAttributesOps[Self <: WorkflowExecutionSignaledEventAttributes] (val x: Self) extends AnyVal {
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
    def withExternalInitiatedEventId(value: EventId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalInitiatedEventId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalInitiatedEventId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalInitiatedEventId")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalWorkflowExecution(value: WorkflowExecution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalWorkflowExecution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalWorkflowExecution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalWorkflowExecution")(js.undefined)
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
  }
  
}

