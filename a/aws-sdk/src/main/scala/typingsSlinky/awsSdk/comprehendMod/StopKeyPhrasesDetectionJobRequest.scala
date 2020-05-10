package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopKeyPhrasesDetectionJobRequest extends js.Object {
  /**
    * The identifier of the key phrases detection job to stop.
    */
  var JobId: typingsSlinky.awsSdk.comprehendMod.JobId = js.native
}

object StopKeyPhrasesDetectionJobRequest {
  @scala.inline
  def apply(JobId: JobId): StopKeyPhrasesDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopKeyPhrasesDetectionJobRequest]
  }
  @scala.inline
  implicit class StopKeyPhrasesDetectionJobRequestOps[Self <: StopKeyPhrasesDetectionJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobId(value: JobId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

