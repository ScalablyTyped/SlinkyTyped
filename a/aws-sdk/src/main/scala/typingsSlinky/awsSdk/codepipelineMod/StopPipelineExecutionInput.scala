package typingsSlinky.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopPipelineExecutionInput extends StObject {
  
  /**
    * Use this option to stop the pipeline execution by abandoning, rather than finishing, in-progress actions.  This option can lead to failed or out-of-sequence tasks. 
    */
  var abandon: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the pipeline execution to be stopped in the current stage. Use the GetPipelineState action to retrieve the current pipelineExecutionId.
    */
  var pipelineExecutionId: PipelineExecutionId = js.native
  
  /**
    * The name of the pipeline to stop.
    */
  var pipelineName: PipelineName = js.native
  
  /**
    * Use this option to enter comments, such as the reason the pipeline was stopped.
    */
  var reason: js.UndefOr[StopPipelineExecutionReason] = js.native
}
object StopPipelineExecutionInput {
  
  @scala.inline
  def apply(pipelineExecutionId: PipelineExecutionId, pipelineName: PipelineName): StopPipelineExecutionInput = {
    val __obj = js.Dynamic.literal(pipelineExecutionId = pipelineExecutionId.asInstanceOf[js.Any], pipelineName = pipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopPipelineExecutionInput]
  }
  
  @scala.inline
  implicit class StopPipelineExecutionInputMutableBuilder[Self <: StopPipelineExecutionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbandon(value: Boolean): Self = StObject.set(x, "abandon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbandonUndefined: Self = StObject.set(x, "abandon", js.undefined)
    
    @scala.inline
    def setPipelineExecutionId(value: PipelineExecutionId): Self = StObject.set(x, "pipelineExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineName(value: PipelineName): Self = StObject.set(x, "pipelineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: StopPipelineExecutionReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
