package typingsSlinky.materialUiCore.anon

import typingsSlinky.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/OutlinedInput.OutlinedInputClassKey>> */
@js.native
trait PartialStyleRulesOutlined extends js.Object {
  var adornedEnd: js.UndefOr[CSSProperties] = js.native
  var adornedStart: js.UndefOr[CSSProperties] = js.native
  var disabled: js.UndefOr[CSSProperties] = js.native
  var error: js.UndefOr[CSSProperties] = js.native
  var focused: js.UndefOr[CSSProperties] = js.native
  var input: js.UndefOr[CSSProperties] = js.native
  var inputAdornedEnd: js.UndefOr[CSSProperties] = js.native
  var inputAdornedStart: js.UndefOr[CSSProperties] = js.native
  var inputMarginDense: js.UndefOr[CSSProperties] = js.native
  var inputMultiline: js.UndefOr[CSSProperties] = js.native
  var multiline: js.UndefOr[CSSProperties] = js.native
  var notchedOutline: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesOutlined {
  @scala.inline
  def apply(): PartialStyleRulesOutlined = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesOutlined]
  }
  @scala.inline
  implicit class PartialStyleRulesOutlinedOps[Self <: PartialStyleRulesOutlined] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdornedEnd(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adornedEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdornedEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adornedEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withAdornedStart(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adornedStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdornedStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adornedStart")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withFocused(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focused")(js.undefined)
        ret
    }
    @scala.inline
    def withInput(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withInputAdornedEnd(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputAdornedEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputAdornedEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputAdornedEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withInputAdornedStart(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputAdornedStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputAdornedStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputAdornedStart")(js.undefined)
        ret
    }
    @scala.inline
    def withInputMarginDense(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputMarginDense")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputMarginDense: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputMarginDense")(js.undefined)
        ret
    }
    @scala.inline
    def withInputMultiline(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputMultiline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputMultiline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputMultiline")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiline(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiline")(js.undefined)
        ret
    }
    @scala.inline
    def withNotchedOutline(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notchedOutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotchedOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notchedOutline")(js.undefined)
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

