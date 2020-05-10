package typingsSlinky.countryCodeLookup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountryCode extends js.Object {
  var capital: String = js.native
  var continent: String = js.native
  var country: String = js.native
  var fips: String = js.native
  var internet: String = js.native
  var iso2: String = js.native
  var iso3: String = js.native
  var isoNo: String = js.native
  var region: String = js.native
}

object CountryCode {
  @scala.inline
  def apply(
    capital: String,
    continent: String,
    country: String,
    fips: String,
    internet: String,
    iso2: String,
    iso3: String,
    isoNo: String,
    region: String
  ): CountryCode = {
    val __obj = js.Dynamic.literal(capital = capital.asInstanceOf[js.Any], continent = continent.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], fips = fips.asInstanceOf[js.Any], internet = internet.asInstanceOf[js.Any], iso2 = iso2.asInstanceOf[js.Any], iso3 = iso3.asInstanceOf[js.Any], isoNo = isoNo.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountryCode]
  }
  @scala.inline
  implicit class CountryCodeOps[Self <: CountryCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapital(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capital")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContinent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFips(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInternet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIso2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iso2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIso3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iso3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsoNo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isoNo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

