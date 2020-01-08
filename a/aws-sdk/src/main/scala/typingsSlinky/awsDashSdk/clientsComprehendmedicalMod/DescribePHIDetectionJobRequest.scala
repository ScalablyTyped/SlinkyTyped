package typingsSlinky.awsDashSdk.clientsComprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePHIDetectionJobRequest extends js.Object {
  /**
    * The identifier that Amazon Comprehend Medical generated for the job. The StartPHIDetectionJob operation returns this identifier in its response.
    */
  var JobId: typingsSlinky.awsDashSdk.clientsComprehendmedicalMod.JobId = js.native
}

object DescribePHIDetectionJobRequest {
  @scala.inline
  def apply(JobId: JobId): DescribePHIDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribePHIDetectionJobRequest]
  }
}

