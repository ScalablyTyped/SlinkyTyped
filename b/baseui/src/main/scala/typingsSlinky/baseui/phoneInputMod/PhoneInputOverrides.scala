package typingsSlinky.baseui.phoneInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhoneInputOverrides extends js.Object {
  var CountrySelect: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var CountrySelectDropdown: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var CountrySelectDropdownDialcodeColumn: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var CountrySelectDropdownFlagColumn: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var CountrySelectDropdownListItem: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var CountrySelectDropdownNameColumn: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var DialCode: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var FlagContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var Input: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
}

object PhoneInputOverrides {
  @scala.inline
  def apply(): PhoneInputOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhoneInputOverrides]
  }
  @scala.inline
  implicit class PhoneInputOverridesOps[Self <: PhoneInputOverrides] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountrySelect(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountrySelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountrySelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountrySelect")(js.undefined)
        ret
    }
    @scala.inline
    def withCountrySelectDropdown(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountrySelectDropdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountrySelectDropdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountrySelectDropdown")(js.undefined)
        ret
    }
    @scala.inline
    def withCountrySelectDropdownDialcodeColumn(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountrySelectDropdownDialcodeColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountrySelectDropdownDialcodeColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountrySelectDropdownDialcodeColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withCountrySelectDropdownFlagColumn(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountrySelectDropdownFlagColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountrySelectDropdownFlagColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountrySelectDropdownFlagColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withCountrySelectDropdownListItem(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountrySelectDropdownListItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountrySelectDropdownListItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountrySelectDropdownListItem")(js.undefined)
        ret
    }
    @scala.inline
    def withCountrySelectDropdownNameColumn(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountrySelectDropdownNameColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountrySelectDropdownNameColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountrySelectDropdownNameColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withDialCode(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DialCode")(js.undefined)
        ret
    }
    @scala.inline
    def withFlagContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlagContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlagContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlagContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withInput(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Input")(js.undefined)
        ret
    }
  }
  
}

