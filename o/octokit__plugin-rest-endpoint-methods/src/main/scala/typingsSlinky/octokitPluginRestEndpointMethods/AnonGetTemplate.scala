package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetTemplate extends js.Object {
  var getTemplate: AnonParamsAnonNameAnonRequired = js.native
  var listTemplates: AnonUrlString = js.native
}

object AnonGetTemplate {
  @scala.inline
  def apply(getTemplate: AnonParamsAnonNameAnonRequired, listTemplates: AnonUrlString): AnonGetTemplate = {
    val __obj = js.Dynamic.literal(getTemplate = getTemplate.asInstanceOf[js.Any], listTemplates = listTemplates.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGetTemplate]
  }
  @scala.inline
  implicit class AnonGetTemplateOps[Self <: AnonGetTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetTemplate(value: AnonParamsAnonNameAnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListTemplates(value: AnonUrlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listTemplates")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

