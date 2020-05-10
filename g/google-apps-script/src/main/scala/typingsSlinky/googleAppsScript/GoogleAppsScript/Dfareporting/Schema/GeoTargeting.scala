package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoTargeting extends js.Object {
  var cities: js.UndefOr[js.Array[City]] = js.native
  var countries: js.UndefOr[js.Array[Country]] = js.native
  var excludeCountries: js.UndefOr[Boolean] = js.native
  var metros: js.UndefOr[js.Array[Metro]] = js.native
  var postalCodes: js.UndefOr[js.Array[PostalCode]] = js.native
  var regions: js.UndefOr[js.Array[Region]] = js.native
}

object GeoTargeting {
  @scala.inline
  def apply(): GeoTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoTargeting]
  }
  @scala.inline
  implicit class GeoTargetingOps[Self <: GeoTargeting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCities(value: js.Array[City]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cities")(js.undefined)
        ret
    }
    @scala.inline
    def withCountries(value: js.Array[Country]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countries")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeCountries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeCountries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeCountries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeCountries")(js.undefined)
        ret
    }
    @scala.inline
    def withMetros(value: js.Array[Metro]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metros")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetros: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metros")(js.undefined)
        ret
    }
    @scala.inline
    def withPostalCodes(value: js.Array[PostalCode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostalCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCodes")(js.undefined)
        ret
    }
    @scala.inline
    def withRegions(value: js.Array[Region]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(js.undefined)
        ret
    }
  }
  
}

