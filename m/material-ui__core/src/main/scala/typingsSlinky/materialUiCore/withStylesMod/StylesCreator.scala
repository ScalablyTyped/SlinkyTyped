package typingsSlinky.materialUiCore.withStylesMod

import typingsSlinky.materialUiCore.anon.Index
import typingsSlinky.materialUiCore.createMuiThemeMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StylesCreator extends js.Object {
  var options: Index = js.native
  var themingEnabled: Boolean = js.native
  def create(theme: Theme, name: String): StyleRules[String] = js.native
}

object StylesCreator {
  @scala.inline
  def apply(create: (Theme, String) => StyleRules[String], options: Index, themingEnabled: Boolean): StylesCreator = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), options = options.asInstanceOf[js.Any], themingEnabled = themingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylesCreator]
  }
  @scala.inline
  implicit class StylesCreatorOps[Self <: StylesCreator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: (Theme, String) => StyleRules[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOptions(value: Index): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThemingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

