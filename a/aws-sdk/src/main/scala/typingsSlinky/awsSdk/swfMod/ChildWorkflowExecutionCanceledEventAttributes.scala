package typingsSlinky.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildWorkflowExecutionCanceledEventAttributes extends StObject {
  
  /**
    * Details of the cancellation (if provided).
    */
  var details: js.UndefOr[Data] = js.native
  
  /**
    * The ID of the StartChildWorkflowExecutionInitiated event corresponding to the StartChildWorkflowExecution Decision to start this child workflow execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var initiatedEventId: EventId = js.native
  
  /**
    * The ID of the ChildWorkflowExecutionStarted event recorded when this child workflow execution was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var startedEventId: EventId = js.native
  
  /**
    * The child workflow execution that was canceled.
    */
  var workflowExecution: WorkflowExecution = js.native
  
  /**
    * The type of the child workflow execution.
    */
  var workflowType: WorkflowType = js.native
}
object ChildWorkflowExecutionCanceledEventAttributes {
  
  @scala.inline
  def apply(
    initiatedEventId: EventId,
    startedEventId: EventId,
    workflowExecution: WorkflowExecution,
    workflowType: WorkflowType
  ): ChildWorkflowExecutionCanceledEventAttributes = {
    val __obj = js.Dynamic.literal(initiatedEventId = initiatedEventId.asInstanceOf[js.Any], startedEventId = startedEventId.asInstanceOf[js.Any], workflowExecution = workflowExecution.asInstanceOf[js.Any], workflowType = workflowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildWorkflowExecutionCanceledEventAttributes]
  }
  
  @scala.inline
  implicit class ChildWorkflowExecutionCanceledEventAttributesMutableBuilder[Self <: ChildWorkflowExecutionCanceledEventAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: Data): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setInitiatedEventId(value: EventId): Self = StObject.set(x, "initiatedEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedEventId(value: EventId): Self = StObject.set(x, "startedEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowExecution(value: WorkflowExecution): Self = StObject.set(x, "workflowExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowType(value: WorkflowType): Self = StObject.set(x, "workflowType", value.asInstanceOf[js.Any])
  }
}
