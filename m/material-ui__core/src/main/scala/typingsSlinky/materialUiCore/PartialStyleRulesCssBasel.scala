package typingsSlinky.materialUiCore

import typingsSlinky.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/CssBaseline.CssBaselineClassKey>> */
@js.native
trait PartialStyleRulesCssBasel extends js.Object {
  var `@global`: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesCssBasel {
  @scala.inline
  def apply(): PartialStyleRulesCssBasel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesCssBasel]
  }
  @scala.inline
  implicit class PartialStyleRulesCssBaselOps[Self <: PartialStyleRulesCssBasel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `with@global`(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("@global")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `without@global`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("@global")(js.undefined)
        ret
    }
  }
  
}

