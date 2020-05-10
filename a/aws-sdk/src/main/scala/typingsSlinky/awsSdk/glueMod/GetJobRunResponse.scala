package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobRunResponse extends js.Object {
  /**
    * The requested job-run metadata.
    */
  var JobRun: js.UndefOr[typingsSlinky.awsSdk.glueMod.JobRun] = js.native
}

object GetJobRunResponse {
  @scala.inline
  def apply(): GetJobRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobRunResponse]
  }
  @scala.inline
  implicit class GetJobRunResponseOps[Self <: GetJobRunResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobRun(value: JobRun): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobRun")(js.undefined)
        ret
    }
  }
  
}

