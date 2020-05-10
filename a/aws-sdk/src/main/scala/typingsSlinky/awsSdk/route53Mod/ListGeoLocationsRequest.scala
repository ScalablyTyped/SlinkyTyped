package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGeoLocationsRequest extends js.Object {
  /**
    * (Optional) The maximum number of geolocations to be included in the response body for this request. If more than maxitems geolocations remain to be listed, then the value of the IsTruncated element in the response is true.
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.native
  /**
    * The code for the continent with which you want to start listing locations that Amazon Route 53 supports for geolocation. If Route 53 has already returned a page or more of results, if IsTruncated is true, and if NextContinentCode from the previous response has a value, enter that value in startcontinentcode to return the next page of results. Include startcontinentcode only if you want to list continents. Don't include startcontinentcode when you're listing countries or countries with their subdivisions.
    */
  var StartContinentCode: js.UndefOr[GeoLocationContinentCode] = js.native
  /**
    * The code for the country with which you want to start listing locations that Amazon Route 53 supports for geolocation. If Route 53 has already returned a page or more of results, if IsTruncated is true, and if NextCountryCode from the previous response has a value, enter that value in startcountrycode to return the next page of results. Route 53 uses the two-letter country codes that are specified in ISO standard 3166-1 alpha-2.
    */
  var StartCountryCode: js.UndefOr[GeoLocationCountryCode] = js.native
  /**
    * The code for the subdivision (for example, state or province) with which you want to start listing locations that Amazon Route 53 supports for geolocation. If Route 53 has already returned a page or more of results, if IsTruncated is true, and if NextSubdivisionCode from the previous response has a value, enter that value in startsubdivisioncode to return the next page of results. To list subdivisions of a country, you must include both startcountrycode and startsubdivisioncode.
    */
  var StartSubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.native
}

object ListGeoLocationsRequest {
  @scala.inline
  def apply(): ListGeoLocationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGeoLocationsRequest]
  }
  @scala.inline
  implicit class ListGeoLocationsRequestOps[Self <: ListGeoLocationsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxItems(value: PageMaxItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxItems")(js.undefined)
        ret
    }
    @scala.inline
    def withStartContinentCode(value: GeoLocationContinentCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartContinentCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartContinentCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartContinentCode")(js.undefined)
        ret
    }
    @scala.inline
    def withStartCountryCode(value: GeoLocationCountryCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartCountryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartCountryCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartCountryCode")(js.undefined)
        ret
    }
    @scala.inline
    def withStartSubdivisionCode(value: GeoLocationSubdivisionCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartSubdivisionCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartSubdivisionCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartSubdivisionCode")(js.undefined)
        ret
    }
  }
  
}

