package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobResponse extends js.Object {
  /**
    * The requested job definition.
    */
  var Job: js.UndefOr[typingsSlinky.awsSdk.glueMod.Job] = js.native
}

object GetJobResponse {
  @scala.inline
  def apply(): GetJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobResponse]
  }
  @scala.inline
  implicit class GetJobResponseOps[Self <: GetJobResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJob(value: Job): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Job")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Job")(js.undefined)
        ret
    }
  }
  
}

