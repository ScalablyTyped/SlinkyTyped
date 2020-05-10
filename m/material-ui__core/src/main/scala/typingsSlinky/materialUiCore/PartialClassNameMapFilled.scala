package typingsSlinky.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/FilledInput/FilledInput.FilledInputClassKey>> */
@js.native
trait PartialClassNameMapFilled extends js.Object {
  var adornedEnd: js.UndefOr[String] = js.native
  var adornedStart: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[String] = js.native
  var error: js.UndefOr[String] = js.native
  var focused: js.UndefOr[String] = js.native
  var input: js.UndefOr[String] = js.native
  var inputAdornedEnd: js.UndefOr[String] = js.native
  var inputAdornedStart: js.UndefOr[String] = js.native
  var inputMarginDense: js.UndefOr[String] = js.native
  var inputMultiline: js.UndefOr[String] = js.native
  var multiline: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var underline: js.UndefOr[String] = js.native
}

object PartialClassNameMapFilled {
  @scala.inline
  def apply(): PartialClassNameMapFilled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapFilled]
  }
  @scala.inline
  implicit class PartialClassNameMapFilledOps[Self <: PartialClassNameMapFilled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdornedEnd(value: String): Self = {
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
    def withAdornedStart(value: String): Self = {
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
    def withDisabled(value: String): Self = {
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
    def withError(value: String): Self = {
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
    def withFocused(value: String): Self = {
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
    def withInput(value: String): Self = {
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
    def withInputAdornedEnd(value: String): Self = {
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
    def withInputAdornedStart(value: String): Self = {
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
    def withInputMarginDense(value: String): Self = {
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
    def withInputMultiline(value: String): Self = {
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
    def withMultiline(value: String): Self = {
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
    def withRoot(value: String): Self = {
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
    @scala.inline
    def withUnderline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underline")(js.undefined)
        ret
    }
  }
  
}

