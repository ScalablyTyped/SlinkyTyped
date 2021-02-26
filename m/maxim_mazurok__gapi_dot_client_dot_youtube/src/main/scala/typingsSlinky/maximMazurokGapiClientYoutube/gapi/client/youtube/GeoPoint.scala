package typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoPoint extends StObject {
  
  /** Altitude above the reference ellipsoid, in meters. */
  var altitude: js.UndefOr[Double] = js.native
  
  /** Latitude in degrees. */
  var latitude: js.UndefOr[Double] = js.native
  
  /** Longitude in degrees. */
  var longitude: js.UndefOr[Double] = js.native
}
object GeoPoint {
  
  @scala.inline
  def apply(): GeoPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoPoint]
  }
  
  @scala.inline
  implicit class GeoPointMutableBuilder[Self <: GeoPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
  }
}
