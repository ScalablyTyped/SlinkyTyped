package typingsSlinky.materialUiCore.anon

import typingsSlinky.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/FormControl.FormControlClassKey>> */
@js.native
trait PartialStyleRulesFormCont extends js.Object {
  var fullWidth: js.UndefOr[CSSProperties] = js.native
  var marginDense: js.UndefOr[CSSProperties] = js.native
  var marginNormal: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesFormCont {
  @scala.inline
  def apply(): PartialStyleRulesFormCont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesFormCont]
  }
  @scala.inline
  implicit class PartialStyleRulesFormContOps[Self <: PartialStyleRulesFormCont] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFullWidth(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginDense(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginDense")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginDense: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginDense")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginNormal(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginNormal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginNormal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginNormal")(js.undefined)
        ret
    }
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

