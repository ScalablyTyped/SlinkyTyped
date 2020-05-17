package typingsSlinky.absSvgPath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.absSvgPath.mod.MoveCommand
  - typingsSlinky.absSvgPath.mod.LineCommand
  - typingsSlinky.absSvgPath.mod.HorizontalCommand
  - typingsSlinky.absSvgPath.mod.VerticalCommand
  - typingsSlinky.absSvgPath.mod.ClosePathCommand
  - typingsSlinky.absSvgPath.mod.BezierCurveCommand
  - typingsSlinky.absSvgPath.mod.FollowingBezierCurveCommand
  - typingsSlinky.absSvgPath.mod.QuadraticCurveCommand
  - typingsSlinky.absSvgPath.mod.FollowingQuadraticCurveCommand
  - typingsSlinky.absSvgPath.mod.ArcCommand
*/
trait AnyCommand extends js.Object

object AnyCommand {
  @scala.inline
  implicit def apply(value: ArcCommand): AnyCommand = value.asInstanceOf[AnyCommand]
  @scala.inline
  implicit def apply(value: BezierCurveCommand): AnyCommand = value.asInstanceOf[AnyCommand]
  @scala.inline
  implicit def apply(value: ClosePathCommand): AnyCommand = value.asInstanceOf[AnyCommand]
  @scala.inline
  implicit def apply(value: FollowingBezierCurveCommand): AnyCommand = value.asInstanceOf[AnyCommand]
  @scala.inline
  implicit def apply(value: FollowingQuadraticCurveCommand): AnyCommand = value.asInstanceOf[AnyCommand]
  @scala.inline
  implicit def apply(value: HorizontalCommand): AnyCommand = value.asInstanceOf[AnyCommand]
  @scala.inline
  implicit def apply(value: LineCommand): AnyCommand = value.asInstanceOf[AnyCommand]
  @scala.inline
  implicit def apply(value: MoveCommand): AnyCommand = value.asInstanceOf[AnyCommand]
  @scala.inline
  implicit def apply(value: QuadraticCurveCommand): AnyCommand = value.asInstanceOf[AnyCommand]
  @scala.inline
  implicit def apply(value: VerticalCommand): AnyCommand = value.asInstanceOf[AnyCommand]
}

