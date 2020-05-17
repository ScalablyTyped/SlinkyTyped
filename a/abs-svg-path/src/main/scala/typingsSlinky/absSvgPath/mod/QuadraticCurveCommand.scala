package typingsSlinky.absSvgPath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.absSvgPath.mod.RelQuadraticCurveCommand
  - typingsSlinky.absSvgPath.mod.AbsQuadraticCurveCommand
*/
trait QuadraticCurveCommand extends AnyCommand

object QuadraticCurveCommand {
  @scala.inline
  implicit def apply(value: AbsQuadraticCurveCommand | RelQuadraticCurveCommand): QuadraticCurveCommand = value.asInstanceOf[QuadraticCurveCommand]
}

