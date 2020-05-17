package typingsSlinky.reapop.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reapop.mod.TOP
  - typingsSlinky.reapop.mod.TOP_CENTER
  - typingsSlinky.reapop.mod.TOP_LEFT_POSITION
  - typingsSlinky.reapop.mod.TOP_RIGHT_POSITION
  - typingsSlinky.reapop.mod.BOTTOM
  - typingsSlinky.reapop.mod.BOTTOM_CENTER
  - typingsSlinky.reapop.mod.BOTTOM_LEFT_POSITION
  - typingsSlinky.reapop.mod.BOTTOM_RIGHT_POSITION
*/
trait POSITION extends js.Object

object POSITION {
  @scala.inline
  implicit def apply(
    value: BOTTOM | BOTTOM_CENTER | BOTTOM_LEFT_POSITION | BOTTOM_RIGHT_POSITION | TOP | TOP_CENTER | TOP_LEFT_POSITION | TOP_RIGHT_POSITION
  ): POSITION = value.asInstanceOf[POSITION]
}

