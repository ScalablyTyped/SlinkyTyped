package typingsSlinky.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.navermaps.naver.maps.Point
  - typingsSlinky.navermaps.naver.maps.LatLng
*/
trait Coord extends js.Object

object Coord {
  @scala.inline
  implicit def apply(value: LatLng): Coord = value.asInstanceOf[Coord]
  @scala.inline
  implicit def apply(value: Point): Coord = value.asInstanceOf[Coord]
}

