package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopSentimentDetectionJobRequest extends js.Object {
  /**
    * The identifier of the sentiment detection job to stop.
    */
  var JobId: typingsSlinky.awsSdk.comprehendMod.JobId = js.native
}

object StopSentimentDetectionJobRequest {
  @scala.inline
  def apply(JobId: JobId): StopSentimentDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopSentimentDetectionJobRequest]
  }
}

