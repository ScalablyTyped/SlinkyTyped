package typingsSlinky.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input only.  Parameters needed for commute search.
  */
@js.native
trait SchemaCommutePreference extends StObject {
  
  /**
    * Optional. If `true`, jobs without street level addresses may also be
    * returned. For city level addresses, the city center is used. For state
    * and coarser level addresses, text matching is used. If this field is set
    * to `false` or is not specified, only jobs that include street level
    * addresses will be returned by commute search.
    */
  var allowNonStreetLevelAddress: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional.  The departure hour to use to calculate traffic impact. Accepts
    * an integer between 0 and 23, representing the hour in the time zone of
    * the start_location. Must not be present if road_traffic is specified.
    */
  var departureHourLocal: js.UndefOr[Double] = js.native
  
  /**
    * Required.  The method of transportation for which to calculate the
    * commute time.
    */
  var method: js.UndefOr[String] = js.native
  
  /**
    * Optional.  Specifies the traffic density to use when calculating commute
    * time. Must not be present if departure_hour_local is specified.
    */
  var roadTraffic: js.UndefOr[String] = js.native
  
  /**
    * Required.  The latitude and longitude of the location from which to
    * calculate the commute time.
    */
  var startLocation: js.UndefOr[SchemaLatLng] = js.native
  
  /**
    * Required.  The maximum travel time in seconds. The maximum allowed value
    * is `3600s` (one hour). Format is `123s`.
    */
  var travelTime: js.UndefOr[String] = js.native
}
object SchemaCommutePreference {
  
  @scala.inline
  def apply(): SchemaCommutePreference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommutePreference]
  }
  
  @scala.inline
  implicit class SchemaCommutePreferenceMutableBuilder[Self <: SchemaCommutePreference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowNonStreetLevelAddress(value: Boolean): Self = StObject.set(x, "allowNonStreetLevelAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowNonStreetLevelAddressUndefined: Self = StObject.set(x, "allowNonStreetLevelAddress", js.undefined)
    
    @scala.inline
    def setDepartureHourLocal(value: Double): Self = StObject.set(x, "departureHourLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepartureHourLocalUndefined: Self = StObject.set(x, "departureHourLocal", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setRoadTraffic(value: String): Self = StObject.set(x, "roadTraffic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoadTrafficUndefined: Self = StObject.set(x, "roadTraffic", js.undefined)
    
    @scala.inline
    def setStartLocation(value: SchemaLatLng): Self = StObject.set(x, "startLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartLocationUndefined: Self = StObject.set(x, "startLocation", js.undefined)
    
    @scala.inline
    def setTravelTime(value: String): Self = StObject.set(x, "travelTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTravelTimeUndefined: Self = StObject.set(x, "travelTime", js.undefined)
  }
}
