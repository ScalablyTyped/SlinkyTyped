package typingsSlinky.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.navermaps.naver.maps.PointBounds
  - typingsSlinky.navermaps.naver.maps.LatLngBounds
*/
trait Bounds extends js.Object

object Bounds {
  @scala.inline
  implicit def apply(value: LatLngBounds): Bounds = value.asInstanceOf[Bounds]
  @scala.inline
  implicit def apply(value: PointBounds): Bounds = value.asInstanceOf[Bounds]
}

