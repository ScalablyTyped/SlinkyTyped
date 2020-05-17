package typingsSlinky.absSvgPath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.absSvgPath.mod.RelVerticalCommand
  - typingsSlinky.absSvgPath.mod.AbsVerticalCommand
*/
trait VerticalCommand extends AnyCommand

object VerticalCommand {
  @scala.inline
  implicit def apply(value: AbsVerticalCommand | RelVerticalCommand): VerticalCommand = value.asInstanceOf[VerticalCommand]
}

