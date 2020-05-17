package typingsSlinky.navermaps.global.naver.maps

import typingsSlinky.navermaps.naver.maps.Coord
import typingsSlinky.navermaps.naver.maps.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.LatLngBounds")
@js.native
class LatLngBounds protected ()
  extends typingsSlinky.navermaps.naver.maps.LatLngBounds {
  def this(sw: typingsSlinky.navermaps.naver.maps.LatLng, ne: typingsSlinky.navermaps.naver.maps.LatLng) = this()
}

/* static members */
@JSGlobal("naver.maps.LatLngBounds")
@js.native
object LatLngBounds extends js.Object {
  def bounds(latlng: Coord, latlngN: Coord): typingsSlinky.navermaps.naver.maps.LatLngBounds = js.native
  def bounds(latlng: Coord, latlngN: LatLngLiteral): typingsSlinky.navermaps.naver.maps.LatLngBounds = js.native
  def bounds(latlng: LatLngLiteral, latlngN: Coord): typingsSlinky.navermaps.naver.maps.LatLngBounds = js.native
  def bounds(latlng: LatLngLiteral, latlngN: LatLngLiteral): typingsSlinky.navermaps.naver.maps.LatLngBounds = js.native
}

