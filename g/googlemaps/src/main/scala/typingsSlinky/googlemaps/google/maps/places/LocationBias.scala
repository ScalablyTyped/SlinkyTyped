package typingsSlinky.googlemaps.google.maps.places

import typingsSlinky.googlemaps.google.maps.Circle
import typingsSlinky.googlemaps.google.maps.CircleLiteral
import typingsSlinky.googlemaps.google.maps.LatLng
import typingsSlinky.googlemaps.google.maps.LatLngBounds
import typingsSlinky.googlemaps.google.maps.LatLngBoundsLiteral
import typingsSlinky.googlemaps.google.maps.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googlemaps.google.maps.LatLng
  - typingsSlinky.googlemaps.google.maps.LatLngLiteral
  - typingsSlinky.googlemaps.google.maps.LatLngBounds
  - typingsSlinky.googlemaps.google.maps.LatLngBoundsLiteral
  - typingsSlinky.googlemaps.google.maps.Circle
  - typingsSlinky.googlemaps.google.maps.CircleLiteral
  - java.lang.String
*/
trait LocationBias extends js.Object

object LocationBias {
  @scala.inline
  implicit def apply(value: Circle): LocationBias = value.asInstanceOf[LocationBias]
  @scala.inline
  implicit def apply(value: CircleLiteral): LocationBias = value.asInstanceOf[LocationBias]
  @scala.inline
  implicit def apply(value: LatLng): LocationBias = value.asInstanceOf[LocationBias]
  @scala.inline
  implicit def apply(value: LatLngBounds): LocationBias = value.asInstanceOf[LocationBias]
  @scala.inline
  implicit def apply(value: LatLngBoundsLiteral): LocationBias = value.asInstanceOf[LocationBias]
  @scala.inline
  implicit def apply(value: LatLngLiteral): LocationBias = value.asInstanceOf[LocationBias]
  @scala.inline
  implicit def apply(value: String): LocationBias = value.asInstanceOf[LocationBias]
}

