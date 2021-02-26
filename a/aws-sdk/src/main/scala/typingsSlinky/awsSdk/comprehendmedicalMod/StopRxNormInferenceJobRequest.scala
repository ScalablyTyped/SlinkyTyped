package typingsSlinky.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopRxNormInferenceJobRequest extends StObject {
  
  /**
    * The identifier of the job.
    */
  var JobId: typingsSlinky.awsSdk.comprehendmedicalMod.JobId = js.native
}
object StopRxNormInferenceJobRequest {
  
  @scala.inline
  def apply(JobId: JobId): StopRxNormInferenceJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopRxNormInferenceJobRequest]
  }
  
  @scala.inline
  implicit class StopRxNormInferenceJobRequestMutableBuilder[Self <: StopRxNormInferenceJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
