package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTopicsDetectionJobRequest extends js.Object {
  /**
    * The identifier assigned by the user to the detection job.
    */
  var JobId: typingsSlinky.awsSdk.comprehendMod.JobId = js.native
}

object DescribeTopicsDetectionJobRequest {
  @scala.inline
  def apply(JobId: JobId): DescribeTopicsDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTopicsDetectionJobRequest]
  }
  @scala.inline
  implicit class DescribeTopicsDetectionJobRequestOps[Self <: DescribeTopicsDetectionJobRequest] (val x: Self) extends AnyVal {
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

