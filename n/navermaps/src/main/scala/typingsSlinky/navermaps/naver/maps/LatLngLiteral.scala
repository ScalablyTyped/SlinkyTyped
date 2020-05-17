package typingsSlinky.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.navermaps.naver.maps.PointLiteral
  - typingsSlinky.navermaps.naver.maps.LatLngObjectLiteral
*/
trait LatLngLiteral extends CoordLiteral

object LatLngLiteral {
  @scala.inline
  implicit def apply(value: LatLngObjectLiteral): LatLngLiteral = value.asInstanceOf[LatLngLiteral]
  @scala.inline
  implicit def apply(value: PointLiteral): LatLngLiteral = value.asInstanceOf[LatLngLiteral]
}

