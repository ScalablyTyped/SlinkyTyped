package typingsSlinky.reactDashInteractive

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import typingsSlinky.reactDashInteractive.reactDashInteractiveMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event extends js.Object {
  var event: SyntheticEvent[Event, Element]
  var nextState: State
  var prevState: State
}

object Anon_Event {
  @scala.inline
  def apply(event: SyntheticEvent[Event, Element], nextState: State, prevState: State): Anon_Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], nextState = nextState.asInstanceOf[js.Any], prevState = prevState.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Event]
  }
}

