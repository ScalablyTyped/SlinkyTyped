package typingsSlinky.materialUi.MaterialUI.Switches

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadioButtonProps extends CommonEnhancedSwitchProps[RadioButton] {
  // <EnhancedSwitch/> is element that get the 'other' properties
  var checkedIcon: js.UndefOr[ReactElement] = js.native
  var iconStyle: js.UndefOr[CSSProperties] = js.native
  var inputStyle: js.UndefOr[CSSProperties] = js.native
  var labelStyle: js.UndefOr[CSSProperties] = js.native
  var onCheck: js.UndefOr[
    js.Function2[SyntheticEvent[EventTarget with js.Object, Event], /* selected */ String, Unit]
  ] = js.native
  var uncheckedIcon: js.UndefOr[ReactElement] = js.native
   // Normally an SvgIcon
  @JSName("value")
  var value_RadioButtonProps: js.UndefOr[js.Any] = js.native
}

object RadioButtonProps {
  @scala.inline
  def apply(): RadioButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadioButtonProps]
  }
  @scala.inline
  implicit class RadioButtonPropsOps[Self <: RadioButtonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckedIcon(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckedIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedIcon")(js.undefined)
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
    def withOnCheck(value: (SyntheticEvent[EventTarget with js.Object, Event], /* selected */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCheck")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withUncheckedIcon(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncheckedIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUncheckedIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncheckedIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
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

