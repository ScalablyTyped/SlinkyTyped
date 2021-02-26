package typingsSlinky.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.getGeoLocation()
@js.native
trait GeoLocationResult extends StObject {
  
  var latitude: Double = js.native
  
  var longitude: Double = js.native
}
object GeoLocationResult {
  
  @scala.inline
  def apply(latitude: Double, longitude: Double): GeoLocationResult = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoLocationResult]
  }
  
  @scala.inline
  implicit class GeoLocationResultMutableBuilder[Self <: GeoLocationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
