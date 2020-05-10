package typingsSlinky.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJobResponse extends js.Object {
  /**
    * A section of the response body that provides information about the job that is created.
    */
  var Job: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.Job] = js.native
}

object CreateJobResponse {
  @scala.inline
  def apply(): CreateJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateJobResponse]
  }
  @scala.inline
  implicit class CreateJobResponseOps[Self <: CreateJobResponse] (val x: Self) extends AnyVal {
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

