package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGeoLocationRequest extends js.Object {
  /**
    * Amazon Route 53 supports the following continent codes:    AF: Africa    AN: Antarctica    AS: Asia    EU: Europe    OC: Oceania    NA: North America    SA: South America  
    */
  var ContinentCode: js.UndefOr[GeoLocationContinentCode] = js.native
  /**
    * Amazon Route 53 uses the two-letter country codes that are specified in ISO standard 3166-1 alpha-2.
    */
  var CountryCode: js.UndefOr[GeoLocationCountryCode] = js.native
  /**
    * Amazon Route 53 uses the one- to three-letter subdivision codes that are specified in ISO standard 3166-1 alpha-2. Route 53 doesn't support subdivision codes for all countries. If you specify subdivisioncode, you must also specify countrycode. 
    */
  var SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.native
}

object GetGeoLocationRequest {
  @scala.inline
  def apply(): GetGeoLocationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGeoLocationRequest]
  }
  @scala.inline
  implicit class GetGeoLocationRequestOps[Self <: GetGeoLocationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContinentCode(value: GeoLocationContinentCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContinentCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinentCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContinentCode")(js.undefined)
        ret
    }
    @scala.inline
    def withCountryCode(value: GeoLocationCountryCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountryCode")(js.undefined)
        ret
    }
    @scala.inline
    def withSubdivisionCode(value: GeoLocationSubdivisionCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubdivisionCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubdivisionCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubdivisionCode")(js.undefined)
        ret
    }
  }
  
}

