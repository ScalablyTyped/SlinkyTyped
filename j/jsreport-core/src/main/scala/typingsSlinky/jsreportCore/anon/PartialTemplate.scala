package typingsSlinky.jsreportCore.anon

import typingsSlinky.jsreportCore.mod.Engine
import typingsSlinky.jsreportCore.mod.Helpers
import typingsSlinky.jsreportCore.mod.Recipe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<jsreport-core.jsreport-core.Template> */
@js.native
trait PartialTemplate extends js.Object {
  var content: js.UndefOr[String] = js.native
  var engine: js.UndefOr[Engine | String] = js.native
  var helpers: js.UndefOr[Helpers] = js.native
  var recipe: js.UndefOr[Recipe | String] = js.native
}

object PartialTemplate {
  @scala.inline
  def apply(): PartialTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTemplate]
  }
  @scala.inline
  implicit class PartialTemplateOps[Self <: PartialTemplate] (val x: Self) extends AnyVal {
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
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withEngine(value: Engine | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(js.undefined)
        ret
    }
    @scala.inline
    def withHelpers(value: Helpers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelpers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpers")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipe(value: Recipe | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipe")(js.undefined)
        ret
    }
  }
  
}

