package typingsSlinky.expoLocation.locationTypesMod

import typingsSlinky.expoLocation.anon.Accuracy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationObject extends StObject {
  
  var coords: Accuracy = js.native
  
  var timestamp: Double = js.native
}
object LocationObject {
  
  @scala.inline
  def apply(coords: Accuracy, timestamp: Double): LocationObject = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationObject]
  }
  
  @scala.inline
  implicit class LocationObjectMutableBuilder[Self <: LocationObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoords(value: Accuracy): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
