package typingsSlinky.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/InputAdornment/InputAdornment.InputAdornmentClassKey>> */
@js.native
trait PartialClassNameMapInputA extends js.Object {
  var disablePointerEvents: js.UndefOr[String] = js.native
  var filled: js.UndefOr[String] = js.native
  var positionEnd: js.UndefOr[String] = js.native
  var positionStart: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapInputA {
  @scala.inline
  def apply(): PartialClassNameMapInputA = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapInputA]
  }
  @scala.inline
  implicit class PartialClassNameMapInputAOps[Self <: PartialClassNameMapInputA] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisablePointerEvents(value: String): Self = {
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
    def withFilled(value: String): Self = {
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
    def withPositionEnd(value: String): Self = {
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
    def withPositionStart(value: String): Self = {
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
  }
  
}

