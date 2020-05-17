package typingsSlinky.absSvgPath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.absSvgPath.mod.RelClosePathCommand
  - typingsSlinky.absSvgPath.mod.AbsClosePathCommand
*/
trait ClosePathCommand extends AnyCommand

object ClosePathCommand {
  @scala.inline
  implicit def apply(value: AbsClosePathCommand | RelClosePathCommand): ClosePathCommand = value.asInstanceOf[ClosePathCommand]
}

