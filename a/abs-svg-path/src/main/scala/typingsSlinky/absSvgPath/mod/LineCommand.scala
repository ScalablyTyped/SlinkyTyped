package typingsSlinky.absSvgPath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.absSvgPath.mod.RelLineCommand
  - typingsSlinky.absSvgPath.mod.AbsLineCommand
*/
trait LineCommand extends AnyCommand

object LineCommand {
  @scala.inline
  implicit def apply(value: AbsLineCommand | RelLineCommand): LineCommand = value.asInstanceOf[LineCommand]
}

