package typingsSlinky.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSentimentDetectionJobRequest extends StObject {
  
  /**
    * The identifier that Amazon Comprehend generated for the job. The operation returns this identifier in its response.
    */
  var JobId: typingsSlinky.awsSdk.comprehendMod.JobId = js.native
}
object DescribeSentimentDetectionJobRequest {
  
  @scala.inline
  def apply(JobId: JobId): DescribeSentimentDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSentimentDetectionJobRequest]
  }
  
  @scala.inline
  implicit class DescribeSentimentDetectionJobRequestMutableBuilder[Self <: DescribeSentimentDetectionJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
