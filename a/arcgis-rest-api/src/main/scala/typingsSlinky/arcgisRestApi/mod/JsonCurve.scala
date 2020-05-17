package typingsSlinky.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arcgisRestApi.mod.CircularArc
  - typingsSlinky.arcgisRestApi.mod.Arc
  - typingsSlinky.arcgisRestApi.mod.OldCircularArc
  - typingsSlinky.arcgisRestApi.mod.BezierCurve
*/
trait JsonCurve extends js.Object

object JsonCurve {
  @scala.inline
  implicit def apply(value: Arc): JsonCurve = value.asInstanceOf[JsonCurve]
  @scala.inline
  implicit def apply(value: BezierCurve): JsonCurve = value.asInstanceOf[JsonCurve]
  @scala.inline
  implicit def apply(value: CircularArc): JsonCurve = value.asInstanceOf[JsonCurve]
  @scala.inline
  implicit def apply(value: OldCircularArc): JsonCurve = value.asInstanceOf[JsonCurve]
}

