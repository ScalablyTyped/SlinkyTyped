package typingsSlinky.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.navermaps.naver.maps.PointLiteral
  - typingsSlinky.navermaps.naver.maps.LatLngLiteral
*/
trait CoordLiteral extends js.Object

object CoordLiteral {
  @scala.inline
  implicit def apply(value: LatLngLiteral): CoordLiteral = value.asInstanceOf[CoordLiteral]
  @scala.inline
  implicit def apply(value: PointLiteral): CoordLiteral = value.asInstanceOf[CoordLiteral]
}

