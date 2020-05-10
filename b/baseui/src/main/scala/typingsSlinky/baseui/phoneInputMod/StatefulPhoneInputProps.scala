package typingsSlinky.baseui.phoneInputMod

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import typingsSlinky.baseui.selectMod.OnChangeParams
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatefulPhoneInputProps extends js.Object {
  var `aria-label`: js.UndefOr[String] = js.native
  var initialState: js.UndefOr[State] = js.native
  var mapIsoToLabel: js.UndefOr[js.Function1[/* iso */ String, String]] = js.native
  var onCountryChange: js.UndefOr[js.Function1[/* event */ OnChangeParams, _]] = js.native
  var onTextChange: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event_, HTMLInputElement], _]] = js.native
  var overrides: js.UndefOr[PhoneInputOverrides] = js.native
  var stateReducer: js.UndefOr[StateReducer] = js.native
}

object StatefulPhoneInputProps {
  @scala.inline
  def apply(): StatefulPhoneInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulPhoneInputProps]
  }
  @scala.inline
  implicit class StatefulPhoneInputPropsOps[Self <: StatefulPhoneInputProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAria-label`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-label`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialState(value: State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(js.undefined)
        ret
    }
    @scala.inline
    def withMapIsoToLabel(value: /* iso */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapIsoToLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMapIsoToLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapIsoToLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCountryChange(value: /* event */ OnChangeParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCountryChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCountryChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCountryChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTextChange(value: /* event */ SyntheticEvent[Event_, HTMLInputElement] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTextChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTextChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTextChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrides(value: PhoneInputOverrides): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
    @scala.inline
    def withStateReducer(value: (/* type */ StateChange, /* nextState */ State, /* currentState */ State) => State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutStateReducer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(js.undefined)
        ret
    }
  }
  
}

