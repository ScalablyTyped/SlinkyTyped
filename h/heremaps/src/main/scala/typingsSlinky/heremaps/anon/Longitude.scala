package typingsSlinky.heremaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Longitude extends StObject {
  
  var Latitude: Double = js.native
  
  var Longitude: Double = js.native
}
object Longitude {
  
  @scala.inline
  def apply(Latitude: Double, Longitude: Double): Longitude = {
    val __obj = js.Dynamic.literal(Latitude = Latitude.asInstanceOf[js.Any], Longitude = Longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Longitude]
  }
  
  @scala.inline
  implicit class LongitudeMutableBuilder[Self <: Longitude] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "Latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "Longitude", value.asInstanceOf[js.Any])
  }
}
