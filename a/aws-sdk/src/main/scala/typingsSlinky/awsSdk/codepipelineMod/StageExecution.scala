package typingsSlinky.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StageExecution extends StObject {
  
  /**
    * The ID of the pipeline execution associated with the stage.
    */
  var pipelineExecutionId: PipelineExecutionId = js.native
  
  /**
    * The status of the stage, or for a completed stage, the last status of the stage.
    */
  var status: StageExecutionStatus = js.native
}
object StageExecution {
  
  @scala.inline
  def apply(pipelineExecutionId: PipelineExecutionId, status: StageExecutionStatus): StageExecution = {
    val __obj = js.Dynamic.literal(pipelineExecutionId = pipelineExecutionId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StageExecution]
  }
  
  @scala.inline
  implicit class StageExecutionMutableBuilder[Self <: StageExecution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPipelineExecutionId(value: PipelineExecutionId): Self = StObject.set(x, "pipelineExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: StageExecutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
