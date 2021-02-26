package typingsSlinky.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestCancelExternalWorkflowExecutionDecisionAttributes extends StObject {
  
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
  implicit class RequestCancelExternalWorkflowExecutionDecisionAttributesMutableBuilder[Self <: RequestCancelExternalWorkflowExecutionDecisionAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControl(value: Data): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
    
    @scala.inline
    def setRunId(value: WorkflowRunIdOptional): Self = StObject.set(x, "runId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunIdUndefined: Self = StObject.set(x, "runId", js.undefined)
    
    @scala.inline
    def setWorkflowId(value: WorkflowId): Self = StObject.set(x, "workflowId", value.asInstanceOf[js.Any])
  }
}
