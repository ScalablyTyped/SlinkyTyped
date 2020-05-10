package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowExecutionTimedOutEventAttributes extends js.Object {
  /**
    * The policy used for the child workflow executions of this workflow execution. The supported child policies are:    TERMINATE – The child executions are terminated.    REQUEST_CANCEL – A request to cancel is attempted for each child execution by recording a WorkflowExecutionCancelRequested event in its history. It is up to the decider to take appropriate actions when it receives an execution history with this event.    ABANDON – No action is taken. The child executions continue to run.  
    */
  var childPolicy: ChildPolicy = js.native
  /**
    * The type of timeout that caused this event.
    */
  var timeoutType: WorkflowExecutionTimeoutType = js.native
}

object WorkflowExecutionTimedOutEventAttributes {
  @scala.inline
  def apply(childPolicy: ChildPolicy, timeoutType: WorkflowExecutionTimeoutType): WorkflowExecutionTimedOutEventAttributes = {
    val __obj = js.Dynamic.literal(childPolicy = childPolicy.asInstanceOf[js.Any], timeoutType = timeoutType.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionTimedOutEventAttributes]
  }
  @scala.inline
  implicit class WorkflowExecutionTimedOutEventAttributesOps[Self <: WorkflowExecutionTimedOutEventAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildPolicy(value: ChildPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeoutType(value: WorkflowExecutionTimeoutType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

