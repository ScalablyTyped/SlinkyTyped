package typingsSlinky.googlemaps.google.maps

import typingsSlinky.googlemaps.google.maps.places._LocationBias
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object literals are accepted in place of {@link LatLng} objects, as a
  * convenience, in many places. These are converted to {@link LatLng} objects
  * when the Maps API encounters them.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#LatLngLiteral Maps JavaScript API}
  */
@js.native
trait LatLngLiteral extends _LocationBias {
  
  /**
    * Latitude in degrees. Values will be clamped to the range [-90, 90]. This
    * means that if the value specified is less than -90, it will be set to
    * -90. And if the value is greater than 90, it will be set to 90.
    */
  var lat: Double = js.native
  
  /**
    * Longitude in degrees. Values outside the range [-180, 180] will be
    * wrapped so that they fall within the range. For example, a value of -190
    * will be converted to 170. A value of 190 will be converted to -170. This
    * reflects the fact that longitudes wrap around the globe.
    */
  var lng: Double = js.native
}
object LatLngLiteral {
  
  @scala.inline
  def apply(lat: Double, lng: Double): LatLngLiteral = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[LatLngLiteral]
  }
  
  @scala.inline
  implicit class LatLngLiteralOps[Self <: LatLngLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLat(value: Double): Self = this.set("lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLng(value: Double): Self = this.set("lng", value.asInstanceOf[js.Any])
  }
}
