package typingsSlinky.appleMapkitJsBrowser.mapkit

import typingsSlinky.appleMapkitJsBrowser.mapkit.Directions.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The requested start and end points for a route, as well as the planned mode of transportation.
  */
@js.native
trait DirectionsRequest extends StObject {
  
  /**
    * The arrival date for the trip.
    */
  var arrivalDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The departure date for the trip.
    */
  var departureDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The end point for routing directions.
    */
  var destination: String | Coordinate | Place = js.native
  
  /**
    * The start point for routing directions.
    */
  var origin: String | Coordinate | Place = js.native
  
  /**
    * A Boolean value that indicates whether the server should return multiple
    * routes when they are available.
    */
  var requestsAlternateRoutes: js.UndefOr[Boolean] = js.native
  
  /**
    * The mode of transportation to which directions should apply.
    */
  var transportType: js.UndefOr[Transport] = js.native
}
object DirectionsRequest {
  
  @scala.inline
  def apply(destination: String | Coordinate | Place, origin: String | Coordinate | Place): DirectionsRequest = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsRequest]
  }
  
  @scala.inline
  implicit class DirectionsRequestMutableBuilder[Self <: DirectionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrivalDate(value: js.Date): Self = StObject.set(x, "arrivalDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrivalDateUndefined: Self = StObject.set(x, "arrivalDate", js.undefined)
    
    @scala.inline
    def setDepartureDate(value: js.Date): Self = StObject.set(x, "departureDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepartureDateUndefined: Self = StObject.set(x, "departureDate", js.undefined)
    
    @scala.inline
    def setDestination(value: String | Coordinate | Place): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: String | Coordinate | Place): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsAlternateRoutes(value: Boolean): Self = StObject.set(x, "requestsAlternateRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsAlternateRoutesUndefined: Self = StObject.set(x, "requestsAlternateRoutes", js.undefined)
    
    @scala.inline
    def setTransportType(value: Transport): Self = StObject.set(x, "transportType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportTypeUndefined: Self = StObject.set(x, "transportType", js.undefined)
  }
}
