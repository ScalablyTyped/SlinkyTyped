package typingsSlinky.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.navermaps.naver.maps.PointBoundsLiteral
  - typingsSlinky.navermaps.naver.maps.LatLngBoundsLiteral
*/
trait BoundsLiteral extends js.Object

object BoundsLiteral {
  @scala.inline
  implicit def apply(value: LatLngBoundsLiteral): BoundsLiteral = value.asInstanceOf[BoundsLiteral]
  @scala.inline
  implicit def apply(value: PointBoundsLiteral): BoundsLiteral = value.asInstanceOf[BoundsLiteral]
}

