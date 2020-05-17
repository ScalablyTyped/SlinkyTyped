package typingsSlinky.absSvgPath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.absSvgPath.mod.RelFollowingQuadraticCurveCommand
  - typingsSlinky.absSvgPath.mod.AbsFollowingQuadraticCurveCommand
*/
trait FollowingQuadraticCurveCommand extends AnyCommand

object FollowingQuadraticCurveCommand {
  @scala.inline
  implicit def apply(value: AbsFollowingQuadraticCurveCommand | RelFollowingQuadraticCurveCommand): FollowingQuadraticCurveCommand = value.asInstanceOf[FollowingQuadraticCurveCommand]
}

