package typingsSlinky.rbx.responsiveMod

import typingsSlinky.rbx.anon.Only
import typingsSlinky.rbx.anon.OnlyBoolean
import typingsSlinky.rbx.anon.OnlyBooleanValue
import typingsSlinky.rbx.anon.OnlyValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponsiveBreakpointProps extends js.Object {
  var display: js.UndefOr[Only] = js.native
  var hide: js.UndefOr[OnlyValue] = js.native
  var textAlign: js.UndefOr[OnlyBoolean] = js.native
  var textSize: js.UndefOr[OnlyBooleanValue] = js.native
}

object ResponsiveBreakpointProps {
  @scala.inline
  def apply(): ResponsiveBreakpointProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsiveBreakpointProps]
  }
  @scala.inline
  implicit class ResponsiveBreakpointPropsOps[Self <: ResponsiveBreakpointProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplay(value: Only): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.undefined)
        ret
    }
    @scala.inline
    def withHide(value: OnlyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAlign(value: OnlyBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withTextSize(value: OnlyBooleanValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textSize")(js.undefined)
        ret
    }
  }
  
}

