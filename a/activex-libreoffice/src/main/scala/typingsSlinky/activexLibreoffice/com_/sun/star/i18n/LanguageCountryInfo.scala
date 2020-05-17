package typingsSlinky.activexLibreoffice.com_.sun.star.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The language and country identifiers and descriptive names of the loaded locale data returned by {@link XLocaleData.getLanguageCountryInfo()} .
  * @see XLocaleData for links to DTD of XML locale data files.
  */
@js.native
trait LanguageCountryInfo extends js.Object {
  var Country: String = js.native
  var CountryDefaultName: String = js.native
  var Language: String = js.native
  var LanguageDefaultName: String = js.native
  var Variant: String = js.native
}

object LanguageCountryInfo {
  @scala.inline
  def apply(
    Country: String,
    CountryDefaultName: String,
    Language: String,
    LanguageDefaultName: String,
    Variant: String
  ): LanguageCountryInfo = {
    val __obj = js.Dynamic.literal(Country = Country.asInstanceOf[js.Any], CountryDefaultName = CountryDefaultName.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], LanguageDefaultName = LanguageDefaultName.asInstanceOf[js.Any], Variant = Variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageCountryInfo]
  }
  @scala.inline
  implicit class LanguageCountryInfoOps[Self <: LanguageCountryInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountryDefaultName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountryDefaultName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguageDefaultName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageDefaultName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariant(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Variant")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

