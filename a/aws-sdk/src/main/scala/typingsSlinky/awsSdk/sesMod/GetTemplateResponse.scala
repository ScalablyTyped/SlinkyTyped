package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTemplateResponse extends js.Object {
  var Template: js.UndefOr[typingsSlinky.awsSdk.sesMod.Template] = js.native
}

object GetTemplateResponse {
  @scala.inline
  def apply(): GetTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTemplateResponse]
  }
  @scala.inline
  implicit class GetTemplateResponseOps[Self <: GetTemplateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTemplate(value: Template): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Template")(js.undefined)
        ret
    }
  }
  
}

