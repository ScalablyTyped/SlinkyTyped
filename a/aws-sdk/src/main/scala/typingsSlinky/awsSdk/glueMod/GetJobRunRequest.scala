package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobRunRequest extends js.Object {
  /**
    * Name of the job definition being run.
    */
  var JobName: NameString = js.native
  /**
    * True if a list of predecessor runs should be returned.
    */
  var PredecessorsIncluded: js.UndefOr[BooleanValue] = js.native
  /**
    * The ID of the job run.
    */
  var RunId: IdString = js.native
}

object GetJobRunRequest {
  @scala.inline
  def apply(JobName: NameString, RunId: IdString): GetJobRunRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName.asInstanceOf[js.Any], RunId = RunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobRunRequest]
  }
  @scala.inline
  implicit class GetJobRunRequestOps[Self <: GetJobRunRequest] (val x: Self) extends AnyVal {
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
    def withRunId(value: IdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RunId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPredecessorsIncluded(value: BooleanValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredecessorsIncluded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredecessorsIncluded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredecessorsIncluded")(js.undefined)
        ret
    }
  }
  
}

