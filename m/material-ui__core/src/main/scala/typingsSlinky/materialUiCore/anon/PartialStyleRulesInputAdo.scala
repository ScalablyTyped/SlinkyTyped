package typingsSlinky.materialUiCore.anon

import typingsSlinky.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/InputAdornment.InputAdornmentClassKey>> */
@js.native
trait PartialStyleRulesInputAdo extends js.Object {
  var disablePointerEvents: js.UndefOr[CSSProperties] = js.native
  var filled: js.UndefOr[CSSProperties] = js.native
  var positionEnd: js.UndefOr[CSSProperties] = js.native
  var positionStart: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesInputAdo {
  @scala.inline
  def apply(): PartialStyleRulesInputAdo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesInputAdo]
  }
  @scala.inline
  implicit class PartialStyleRulesInputAdoOps[Self <: PartialStyleRulesInputAdo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisablePointerEvents(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePointerEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisablePointerEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePointerEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withFilled(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filled")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionEnd(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionStart(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionStart")(js.undefined)
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

