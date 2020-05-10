package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateJobRequest extends js.Object {
  /**
    * The name of the job definition to update.
    */
  var JobName: NameString = js.native
  /**
    * Specifies the values with which to update the job definition.
    */
  var JobUpdate: typingsSlinky.awsSdk.glueMod.JobUpdate = js.native
}

object UpdateJobRequest {
  @scala.inline
  def apply(JobName: NameString, JobUpdate: JobUpdate): UpdateJobRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName.asInstanceOf[js.Any], JobUpdate = JobUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobRequest]
  }
  @scala.inline
  implicit class UpdateJobRequestOps[Self <: UpdateJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobUpdate(value: JobUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobUpdate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

