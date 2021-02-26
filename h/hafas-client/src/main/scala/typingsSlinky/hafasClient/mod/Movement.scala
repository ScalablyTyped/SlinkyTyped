package typingsSlinky.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Movement extends StObject {
  
  var direction: js.UndefOr[String] = js.native
  
  var frames: js.UndefOr[js.Array[Frame]] = js.native
  
  var line: js.UndefOr[Line] = js.native
  
  var location: js.UndefOr[Location] = js.native
  
  var nextStopovers: js.UndefOr[js.Array[StopOver]] = js.native
  
  var polyline: js.UndefOr[FeatureCollection] = js.native
  
  var tripId: js.UndefOr[String] = js.native
}
object Movement {
  
  @scala.inline
  def apply(): Movement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Movement]
  }
  
  @scala.inline
  implicit class MovementMutableBuilder[Self <: Movement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setFrames(value: js.Array[Frame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
    
    @scala.inline
    def setFramesVarargs(value: Frame*): Self = StObject.set(x, "frames", js.Array(value :_*))
    
    @scala.inline
    def setLine(value: Line): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setNextStopovers(value: js.Array[StopOver]): Self = StObject.set(x, "nextStopovers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextStopoversUndefined: Self = StObject.set(x, "nextStopovers", js.undefined)
    
    @scala.inline
    def setNextStopoversVarargs(value: StopOver*): Self = StObject.set(x, "nextStopovers", js.Array(value :_*))
    
    @scala.inline
    def setPolyline(value: FeatureCollection): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolylineUndefined: Self = StObject.set(x, "polyline", js.undefined)
    
    @scala.inline
    def setTripId(value: String): Self = StObject.set(x, "tripId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTripIdUndefined: Self = StObject.set(x, "tripId", js.undefined)
  }
}
