package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestRenderTemplateResponse extends js.Object {
  /**
    * The complete MIME message rendered by applying the data in the TemplateData parameter to the template specified in the TemplateName parameter.
    */
  var RenderedTemplate: js.UndefOr[typingsSlinky.awsSdk.sesMod.RenderedTemplate] = js.native
}

object TestRenderTemplateResponse {
  @scala.inline
  def apply(): TestRenderTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestRenderTemplateResponse]
  }
  @scala.inline
  implicit class TestRenderTemplateResponseOps[Self <: TestRenderTemplateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRenderedTemplate(value: RenderedTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenderedTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderedTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenderedTemplate")(js.undefined)
        ret
    }
  }
  
}

