package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestRenderTemplateRequest extends js.Object {
  /**
    * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of key-value pairs in which the keys correspond to replacement tags in the email template.
    */
  var TemplateData: typingsSlinky.awsSdk.sesMod.TemplateData = js.native
  /**
    * The name of the template that you want to render.
    */
  var TemplateName: typingsSlinky.awsSdk.sesMod.TemplateName = js.native
}

object TestRenderTemplateRequest {
  @scala.inline
  def apply(TemplateData: TemplateData, TemplateName: TemplateName): TestRenderTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateData = TemplateData.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRenderTemplateRequest]
  }
  @scala.inline
  implicit class TestRenderTemplateRequestOps[Self <: TestRenderTemplateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTemplateData(value: TemplateData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplateName(value: TemplateName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

