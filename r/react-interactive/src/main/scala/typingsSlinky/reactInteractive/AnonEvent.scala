package typingsSlinky.reactInteractive

import org.scalajs.dom.raw.Element
import slinky.core.SyntheticEvent
import typingsSlinky.reactInteractive.mod.State
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvent extends js.Object {
  var event: SyntheticEvent[Event_, Element]
  var nextState: State
  var prevState: State
}

object AnonEvent {
  @scala.inline
  def apply(event: SyntheticEvent[Event_, Element], nextState: State, prevState: State): AnonEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], nextState = nextState.asInstanceOf[js.Any], prevState = prevState.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEvent]
  }
}

