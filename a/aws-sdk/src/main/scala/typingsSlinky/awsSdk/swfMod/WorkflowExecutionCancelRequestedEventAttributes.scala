package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowExecutionCancelRequestedEventAttributes extends js.Object {
  /**
    * If set, indicates that the request to cancel the workflow execution was automatically generated, and specifies the cause. This happens if the parent workflow execution times out or is terminated, and the child policy is set to cancel child executions.
    */
  var cause: js.UndefOr[WorkflowExecutionCancelRequestedCause] = js.native
  /**
    * The ID of the RequestCancelExternalWorkflowExecutionInitiated event corresponding to the RequestCancelExternalWorkflowExecution decision to cancel this workflow execution.The source event with this ID can be found in the history of the source workflow execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var externalInitiatedEventId: js.UndefOr[EventId] = js.native
  /**
    * The external workflow execution for which the cancellation was requested.
    */
  var externalWorkflowExecution: js.UndefOr[WorkflowExecution] = js.native
}

object WorkflowExecutionCancelRequestedEventAttributes {
  @scala.inline
  def apply(): WorkflowExecutionCancelRequestedEventAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowExecutionCancelRequestedEventAttributes]
  }
  @scala.inline
  implicit class WorkflowExecutionCancelRequestedEventAttributesOps[Self <: WorkflowExecutionCancelRequestedEventAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCause(value: WorkflowExecutionCancelRequestedCause): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cause")(js.undefined)
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
  }
  
}

