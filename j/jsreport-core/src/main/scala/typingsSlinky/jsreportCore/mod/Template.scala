package typingsSlinky.jsreportCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Template extends js.Object {
  var content: String = js.native
  var engine: Engine | String = js.native
  var helpers: Helpers = js.native
  var recipe: Recipe | String = js.native
}

object Template {
  @scala.inline
  def apply(content: String, engine: Engine | String, helpers: Helpers, recipe: Recipe | String): Template = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], helpers = helpers.asInstanceOf[js.Any], recipe = recipe.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
  @scala.inline
  implicit class TemplateOps[Self <: Template] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEngine(value: Engine | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelpers(value: Helpers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipe(value: Recipe | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipe")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

