package typingsSlinky.reapop.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reapop.mod.ADD_NOTIFICATION
  - typingsSlinky.reapop.mod.UPDATE_NOTIFICATION
  - typingsSlinky.reapop.mod.REMOVE_NOTIFICATION
  - typingsSlinky.reapop.mod.REMOVE_NOTIFICATIONS
*/
trait ActionTypes extends js.Object

object ActionTypes {
  @scala.inline
  implicit def apply(value: ADD_NOTIFICATION | REMOVE_NOTIFICATION | REMOVE_NOTIFICATIONS | UPDATE_NOTIFICATION): ActionTypes = value.asInstanceOf[ActionTypes]
}

