package typingsSlinky.baseui.phoneInputMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactRef
import typingsSlinky.baseui.AnonCountrySelect
import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.large_
import typingsSlinky.baseui.baseuiStrings.mini
import typingsSlinky.baseui.selectMod.OnChangeParams
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountrySelectProps extends js.Object {
  var countries: StringDictionary[Country] = js.native
  var country: js.UndefOr[Country] = js.native
  var inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.native
  var mapIsoToLabel: js.UndefOr[js.Function1[/* iso */ String, String]] = js.native
  var maxDropdownHeight: js.UndefOr[String] = js.native
  var maxDropdownWidth: js.UndefOr[String] = js.native
  var onCountryChange: js.UndefOr[js.Function1[/* event */ OnChangeParams, _]] = js.native
  var overrides: js.UndefOr[AnonCountrySelect] = js.native
  var size: js.UndefOr[mini | default_ | compact | large_] = js.native
}

object CountrySelectProps {
  @scala.inline
  def apply(countries: StringDictionary[Country]): CountrySelectProps = {
    val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountrySelectProps]
  }
  @scala.inline
  implicit class CountrySelectPropsOps[Self <: CountrySelectProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountries(value: StringDictionary[Country]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countries")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withInputRefRefObject(value: ReactRef[HTMLInputElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInputRef(value: Ref[HTMLInputElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(js.undefined)
        ret
    }
    @scala.inline
    def withInputRefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(null)
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
    def withOverrides(value: AnonCountrySelect): Self = {
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
    def withSize(value: mini | default_ | compact | large_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

