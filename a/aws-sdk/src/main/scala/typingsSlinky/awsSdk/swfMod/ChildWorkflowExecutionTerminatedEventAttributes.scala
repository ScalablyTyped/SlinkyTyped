package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildWorkflowExecutionTerminatedEventAttributes extends js.Object {
  
  /**
    * The ID of the StartChildWorkflowExecutionInitiated event corresponding to the StartChildWorkflowExecution Decision to start this child workflow execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var initiatedEventId: EventId = js.native
  
  /**
    * The ID of the ChildWorkflowExecutionStarted event recorded when this child workflow execution was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var startedEventId: EventId = js.native
  
  /**
    * The child workflow execution that was terminated.
    */
  var workflowExecution: WorkflowExecution = js.native
  
  /**
    * The type of the child workflow execution.
    */
  var workflowType: WorkflowType = js.native
}
object ChildWorkflowExecutionTerminatedEventAttributes {
  
  @scala.inline
  def apply(
    initiatedEventId: EventId,
    startedEventId: EventId,
    workflowExecution: WorkflowExecution,
    workflowType: WorkflowType
  ): ChildWorkflowExecutionTerminatedEventAttributes = {
    val __obj = js.Dynamic.literal(initiatedEventId = initiatedEventId.asInstanceOf[js.Any], startedEventId = startedEventId.asInstanceOf[js.Any], workflowExecution = workflowExecution.asInstanceOf[js.Any], workflowType = workflowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildWorkflowExecutionTerminatedEventAttributes]
  }
  
  @scala.inline
  implicit class ChildWorkflowExecutionTerminatedEventAttributesOps[Self <: ChildWorkflowExecutionTerminatedEventAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInitiatedEventId(value: EventId): Self = this.set("initiatedEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedEventId(value: EventId): Self = this.set("startedEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowExecution(value: WorkflowExecution): Self = this.set("workflowExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowType(value: WorkflowType): Self = this.set("workflowType", value.asInstanceOf[js.Any])
  }
}
