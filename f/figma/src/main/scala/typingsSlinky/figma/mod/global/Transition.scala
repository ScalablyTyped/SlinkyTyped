package typingsSlinky.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.figma.mod.global.SimpleTransition
  - typingsSlinky.figma.mod.global.DirectionalTransition
*/
trait Transition extends js.Object

object Transition {
  @scala.inline
  implicit def apply(value: DirectionalTransition): Transition = value.asInstanceOf[Transition]
  @scala.inline
  implicit def apply(value: SimpleTransition): Transition = value.asInstanceOf[Transition]
}

