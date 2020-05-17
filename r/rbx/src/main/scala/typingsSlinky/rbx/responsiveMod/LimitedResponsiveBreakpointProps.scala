package typingsSlinky.rbx.responsiveMod

import typingsSlinky.rbx.anon.Value
import typingsSlinky.rbx.anon.ValueBoolean
import typingsSlinky.rbx.anon.`3`
import typingsSlinky.rbx.anon.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LimitedResponsiveBreakpointProps extends js.Object {
  var display: js.UndefOr[Value] = js.native
  var hide: js.UndefOr[ValueBoolean] = js.native
  var textAlign: js.UndefOr[`3`] = js.native
  var textSize: js.UndefOr[`4`] = js.native
}

object LimitedResponsiveBreakpointProps {
  @scala.inline
  def apply(): LimitedResponsiveBreakpointProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LimitedResponsiveBreakpointProps]
  }
  @scala.inline
  implicit class LimitedResponsiveBreakpointPropsOps[Self <: LimitedResponsiveBreakpointProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplay(value: Value): Self = {
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
    def withHide(value: ValueBoolean): Self = {
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
    def withTextAlign(value: `3`): Self = {
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
    def withTextSize(value: `4`): Self = {
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

