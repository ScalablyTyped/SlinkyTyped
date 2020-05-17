package typingsSlinky.eventTargetShim.mod.EventTarget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.eventTargetShim.mod.EventTarget.FunctionListener[TEvent]
  - typingsSlinky.eventTargetShim.mod.EventTarget.ObjectListener[TEvent]
*/
trait Listener[TEvent] extends js.Object

object Listener {
  @scala.inline
  implicit def apply[TEvent](value: FunctionListener[TEvent]): Listener[TEvent] = value.asInstanceOf[Listener[TEvent]]
  @scala.inline
  implicit def apply[TEvent](value: ObjectListener[TEvent]): Listener[TEvent] = value.asInstanceOf[Listener[TEvent]]
}

