package typingsSlinky.ipp.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullRequest extends js.Object {
  var data: js.UndefOr[Buffer] = js.native
  var `job-attributes-tag`: js.UndefOr[JobTemplateAttributes] = js.native
  var `operation-attributes-tag`: js.UndefOr[OperationAttributes] = js.native
}

object FullRequest {
  @scala.inline
  def apply(): FullRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullRequest]
  }
  @scala.inline
  implicit class FullRequestOps[Self <: FullRequest] (val x: Self) extends AnyVal {
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
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
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
    @scala.inline
    def `withOperation-attributes-tag`(value: OperationAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation-attributes-tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOperation-attributes-tag`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation-attributes-tag")(js.undefined)
        ret
    }
  }
  
}

