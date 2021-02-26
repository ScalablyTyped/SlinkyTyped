package typingsSlinky.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePipelineResponse extends StObject {
  
  /**
    * A section of the response body that provides information about the pipeline that is created.
    */
  var Pipeline: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.Pipeline] = js.native
  
  /**
    * Elastic Transcoder returns a warning if the resources used by your pipeline are not in the same region as the pipeline. Using resources in the same region, such as your Amazon S3 buckets, Amazon SNS notification topics, and AWS KMS key, reduces processing time and prevents cross-regional charges.
    */
  var Warnings: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.Warnings] = js.native
}
object CreatePipelineResponse {
  
  @scala.inline
  def apply(): CreatePipelineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePipelineResponse]
  }
  
  @scala.inline
  implicit class CreatePipelineResponseMutableBuilder[Self <: CreatePipelineResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPipeline(value: Pipeline): Self = StObject.set(x, "Pipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineUndefined: Self = StObject.set(x, "Pipeline", js.undefined)
    
    @scala.inline
    def setWarnings(value: Warnings): Self = StObject.set(x, "Warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsUndefined: Self = StObject.set(x, "Warnings", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: Warning*): Self = StObject.set(x, "Warnings", js.Array(value :_*))
  }
}
