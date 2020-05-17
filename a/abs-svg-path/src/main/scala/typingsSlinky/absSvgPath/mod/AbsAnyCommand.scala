package typingsSlinky.absSvgPath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.absSvgPath.mod.AbsMoveCommand
  - typingsSlinky.absSvgPath.mod.AbsLineCommand
  - typingsSlinky.absSvgPath.mod.AbsHorizontalCommand
  - typingsSlinky.absSvgPath.mod.AbsVerticalCommand
  - typingsSlinky.absSvgPath.mod.AbsClosePathCommand
  - typingsSlinky.absSvgPath.mod.AbsBezierCurveCommand
  - typingsSlinky.absSvgPath.mod.AbsFollowingBezierCurveCommand
  - typingsSlinky.absSvgPath.mod.AbsQuadraticCurveCommand
  - typingsSlinky.absSvgPath.mod.AbsFollowingQuadraticCurveCommand
  - typingsSlinky.absSvgPath.mod.AbsArcCommand
*/
trait AbsAnyCommand extends js.Object

object AbsAnyCommand {
  @scala.inline
  implicit def apply(
    value: AbsFollowingBezierCurveCommand | AbsFollowingQuadraticCurveCommand | AbsHorizontalCommand | AbsLineCommand | AbsMoveCommand | AbsQuadraticCurveCommand | AbsVerticalCommand
  ): AbsAnyCommand = value.asInstanceOf[AbsAnyCommand]
  @scala.inline
  implicit def apply(value: AbsArcCommand): AbsAnyCommand = value.asInstanceOf[AbsAnyCommand]
  @scala.inline
  implicit def apply(value: AbsBezierCurveCommand): AbsAnyCommand = value.asInstanceOf[AbsAnyCommand]
  @scala.inline
  implicit def apply(value: AbsClosePathCommand): AbsAnyCommand = value.asInstanceOf[AbsAnyCommand]
}

