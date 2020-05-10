package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGeoLocationsResponse extends js.Object {
  /**
    * A complex type that contains one GeoLocationDetails element for each location that Amazon Route 53 supports for geolocation.
    */
  var GeoLocationDetailsList: typingsSlinky.awsSdk.route53Mod.GeoLocationDetailsList = js.native
  /**
    * A value that indicates whether more locations remain to be listed after the last location in this response. If so, the value of IsTruncated is true. To get more values, submit another request and include the values of NextContinentCode, NextCountryCode, and NextSubdivisionCode in the startcontinentcode, startcountrycode, and startsubdivisioncode, as applicable.
    */
  var IsTruncated: PageTruncated = js.native
  /**
    * The value that you specified for MaxItems in the request.
    */
  var MaxItems: PageMaxItems = js.native
  /**
    * If IsTruncated is true, you can make a follow-up request to display more locations. Enter the value of NextContinentCode in the startcontinentcode parameter in another ListGeoLocations request.
    */
  var NextContinentCode: js.UndefOr[GeoLocationContinentCode] = js.native
  /**
    * If IsTruncated is true, you can make a follow-up request to display more locations. Enter the value of NextCountryCode in the startcountrycode parameter in another ListGeoLocations request.
    */
  var NextCountryCode: js.UndefOr[GeoLocationCountryCode] = js.native
  /**
    * If IsTruncated is true, you can make a follow-up request to display more locations. Enter the value of NextSubdivisionCode in the startsubdivisioncode parameter in another ListGeoLocations request.
    */
  var NextSubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.native
}

object ListGeoLocationsResponse {
  @scala.inline
  def apply(GeoLocationDetailsList: GeoLocationDetailsList, IsTruncated: PageTruncated, MaxItems: PageMaxItems): ListGeoLocationsResponse = {
    val __obj = js.Dynamic.literal(GeoLocationDetailsList = GeoLocationDetailsList.asInstanceOf[js.Any], IsTruncated = IsTruncated.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGeoLocationsResponse]
  }
  @scala.inline
  implicit class ListGeoLocationsResponseOps[Self <: ListGeoLocationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeoLocationDetailsList(value: GeoLocationDetailsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GeoLocationDetailsList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTruncated(value: PageTruncated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsTruncated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxItems(value: PageMaxItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextContinentCode(value: GeoLocationContinentCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextContinentCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextContinentCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextContinentCode")(js.undefined)
        ret
    }
    @scala.inline
    def withNextCountryCode(value: GeoLocationCountryCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextCountryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextCountryCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextCountryCode")(js.undefined)
        ret
    }
    @scala.inline
    def withNextSubdivisionCode(value: GeoLocationSubdivisionCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextSubdivisionCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextSubdivisionCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextSubdivisionCode")(js.undefined)
        ret
    }
  }
  
}

