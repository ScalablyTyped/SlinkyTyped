package typingsSlinky.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetryStageExecutionInput extends StObject {
  
  /**
    * The ID of the pipeline execution in the failed stage to be retried. Use the GetPipelineState action to retrieve the current pipelineExecutionId of the failed stage
    */
  var pipelineExecutionId: PipelineExecutionId = js.native
  
  /**
    * The name of the pipeline that contains the failed stage.
    */
  var pipelineName: PipelineName = js.native
  
  /**
    * The scope of the retry attempt. Currently, the only supported value is FAILED_ACTIONS.
    */
  var retryMode: StageRetryMode = js.native
  
  /**
    * The name of the failed stage to be retried.
    */
  var stageName: StageName = js.native
}
object RetryStageExecutionInput {
  
  @scala.inline
  def apply(
    pipelineExecutionId: PipelineExecutionId,
    pipelineName: PipelineName,
    retryMode: StageRetryMode,
    stageName: StageName
  ): RetryStageExecutionInput = {
    val __obj = js.Dynamic.literal(pipelineExecutionId = pipelineExecutionId.asInstanceOf[js.Any], pipelineName = pipelineName.asInstanceOf[js.Any], retryMode = retryMode.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryStageExecutionInput]
  }
  
  @scala.inline
  implicit class RetryStageExecutionInputMutableBuilder[Self <: RetryStageExecutionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPipelineExecutionId(value: PipelineExecutionId): Self = StObject.set(x, "pipelineExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineName(value: PipelineName): Self = StObject.set(x, "pipelineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryMode(value: StageRetryMode): Self = StObject.set(x, "retryMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageName(value: StageName): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
  }
}
