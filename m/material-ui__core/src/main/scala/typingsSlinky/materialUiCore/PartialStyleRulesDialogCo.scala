package typingsSlinky.materialUiCore

import typingsSlinky.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/DialogContent.DialogContentClassKey>> */
@js.native
trait PartialStyleRulesDialogCo extends js.Object {
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesDialogCo {
  @scala.inline
  def apply(): PartialStyleRulesDialogCo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesDialogCo]
  }
  @scala.inline
  implicit class PartialStyleRulesDialogCoOps[Self <: PartialStyleRulesDialogCo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoot(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
  }
  
}

