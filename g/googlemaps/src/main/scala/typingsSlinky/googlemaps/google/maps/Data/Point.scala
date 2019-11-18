package typingsSlinky.googlemaps.google.maps.Data

import typingsSlinky.googlemaps.google.maps.LatLng
import typingsSlinky.googlemaps.google.maps.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.Data.Point")
@js.native
class Point protected () extends Geometry {
  def this(latLng: LatLng) = this()
  def this(latLng: LatLngLiteral) = this()
  def get(): LatLng = js.native
}

