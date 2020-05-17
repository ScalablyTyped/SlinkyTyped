package typingsSlinky.absSvgPath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.absSvgPath.mod.RelHorizontalCommand
  - typingsSlinky.absSvgPath.mod.AbsHorizontalCommand
*/
trait HorizontalCommand extends AnyCommand

object HorizontalCommand {
  @scala.inline
  implicit def apply(value: AbsHorizontalCommand | RelHorizontalCommand): HorizontalCommand = value.asInstanceOf[HorizontalCommand]
}

