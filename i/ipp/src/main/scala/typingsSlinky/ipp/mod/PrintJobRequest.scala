package typingsSlinky.ipp.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintJobRequest extends js.Object {
  var data: Buffer = js.native
  var `job-attributes-tag`: js.UndefOr[JobTemplateAttributes] = js.native
  var `operation-attributes-tag`: typingsSlinky.ipp.anon.Compression = js.native
}

object PrintJobRequest {
  @scala.inline
  def apply(data: Buffer, `operation-attributes-tag`: typingsSlinky.ipp.anon.Compression): PrintJobRequest = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintJobRequest]
  }
  @scala.inline
  implicit class PrintJobRequestOps[Self <: PrintJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOperation-attributes-tag`(value: typingsSlinky.ipp.anon.Compression): Self = {
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

