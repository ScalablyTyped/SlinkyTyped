package typingsSlinky.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Duration extends StObject {
  
  var duration: Double = js.native
  
  var stations: js.Array[Station | Stop | Location] = js.native
}
object Duration {
  
  @scala.inline
  def apply(duration: Double, stations: js.Array[Station | Stop | Location]): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], stations = stations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  
  @scala.inline
  implicit class DurationMutableBuilder[Self <: Duration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStations(value: js.Array[Station | Stop | Location]): Self = StObject.set(x, "stations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStationsVarargs(value: (Station | Stop | Location)*): Self = StObject.set(x, "stations", js.Array(value :_*))
  }
}
