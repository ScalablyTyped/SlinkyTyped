package typingsSlinky.ipp.mod

import typingsSlinky.ipp.AnonDocumentformat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintURIRequest extends js.Object {
  var `job-attributes-tag`: js.UndefOr[JobTemplateAttributes] = js.native
  var `operation-attributes-tag`: AnonDocumentformat = js.native
}

object PrintURIRequest {
  @scala.inline
  def apply(`operation-attributes-tag`: AnonDocumentformat): PrintURIRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintURIRequest]
  }
  @scala.inline
  implicit class PrintURIRequestOps[Self <: PrintURIRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withOperation-attributes-tag`(value: AnonDocumentformat): Self = {
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

