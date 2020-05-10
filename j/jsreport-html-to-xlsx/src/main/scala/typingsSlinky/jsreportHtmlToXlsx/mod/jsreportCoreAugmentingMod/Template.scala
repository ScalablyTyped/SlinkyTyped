package typingsSlinky.jsreportHtmlToXlsx.mod.jsreportCoreAugmentingMod

import typingsSlinky.jsreportHtmlToXlsx.AnonHtmlEngine
import typingsSlinky.jsreportHtmlToXlsx.jsreportHtmlToXlsxStrings.`html-to-xlsx`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Template extends js.Object {
  var htmlToXlsx: AnonHtmlEngine = js.native
  var recipe: `html-to-xlsx` | String = js.native
}

object Template {
  @scala.inline
  def apply(htmlToXlsx: AnonHtmlEngine, recipe: `html-to-xlsx` | String): Template = {
    val __obj = js.Dynamic.literal(htmlToXlsx = htmlToXlsx.asInstanceOf[js.Any], recipe = recipe.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
  @scala.inline
  implicit class TemplateOps[Self <: Template] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtmlToXlsx(value: AnonHtmlEngine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlToXlsx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipe(value: `html-to-xlsx` | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipe")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

