package typingsSlinky.baseui.phoneInputMod

import typingsSlinky.baseui.AnonCountrySelectDropdown
import typingsSlinky.baseui.ReadonlyArrayReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountrySelectDropdownProps extends js.Object {
  var children: js.UndefOr[ReadonlyArrayReactNode] = js.native
  var country: js.UndefOr[Country] = js.native
  var mapIsoToLabel: js.UndefOr[js.Function1[/* iso */ String, String]] = js.native
  var maxDropdownHeight: js.UndefOr[String] = js.native
  var overrides: js.UndefOr[AnonCountrySelectDropdown] = js.native
}

object CountrySelectDropdownProps {
  @scala.inline
  def apply(): CountrySelectDropdownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountrySelectDropdownProps]
  }
  @scala.inline
  implicit class CountrySelectDropdownPropsOps[Self <: CountrySelectDropdownProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: ReadonlyArrayReactNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
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
    def withOverrides(value: AnonCountrySelectDropdown): Self = {
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
  }
  
}

