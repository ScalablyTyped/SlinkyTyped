package typingsSlinky.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactBeautifulDnd.mod.IdleState
  - typingsSlinky.reactBeautifulDnd.mod.DraggingState
  - typingsSlinky.reactBeautifulDnd.mod.CollectingState
  - typingsSlinky.reactBeautifulDnd.mod.DropPendingState
  - typingsSlinky.reactBeautifulDnd.mod.DropAnimatingState
*/
trait State extends js.Object

object State {
  @scala.inline
  implicit def apply(value: CollectingState): State = value.asInstanceOf[State]
  @scala.inline
  implicit def apply(value: DraggingState): State = value.asInstanceOf[State]
  @scala.inline
  implicit def apply(value: DropAnimatingState): State = value.asInstanceOf[State]
  @scala.inline
  implicit def apply(value: DropPendingState): State = value.asInstanceOf[State]
  @scala.inline
  implicit def apply(value: IdleState): State = value.asInstanceOf[State]
}

