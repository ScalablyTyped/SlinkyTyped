package typingsSlinky.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link LatLngLiteral}.
  */
@js.native
trait ReadonlyLatLngLiteral extends StObject {
  
  /**
    * @see {@link LatLngLiteral#lat}
    */
  val lat: Double = js.native
  
  /**
    * @see {@link LatLngLiteral#lng}
    */
  val lng: Double = js.native
}
object ReadonlyLatLngLiteral {
  
  @scala.inline
  def apply(lat: Double, lng: Double): ReadonlyLatLngLiteral = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyLatLngLiteral]
  }
  
  @scala.inline
  implicit class ReadonlyLatLngLiteralMutableBuilder[Self <: ReadonlyLatLngLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
  }
}
