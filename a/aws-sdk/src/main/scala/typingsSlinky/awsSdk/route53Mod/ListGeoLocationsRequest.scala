package typingsSlinky.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGeoLocationsRequest extends StObject {
  
  /**
    * (Optional) The maximum number of geolocations to be included in the response body for this request. If more than maxitems geolocations remain to be listed, then the value of the IsTruncated element in the response is true.
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.native
  
  /**
    * The code for the continent with which you want to start listing locations that Amazon Route 53 supports for geolocation. If Route 53 has already returned a page or more of results, if IsTruncated is true, and if NextContinentCode from the previous response has a value, enter that value in startcontinentcode to return the next page of results. Include startcontinentcode only if you want to list continents. Don't include startcontinentcode when you're listing countries or countries with their subdivisions.
    */
  var StartContinentCode: js.UndefOr[GeoLocationContinentCode] = js.native
  
  /**
    * The code for the country with which you want to start listing locations that Amazon Route 53 supports for geolocation. If Route 53 has already returned a page or more of results, if IsTruncated is true, and if NextCountryCode from the previous response has a value, enter that value in startcountrycode to return the next page of results.
    */
  var StartCountryCode: js.UndefOr[GeoLocationCountryCode] = js.native
  
  /**
    * The code for the state of the United States with which you want to start listing locations that Amazon Route 53 supports for geolocation. If Route 53 has already returned a page or more of results, if IsTruncated is true, and if NextSubdivisionCode from the previous response has a value, enter that value in startsubdivisioncode to return the next page of results. To list subdivisions (U.S. states), you must include both startcountrycode and startsubdivisioncode.
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
  implicit class ListGeoLocationsRequestMutableBuilder[Self <: ListGeoLocationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxItems(value: PageMaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    
    @scala.inline
    def setStartContinentCode(value: GeoLocationContinentCode): Self = StObject.set(x, "StartContinentCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartContinentCodeUndefined: Self = StObject.set(x, "StartContinentCode", js.undefined)
    
    @scala.inline
    def setStartCountryCode(value: GeoLocationCountryCode): Self = StObject.set(x, "StartCountryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartCountryCodeUndefined: Self = StObject.set(x, "StartCountryCode", js.undefined)
    
    @scala.inline
    def setStartSubdivisionCode(value: GeoLocationSubdivisionCode): Self = StObject.set(x, "StartSubdivisionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartSubdivisionCodeUndefined: Self = StObject.set(x, "StartSubdivisionCode", js.undefined)
  }
}
