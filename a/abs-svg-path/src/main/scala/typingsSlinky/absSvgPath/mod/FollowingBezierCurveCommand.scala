package typingsSlinky.absSvgPath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.absSvgPath.mod.RelFollowingBezierCurveCommand
  - typingsSlinky.absSvgPath.mod.AbsFollowingBezierCurveCommand
*/
trait FollowingBezierCurveCommand extends AnyCommand

object FollowingBezierCurveCommand {
  @scala.inline
  implicit def apply(value: AbsFollowingBezierCurveCommand | RelFollowingBezierCurveCommand): FollowingBezierCurveCommand = value.asInstanceOf[FollowingBezierCurveCommand]
}

