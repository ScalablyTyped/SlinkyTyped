package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateResponse extends js.Object {
  /**
    * The job that was launched, if the request was not a dry run and
    * the job was successfully launched.
    */
  var job: js.UndefOr[Job] = js.native
}

object LaunchTemplateResponse {
  @scala.inline
  def apply(): LaunchTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateResponse]
  }
  @scala.inline
  implicit class LaunchTemplateResponseOps[Self <: LaunchTemplateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJob(value: Job): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job")(js.undefined)
        ret
    }
  }
  
}

