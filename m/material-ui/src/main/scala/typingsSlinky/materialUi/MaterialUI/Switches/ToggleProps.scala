package typingsSlinky.materialUi.MaterialUI.Switches

import slinky.web.SyntheticMouseEvent
import typingsSlinky.materialUi.MaterialUI.ReactLink
import typingsSlinky.materialUi.materialUiStrings.left
import typingsSlinky.materialUi.materialUiStrings.right
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToggleProps extends CommonEnhancedSwitchProps[Toggle] {
  // <EnhancedSwitch/> is element that get the 'other' properties
  var defaultToggled: js.UndefOr[Boolean] = js.native
  var elementStyle: js.UndefOr[CSSProperties] = js.native
  var iconStyle: js.UndefOr[CSSProperties] = js.native
  var inputStyle: js.UndefOr[CSSProperties] = js.native
  var labelPosition: js.UndefOr[left | right] = js.native
  var labelStyle: js.UndefOr[CSSProperties] = js.native
  var onToggle: js.UndefOr[
    js.Function2[/* e */ SyntheticMouseEvent[js.Object], /* isInputChecked */ Boolean, Unit]
  ] = js.native
  var rippleStyle: js.UndefOr[CSSProperties] = js.native
  var thumbStyle: js.UndefOr[CSSProperties] = js.native
  var thumbSwitchedStyle: js.UndefOr[CSSProperties] = js.native
  var toggled: js.UndefOr[Boolean] = js.native
  var trackStyle: js.UndefOr[CSSProperties] = js.native
  var trackSwitchedStyle: js.UndefOr[CSSProperties] = js.native
  var valueLink: js.UndefOr[ReactLink[Boolean]] = js.native
}

object ToggleProps {
  @scala.inline
  def apply(): ToggleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToggleProps]
  }
  @scala.inline
  implicit class TogglePropsOps[Self <: ToggleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultToggled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultToggled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultToggled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultToggled")(js.undefined)
        ret
    }
    @scala.inline
    def withElementStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withIconStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withInputStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelPosition(value: left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withOnToggle(value: (/* e */ SyntheticMouseEvent[js.Object], /* isInputChecked */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggle")(js.undefined)
        ret
    }
    @scala.inline
    def withRippleStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRippleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbSwitchedStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbSwitchedStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbSwitchedStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbSwitchedStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withToggled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggled")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackSwitchedStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackSwitchedStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackSwitchedStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackSwitchedStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withValueLink(value: ReactLink[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueLink")(js.undefined)
        ret
    }
  }
  
}

