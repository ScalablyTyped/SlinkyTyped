package typingsSlinky.materialUi.MaterialUI.Switches

import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnhancedSwitchProps extends CommonEnhancedSwitchProps[EnhancedSwitch] {
  var defaultSwitched: js.UndefOr[Boolean] = js.native
  var disableFocusRipple: js.UndefOr[Boolean] = js.native
  var disableTouchRipple: js.UndefOr[Boolean] = js.native
  var iconStyle: js.UndefOr[CSSProperties] = js.native
  var inputStyle: CSSProperties = js.native
  var inputType: String = js.native
  var labelPosition: js.UndefOr[String] = js.native
   // oneOf(['left', 'right'])
  var labelStyle: js.UndefOr[CSSProperties] = js.native
  var onSwitch: js.UndefOr[
    js.Function2[/* e */ SyntheticMouseEvent[js.Object], /* isInputChecked */ Boolean, Unit]
  ] = js.native
  var rippleColor: js.UndefOr[String] = js.native
  var rippleStyle: js.UndefOr[CSSProperties] = js.native
  var switchElement: ReactElement = js.native
  var switched: Boolean = js.native
  var thumbStyle: js.UndefOr[CSSProperties] = js.native
  var trackStyle: js.UndefOr[CSSProperties] = js.native
  @JSName("value")
  var value_EnhancedSwitchProps: js.UndefOr[String] = js.native
  def onParentShouldUpdate(isInputChecked: Boolean): Unit = js.native
}

object EnhancedSwitchProps {
  @scala.inline
  def apply(
    inputStyle: CSSProperties,
    inputType: String,
    onParentShouldUpdate: Boolean => Unit,
    switchElement: ReactElement,
    switched: Boolean
  ): EnhancedSwitchProps = {
    val __obj = js.Dynamic.literal(inputStyle = inputStyle.asInstanceOf[js.Any], inputType = inputType.asInstanceOf[js.Any], onParentShouldUpdate = js.Any.fromFunction1(onParentShouldUpdate), switchElement = switchElement.asInstanceOf[js.Any], switched = switched.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedSwitchProps]
  }
  @scala.inline
  implicit class EnhancedSwitchPropsOps[Self <: EnhancedSwitchProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnParentShouldUpdate(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onParentShouldUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSwitchElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwitched(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switched")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultSwitched(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSwitched")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSwitched: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSwitched")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableFocusRipple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFocusRipple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableFocusRipple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFocusRipple")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableTouchRipple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTouchRipple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableTouchRipple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTouchRipple")(js.undefined)
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
    def withLabelPosition(value: String): Self = {
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
    def withOnSwitch(value: (/* e */ SyntheticMouseEvent[js.Object], /* isInputChecked */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwitch")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSwitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwitch")(js.undefined)
        ret
    }
    @scala.inline
    def withRippleColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRippleColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleColor")(js.undefined)
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
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

