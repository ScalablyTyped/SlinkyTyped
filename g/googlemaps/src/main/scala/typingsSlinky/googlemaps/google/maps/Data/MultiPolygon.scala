package typingsSlinky.googlemaps.google.maps.Data

import typingsSlinky.googlemaps.google.maps.LatLng
import typingsSlinky.googlemaps.google.maps.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.Data.MultiPolygon")
@js.native
class MultiPolygon protected () extends Geometry {
  def this(elements: js.Array[
        typingsSlinky.googlemaps.google.maps.Data.Polygon | (js.Array[LinearRing | (js.Array[LatLng | LatLngLiteral])])
      ]) = this()
  def getArray(): js.Array[typingsSlinky.googlemaps.google.maps.Data.Polygon] = js.native
  def getAt(n: Double): typingsSlinky.googlemaps.google.maps.Data.Polygon = js.native
  def getLength(): Double = js.native
}

