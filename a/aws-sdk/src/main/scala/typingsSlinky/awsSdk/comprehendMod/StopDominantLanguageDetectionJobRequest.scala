package typingsSlinky.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopDominantLanguageDetectionJobRequest extends StObject {
  
  /**
    * The identifier of the dominant language detection job to stop.
    */
  var JobId: typingsSlinky.awsSdk.comprehendMod.JobId = js.native
}
object StopDominantLanguageDetectionJobRequest {
  
  @scala.inline
  def apply(JobId: JobId): StopDominantLanguageDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopDominantLanguageDetectionJobRequest]
  }
  
  @scala.inline
  implicit class StopDominantLanguageDetectionJobRequestMutableBuilder[Self <: StopDominantLanguageDetectionJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
