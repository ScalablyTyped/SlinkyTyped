package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Find Constants
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.screeps.FIND_EXIT_TOP
  - typingsSlinky.screeps.FIND_EXIT_RIGHT
  - typingsSlinky.screeps.FIND_EXIT_BOTTOM
  - typingsSlinky.screeps.FIND_EXIT_LEFT
*/
trait ExitConstant extends js.Object

object ExitConstant {
  @scala.inline
  implicit def apply(value: FIND_EXIT_BOTTOM): ExitConstant = value.asInstanceOf[ExitConstant]
  @scala.inline
  implicit def apply(value: FIND_EXIT_LEFT): ExitConstant = value.asInstanceOf[ExitConstant]
  @scala.inline
  implicit def apply(value: FIND_EXIT_RIGHT): ExitConstant = value.asInstanceOf[ExitConstant]
  @scala.inline
  implicit def apply(value: FIND_EXIT_TOP): ExitConstant = value.asInstanceOf[ExitConstant]
}

