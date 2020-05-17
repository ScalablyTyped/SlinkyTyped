package typingsSlinky.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.navermaps.naver.maps.PointArrayLiteral
  - typingsSlinky.navermaps.naver.maps.PointObjectLiteral
*/
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.navermaps.naver.maps.CoordLiteral because Already inherited */ trait PointLiteral extends LatLngLiteral

object PointLiteral {
  @scala.inline
  implicit def apply(value: PointArrayLiteral): PointLiteral = value.asInstanceOf[PointLiteral]
  @scala.inline
  implicit def apply(value: PointObjectLiteral): PointLiteral = value.asInstanceOf[PointLiteral]
}

