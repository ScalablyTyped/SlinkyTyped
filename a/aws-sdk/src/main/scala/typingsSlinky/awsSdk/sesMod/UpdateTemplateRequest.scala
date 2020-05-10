package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTemplateRequest extends js.Object {
  var Template: typingsSlinky.awsSdk.sesMod.Template = js.native
}

object UpdateTemplateRequest {
  @scala.inline
  def apply(Template: Template): UpdateTemplateRequest = {
    val __obj = js.Dynamic.literal(Template = Template.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTemplateRequest]
  }
  @scala.inline
  implicit class UpdateTemplateRequestOps[Self <: UpdateTemplateRequest] (val x: Self) extends AnyVal {
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
  }
  
}

