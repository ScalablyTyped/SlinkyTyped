package typingsSlinky.ipp.mod

import typingsSlinky.ipp.AnonIppattributefidelity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJobRequest extends js.Object {
  var `job-attributes-tag`: js.UndefOr[JobTemplateAttributes] = js.native
  var `operation-attributes-tag`: AnonIppattributefidelity = js.native
}

object CreateJobRequest {
  @scala.inline
  def apply(`operation-attributes-tag`: AnonIppattributefidelity): CreateJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobRequest]
  }
  @scala.inline
  implicit class CreateJobRequestOps[Self <: CreateJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withOperation-attributes-tag`(value: AnonIppattributefidelity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation-attributes-tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withJob-attributes-tag`(value: JobTemplateAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-attributes-tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-attributes-tag`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-attributes-tag")(js.undefined)
        ret
    }
  }
  
}

