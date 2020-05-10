package typingsSlinky.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Geographical Targeting.
  */
@js.native
trait SchemaGeoTargeting extends js.Object {
  /**
    * Cities to be targeted. For each city only dartId is required. The other
    * fields are populated automatically when the ad is inserted or updated. If
    * targeting a city, do not target or exclude the country of the city, and
    * do not target the metro or region of the city.
    */
  var cities: js.UndefOr[js.Array[SchemaCity]] = js.native
  /**
    * Countries to be targeted or excluded from targeting, depending on the
    * setting of the excludeCountries field. For each country only dartId is
    * required. The other fields are populated automatically when the ad is
    * inserted or updated. If targeting or excluding a country, do not target
    * regions, cities, metros, or postal codes in the same country.
    */
  var countries: js.UndefOr[js.Array[SchemaCountry]] = js.native
  /**
    * Whether or not to exclude the countries in the countries field from
    * targeting. If false, the countries field refers to countries which will
    * be targeted by the ad.
    */
  var excludeCountries: js.UndefOr[Boolean] = js.native
  /**
    * Metros to be targeted. For each metro only dmaId is required. The other
    * fields are populated automatically when the ad is inserted or updated. If
    * targeting a metro, do not target or exclude the country of the metro.
    */
  var metros: js.UndefOr[js.Array[SchemaMetro]] = js.native
  /**
    * Postal codes to be targeted. For each postal code only id is required.
    * The other fields are populated automatically when the ad is inserted or
    * updated. If targeting a postal code, do not target or exclude the country
    * of the postal code.
    */
  var postalCodes: js.UndefOr[js.Array[SchemaPostalCode]] = js.native
  /**
    * Regions to be targeted. For each region only dartId is required. The
    * other fields are populated automatically when the ad is inserted or
    * updated. If targeting a region, do not target or exclude the country of
    * the region.
    */
  var regions: js.UndefOr[js.Array[SchemaRegion]] = js.native
}

object SchemaGeoTargeting {
  @scala.inline
  def apply(): SchemaGeoTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGeoTargeting]
  }
  @scala.inline
  implicit class SchemaGeoTargetingOps[Self <: SchemaGeoTargeting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCities(value: js.Array[SchemaCity]): Self = {
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
    def withCountries(value: js.Array[SchemaCountry]): Self = {
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
    def withMetros(value: js.Array[SchemaMetro]): Self = {
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
    def withPostalCodes(value: js.Array[SchemaPostalCode]): Self = {
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
    def withRegions(value: js.Array[SchemaRegion]): Self = {
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

