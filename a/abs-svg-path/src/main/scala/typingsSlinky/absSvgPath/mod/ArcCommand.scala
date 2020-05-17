package typingsSlinky.absSvgPath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.absSvgPath.mod.RelArcCommand
  - typingsSlinky.absSvgPath.mod.AbsArcCommand
*/
trait ArcCommand extends AnyCommand

object ArcCommand {
  @scala.inline
  implicit def apply(value: AbsArcCommand | RelArcCommand): ArcCommand = value.asInstanceOf[ArcCommand]
}

