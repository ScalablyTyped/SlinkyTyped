package typingsSlinky.appleMapkitJsBrowser.mapkit

import typingsSlinky.appleMapkitJsBrowser.mapkit.Directions.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options you may provide for requesting estimated arrival times.
  */
@js.native
trait EtaRequestOptions extends StObject {
  
  /**
    * The mode of transportation the server uses when estimating arrival times.
    */
  var departureDate: js.Date = js.native
  
  /**
    * The time of departure used in an estimated arrival time request.
    */
  var destinations: js.Array[Coordinate] = js.native
  
  /**
    * The starting point for estimated arrival time requests.
    */
  var origin: Coordinate = js.native
  
  /**
    * An array of coordinates that represent end points for estimated arrival time requests.
    */
  var transportType: Transport = js.native
}
object EtaRequestOptions {
  
  @scala.inline
  def apply(
    departureDate: js.Date,
    destinations: js.Array[Coordinate],
    origin: Coordinate,
    transportType: Transport
  ): EtaRequestOptions = {
    val __obj = js.Dynamic.literal(departureDate = departureDate.asInstanceOf[js.Any], destinations = destinations.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], transportType = transportType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EtaRequestOptions]
  }
  
  @scala.inline
  implicit class EtaRequestOptionsMutableBuilder[Self <: EtaRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDepartureDate(value: js.Date): Self = StObject.set(x, "departureDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinations(value: js.Array[Coordinate]): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationsVarargs(value: Coordinate*): Self = StObject.set(x, "destinations", js.Array(value :_*))
    
    @scala.inline
    def setOrigin(value: Coordinate): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportType(value: Transport): Self = StObject.set(x, "transportType", value.asInstanceOf[js.Any])
  }
}
