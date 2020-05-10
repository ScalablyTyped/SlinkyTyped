package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopEntitiesDetectionJobResponse extends js.Object {
  /**
    * The identifier of the entities detection job to stop.
    */
  var JobId: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.JobId] = js.native
  /**
    * Either STOP_REQUESTED if the job is currently running, or STOPPED if the job was previously stopped with the StopEntitiesDetectionJob operation.
    */
  var JobStatus: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.JobStatus] = js.native
}

object StopEntitiesDetectionJobResponse {
  @scala.inline
  def apply(): StopEntitiesDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopEntitiesDetectionJobResponse]
  }
  @scala.inline
  implicit class StopEntitiesDetectionJobResponseOps[Self <: StopEntitiesDetectionJobResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobId")(js.undefined)
        ret
    }
    @scala.inline
    def withJobStatus(value: JobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobStatus")(js.undefined)
        ret
    }
  }
  
}

