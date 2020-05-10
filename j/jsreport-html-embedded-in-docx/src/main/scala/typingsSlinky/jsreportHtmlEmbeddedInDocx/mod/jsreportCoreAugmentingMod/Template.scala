package typingsSlinky.jsreportHtmlEmbeddedInDocx.mod.jsreportCoreAugmentingMod

import typingsSlinky.jsreportHtmlEmbeddedInDocx.jsreportHtmlEmbeddedInDocxStrings.`html-embedded-in-docx`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Template extends js.Object {
  var recipe: `html-embedded-in-docx` | String = js.native
}

object Template {
  @scala.inline
  def apply(recipe: `html-embedded-in-docx` | String): Template = {
    val __obj = js.Dynamic.literal(recipe = recipe.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
  @scala.inline
  implicit class TemplateOps[Self <: Template] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecipe(value: `html-embedded-in-docx` | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipe")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

