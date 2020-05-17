package typingsSlinky.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactBeautifulDnd.mod.DraggingState
  - typingsSlinky.reactBeautifulDnd.mod.CollectingState
*/
trait StateWhenUpdatesAllowed extends js.Object

object StateWhenUpdatesAllowed {
  @scala.inline
  implicit def apply(value: CollectingState): StateWhenUpdatesAllowed = value.asInstanceOf[StateWhenUpdatesAllowed]
  @scala.inline
  implicit def apply(value: DraggingState): StateWhenUpdatesAllowed = value.asInstanceOf[StateWhenUpdatesAllowed]
}

