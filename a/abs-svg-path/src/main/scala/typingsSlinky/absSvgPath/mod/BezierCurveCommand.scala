package typingsSlinky.absSvgPath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.absSvgPath.mod.RelBezierCurveCommand
  - typingsSlinky.absSvgPath.mod.AbsBezierCurveCommand
*/
trait BezierCurveCommand extends AnyCommand

object BezierCurveCommand {
  @scala.inline
  implicit def apply(value: AbsBezierCurveCommand | RelBezierCurveCommand): BezierCurveCommand = value.asInstanceOf[BezierCurveCommand]
}

