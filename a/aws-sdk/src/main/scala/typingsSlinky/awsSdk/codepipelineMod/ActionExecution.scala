package typingsSlinky.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionExecution extends StObject {
  
  /**
    * ID of the workflow action execution in the current stage. Use the GetPipelineState action to retrieve the current action execution details of the current stage.  For older executions, this field might be empty. The action execution ID is available for executions run on or after March 2020. 
    */
  var actionExecutionId: js.UndefOr[ActionExecutionId] = js.native
  
  /**
    * The details of an error returned by a URL external to AWS.
    */
  var errorDetails: js.UndefOr[ErrorDetails] = js.native
  
  /**
    * The external ID of the run of the action.
    */
  var externalExecutionId: js.UndefOr[ExecutionId] = js.native
  
  /**
    * The URL of a resource external to AWS that is used when running the action (for example, an external repository URL).
    */
  var externalExecutionUrl: js.UndefOr[Url] = js.native
  
  /**
    * The last status change of the action.
    */
  var lastStatusChange: js.UndefOr[js.Date] = js.native
  
  /**
    * The ARN of the user who last changed the pipeline.
    */
  var lastUpdatedBy: js.UndefOr[LastUpdatedBy] = js.native
  
  /**
    * A percentage of completeness of the action as it runs.
    */
  var percentComplete: js.UndefOr[Percentage] = js.native
  
  /**
    * The status of the action, or for a completed action, the last status of the action.
    */
  var status: js.UndefOr[ActionExecutionStatus] = js.native
  
  /**
    * A summary of the run of the action.
    */
  var summary: js.UndefOr[ExecutionSummary] = js.native
  
  /**
    * The system-generated token used to identify a unique approval request. The token for each open approval request can be obtained using the GetPipelineState command. It is used to validate that the approval request corresponding to this token is still valid.
    */
  var token: js.UndefOr[ActionExecutionToken] = js.native
}
object ActionExecution {
  
  @scala.inline
  def apply(): ActionExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionExecution]
  }
  
  @scala.inline
  implicit class ActionExecutionMutableBuilder[Self <: ActionExecution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionExecutionId(value: ActionExecutionId): Self = StObject.set(x, "actionExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionExecutionIdUndefined: Self = StObject.set(x, "actionExecutionId", js.undefined)
    
    @scala.inline
    def setErrorDetails(value: ErrorDetails): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setExternalExecutionId(value: ExecutionId): Self = StObject.set(x, "externalExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalExecutionIdUndefined: Self = StObject.set(x, "externalExecutionId", js.undefined)
    
    @scala.inline
    def setExternalExecutionUrl(value: Url): Self = StObject.set(x, "externalExecutionUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalExecutionUrlUndefined: Self = StObject.set(x, "externalExecutionUrl", js.undefined)
    
    @scala.inline
    def setLastStatusChange(value: js.Date): Self = StObject.set(x, "lastStatusChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastStatusChangeUndefined: Self = StObject.set(x, "lastStatusChange", js.undefined)
    
    @scala.inline
    def setLastUpdatedBy(value: LastUpdatedBy): Self = StObject.set(x, "lastUpdatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedByUndefined: Self = StObject.set(x, "lastUpdatedBy", js.undefined)
    
    @scala.inline
    def setPercentComplete(value: Percentage): Self = StObject.set(x, "percentComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentCompleteUndefined: Self = StObject.set(x, "percentComplete", js.undefined)
    
    @scala.inline
    def setStatus(value: ActionExecutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSummary(value: ExecutionSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    @scala.inline
    def setToken(value: ActionExecutionToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
