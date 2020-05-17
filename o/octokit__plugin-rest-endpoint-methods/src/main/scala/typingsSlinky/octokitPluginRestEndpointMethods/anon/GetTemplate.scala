package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTemplate extends js.Object {
  var getTemplate: ParamsNameRequired = js.native
  var listTemplates: UrlString = js.native
}

object GetTemplate {
  @scala.inline
  def apply(getTemplate: ParamsNameRequired, listTemplates: UrlString): GetTemplate = {
    val __obj = js.Dynamic.literal(getTemplate = getTemplate.asInstanceOf[js.Any], listTemplates = listTemplates.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTemplate]
  }
  @scala.inline
  implicit class GetTemplateOps[Self <: GetTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetTemplate(value: ParamsNameRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListTemplates(value: UrlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listTemplates")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

