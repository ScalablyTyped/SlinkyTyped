package typingsSlinky.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowExecutionTimedOutEventAttributes extends StObject {
  
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
  implicit class WorkflowExecutionTimedOutEventAttributesMutableBuilder[Self <: WorkflowExecutionTimedOutEventAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildPolicy(value: ChildPolicy): Self = StObject.set(x, "childPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutType(value: WorkflowExecutionTimeoutType): Self = StObject.set(x, "timeoutType", value.asInstanceOf[js.Any])
  }
}
