package typingsSlinky.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrivingOptions extends StObject {
  
  var departureTime: js.Date = js.native
  
  var trafficModel: js.UndefOr[TrafficModel] = js.native
}
object DrivingOptions {
  
  @scala.inline
  def apply(departureTime: js.Date): DrivingOptions = {
    val __obj = js.Dynamic.literal(departureTime = departureTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrivingOptions]
  }
  
  @scala.inline
  implicit class DrivingOptionsMutableBuilder[Self <: DrivingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDepartureTime(value: js.Date): Self = StObject.set(x, "departureTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficModel(value: TrafficModel): Self = StObject.set(x, "trafficModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficModelUndefined: Self = StObject.set(x, "trafficModel", js.undefined)
  }
}
