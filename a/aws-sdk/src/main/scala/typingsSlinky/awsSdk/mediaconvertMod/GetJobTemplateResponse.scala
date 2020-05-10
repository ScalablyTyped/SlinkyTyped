package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobTemplateResponse extends js.Object {
  /**
    * A job template is a pre-made set of encoding instructions that you can use to quickly create a job.
    */
  var JobTemplate: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.JobTemplate] = js.native
}

object GetJobTemplateResponse {
  @scala.inline
  def apply(): GetJobTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobTemplateResponse]
  }
  @scala.inline
  implicit class GetJobTemplateResponseOps[Self <: GetJobTemplateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobTemplate(value: JobTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobTemplate")(js.undefined)
        ret
    }
  }
  
}

