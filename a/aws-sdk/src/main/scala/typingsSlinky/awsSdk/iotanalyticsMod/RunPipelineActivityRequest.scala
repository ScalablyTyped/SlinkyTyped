package typingsSlinky.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunPipelineActivityRequest extends StObject {
  
  /**
    * The sample message payloads on which the pipeline activity is run.
    */
  var payloads: MessagePayloads = js.native
  
  /**
    * The pipeline activity that is run. This must not be a channel activity or a datastore activity because these activities are used in a pipeline only to load the original message and to store the (possibly) transformed message. If a lambda activity is specified, only short-running Lambda functions (those with a timeout of less than 30 seconds or less) can be used.
    */
  var pipelineActivity: PipelineActivity = js.native
}
object RunPipelineActivityRequest {
  
  @scala.inline
  def apply(payloads: MessagePayloads, pipelineActivity: PipelineActivity): RunPipelineActivityRequest = {
    val __obj = js.Dynamic.literal(payloads = payloads.asInstanceOf[js.Any], pipelineActivity = pipelineActivity.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunPipelineActivityRequest]
  }
  
  @scala.inline
  implicit class RunPipelineActivityRequestMutableBuilder[Self <: RunPipelineActivityRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayloads(value: MessagePayloads): Self = StObject.set(x, "payloads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadsVarargs(value: MessagePayload*): Self = StObject.set(x, "payloads", js.Array(value :_*))
    
    @scala.inline
    def setPipelineActivity(value: PipelineActivity): Self = StObject.set(x, "pipelineActivity", value.asInstanceOf[js.Any])
  }
}
