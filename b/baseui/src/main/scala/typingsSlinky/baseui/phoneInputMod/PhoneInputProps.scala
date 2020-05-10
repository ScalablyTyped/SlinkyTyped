package typingsSlinky.baseui.phoneInputMod

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import typingsSlinky.baseui.inputMod.InputProps
import typingsSlinky.baseui.selectMod.OnChangeParams
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhoneInputProps extends InputProps {
  var country: js.UndefOr[Country] = js.native
  var mapIsoToLabel: js.UndefOr[js.Function1[/* iso */ String, String]] = js.native
  var maxDropdownHeight: js.UndefOr[String] = js.native
  var maxDropdownWidth: js.UndefOr[String] = js.native
  var onCountryChange: js.UndefOr[js.Function1[/* event */ OnChangeParams, _]] = js.native
  var onTextChange: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event_, HTMLInputElement], _]] = js.native
  @JSName("overrides")
  var overrides_PhoneInputProps: js.UndefOr[PhoneInputOverrides] = js.native
  var text: js.UndefOr[String] = js.native
}

object PhoneInputProps {
  @scala.inline
  def apply(): PhoneInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhoneInputProps]
  }
  @scala.inline
  implicit class PhoneInputPropsOps[Self <: PhoneInputProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountry(value: Country): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
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
    def withMaxDropdownHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDropdownHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDropdownHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDropdownHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDropdownWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDropdownWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDropdownWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDropdownWidth")(js.undefined)
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
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

