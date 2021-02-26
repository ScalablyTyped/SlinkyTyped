package typingsSlinky.ngCordova.ngCordova

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeoPosition extends StObject {
  
  var coords: IGeoCoordinates = js.native
  
  var timestamp: js.Date = js.native
}
object IGeoPosition {
  
  @scala.inline
  def apply(coords: IGeoCoordinates, timestamp: js.Date): IGeoPosition = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoPosition]
  }
  
  @scala.inline
  implicit class IGeoPositionMutableBuilder[Self <: IGeoPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoords(value: IGeoCoordinates): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
