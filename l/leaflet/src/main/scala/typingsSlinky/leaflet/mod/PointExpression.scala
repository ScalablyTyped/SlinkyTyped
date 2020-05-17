package typingsSlinky.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.leaflet.mod.Point_
  - typingsSlinky.leaflet.mod.PointTuple
*/
trait PointExpression extends js.Object

object PointExpression {
  @scala.inline
  implicit def apply(value: PointTuple): PointExpression = value.asInstanceOf[PointExpression]
  @scala.inline
  implicit def apply(value: Point_): PointExpression = value.asInstanceOf[PointExpression]
}

