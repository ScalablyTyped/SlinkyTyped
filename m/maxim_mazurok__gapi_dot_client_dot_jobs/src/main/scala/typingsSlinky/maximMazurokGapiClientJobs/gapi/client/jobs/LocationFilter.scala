package typingsSlinky.maximMazurokGapiClientJobs.gapi.client.jobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationFilter extends js.Object {
  
  /** Optional. The address name, such as "Mountain View" or "Bay Area". */
  var address: js.UndefOr[String] = js.native
  
  /**
    * Optional. The distance_in_miles is applied when the location being searched for is identified as a city or smaller. When the location being searched for is a state or larger, this
    * field is ignored.
    */
  var distanceInMiles: js.UndefOr[Double] = js.native
  
  /** Optional. The latitude and longitude of the geographic center from which to search. This field's ignored if `address` is provided. */
  var latLng: js.UndefOr[LatLng] = js.native
  
  /**
    * Optional. CLDR region code of the country/region of the address. This is used to address ambiguity of the user-input location, for example, "Liverpool" against "Liverpool, NY, US"
    * or "Liverpool, UK". Set this field if all the jobs to search against are from a same region, or jobs are world-wide, but the job seeker is from a specific region. See
    * http://cldr.unicode.org/ and http://www.unicode.org/cldr/charts/30/supplemental/territory_information.html for details. Example: "CH" for Switzerland.
    */
  var regionCode: js.UndefOr[String] = js.native
  
  /**
    * Optional. Allows the client to return jobs without a set location, specifically, telecommuting jobs (telecommuting is considered by the service as a special location.
    * Job.posting_region indicates if a job permits telecommuting. If this field is set to TelecommutePreference.TELECOMMUTE_ALLOWED, telecommuting jobs are searched, and address and
    * lat_lng are ignored. If not set or set to TelecommutePreference.TELECOMMUTE_EXCLUDED, telecommute job are not searched. This filter can be used by itself to search exclusively for
    * telecommuting jobs, or it can be combined with another location filter to search for a combination of job locations, such as "Mountain View" or "telecommuting" jobs. However, when
    * used in combination with other location filters, telecommuting jobs can be treated as less relevant than other jobs in the search response.
    */
  var telecommutePreference: js.UndefOr[String] = js.native
}
object LocationFilter {
  
  @scala.inline
  def apply(): LocationFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationFilter]
  }
  
  @scala.inline
  implicit class LocationFilterOps[Self <: LocationFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setDistanceInMiles(value: Double): Self = this.set("distanceInMiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistanceInMiles: Self = this.set("distanceInMiles", js.undefined)
    
    @scala.inline
    def setLatLng(value: LatLng): Self = this.set("latLng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatLng: Self = this.set("latLng", js.undefined)
    
    @scala.inline
    def setRegionCode(value: String): Self = this.set("regionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionCode: Self = this.set("regionCode", js.undefined)
    
    @scala.inline
    def setTelecommutePreference(value: String): Self = this.set("telecommutePreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTelecommutePreference: Self = this.set("telecommutePreference", js.undefined)
  }
}
