package typingsSlinky.googlemaps.global.google.maps

import typingsSlinky.googlemaps.google.maps.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A LatLng is a point in geographical coordinates: latitude and longitude.
  *
  * * Latitude ranges between -90 and 90 degrees, inclusive. Values above or
  *   below this range will be clamped to the range [-90, 90]. This means
  *   that if the value specified is less than -90, it will be set to -90.
  *   And if the value is greater than 90, it will be set to 90.
  * * Longitude ranges between -180 and 180 degrees, inclusive. Values above
  *   or below this range will be wrapped so that they fall within the
  *   range. For example, a value of -190 will be converted to 170. A value
  *   of 190 will be converted to -170. This reflects the fact that
  *   longitudes wrap around the globe.
  *
  * Although the default map projection associates longitude with the
  * x-coordinate of the map, and latitude with the y-coordinate, the
  * latitude coordinate is always written first, followed by the longitude.
  * Notice that you cannot modify the coordinates of a LatLng. If you want
  * to compute another point, you have to create a new one.
  */
@JSGlobal("google.maps.LatLng")
@js.native
class LatLng protected ()
  extends typingsSlinky.googlemaps.google.maps.LatLng {
  /**
    * Creates a LatLng object representing a geographic point.
    * @param literal Object literal.
    * @param noWrap Set noWrap to true to enable values outside of this range.
    */
  def this(literal: LatLngLiteral) = this()
  /**
    * Creates a LatLng object representing a geographic point.
    * Note the ordering of latitude and longitude.
    * @param lat Latitude is specified in degrees within the range [-90, 90].
    * @param lng Longitude is specified in degrees within the range [-180,
    *     180].
    * @param noWrap Set noWrap to true to enable values outside of this range.
    */
  def this(lat: Double, lng: Double) = this()
  def this(literal: LatLngLiteral, noWrap: Boolean) = this()
  def this(lat: Double, lng: Double, noWrap: Boolean) = this()
}
