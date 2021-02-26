package typingsSlinky.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPipelineOutput extends StObject {
  
  /**
    * Represents the pipeline metadata information returned as part of the output of a GetPipeline action.
    */
  var metadata: js.UndefOr[PipelineMetadata] = js.native
  
  /**
    * Represents the structure of actions and stages to be performed in the pipeline. 
    */
  var pipeline: js.UndefOr[PipelineDeclaration] = js.native
}
object GetPipelineOutput {
  
  @scala.inline
  def apply(): GetPipelineOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPipelineOutput]
  }
  
  @scala.inline
  implicit class GetPipelineOutputMutableBuilder[Self <: GetPipelineOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: PipelineMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setPipeline(value: PipelineDeclaration): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
  }
}
