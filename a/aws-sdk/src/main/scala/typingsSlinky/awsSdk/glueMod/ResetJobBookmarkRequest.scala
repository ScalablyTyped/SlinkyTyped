package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetJobBookmarkRequest extends js.Object {
  /**
    * The name of the job in question.
    */
  var JobName: typingsSlinky.awsSdk.glueMod.JobName = js.native
  /**
    * The unique run identifier associated with this job run.
    */
  var RunId: js.UndefOr[typingsSlinky.awsSdk.glueMod.RunId] = js.native
}

object ResetJobBookmarkRequest {
  @scala.inline
  def apply(JobName: JobName): ResetJobBookmarkRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetJobBookmarkRequest]
  }
  @scala.inline
  implicit class ResetJobBookmarkRequestOps[Self <: ResetJobBookmarkRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobName(value: JobName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunId(value: RunId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RunId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RunId")(js.undefined)
        ret
    }
  }
  
}

