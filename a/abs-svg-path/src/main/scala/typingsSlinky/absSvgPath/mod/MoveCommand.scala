package typingsSlinky.absSvgPath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.absSvgPath.mod.RelMoveCommand
  - typingsSlinky.absSvgPath.mod.AbsMoveCommand
*/
trait MoveCommand extends AnyCommand

object MoveCommand {
  @scala.inline
  implicit def apply(value: AbsMoveCommand | RelMoveCommand): MoveCommand = value.asInstanceOf[MoveCommand]
}

