package typingsSlinky.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.navermaps.naver.maps.PointBoundsLiteral
  - typingsSlinky.navermaps.naver.maps.LatLngBoundsObjectLiteral
*/
trait LatLngBoundsLiteral extends BoundsLiteral

object LatLngBoundsLiteral {
  @scala.inline
  implicit def apply(value: LatLngBoundsObjectLiteral): LatLngBoundsLiteral = value.asInstanceOf[LatLngBoundsLiteral]
  @scala.inline
  implicit def apply(value: PointBoundsLiteral): LatLngBoundsLiteral = value.asInstanceOf[LatLngBoundsLiteral]
}

