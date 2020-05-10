package typingsSlinky.countrySelectJs.CountrySelectJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Set the default country by it's country code. Otherwise it will just be
    * the first country in the list.
    */
  var defaultCountry: js.UndefOr[String] = js.native
  /**
    * Display only the countries you specify. Takes an array of country codes.
    */
  var onlyCountries: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specify the countries to appear at the top of the list. Defaults to
    * ["us", "gb"]
    */
  var preferredCountries: js.UndefOr[js.Array[String]] = js.native
  /**
    * Set the dropdown's width to be the same as the input. This is
    * automatically enabled for small screens.
    */
  var responsiveDropdown: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCountry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCountry")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyCountries(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyCountries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyCountries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyCountries")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredCountries(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredCountries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredCountries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredCountries")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsiveDropdown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveDropdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsiveDropdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveDropdown")(js.undefined)
        ret
    }
  }
  
}

