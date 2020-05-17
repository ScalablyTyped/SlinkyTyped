package typingsSlinky.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.navermaps.naver.maps.PointBoundsArrayLiteral
  - typingsSlinky.navermaps.naver.maps.PointBoundsObjectLiteral
*/
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.navermaps.naver.maps.BoundsLiteral because Already inherited */ trait PointBoundsLiteral extends LatLngBoundsLiteral

object PointBoundsLiteral {
  @scala.inline
  implicit def apply(value: PointBoundsArrayLiteral): PointBoundsLiteral = value.asInstanceOf[PointBoundsLiteral]
  @scala.inline
  implicit def apply(value: PointBoundsObjectLiteral): PointBoundsLiteral = value.asInstanceOf[PointBoundsLiteral]
}

