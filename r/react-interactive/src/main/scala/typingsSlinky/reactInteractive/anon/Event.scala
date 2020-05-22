package typingsSlinky.reactInteractive.anon

import org.scalajs.dom.raw.Element
import slinky.core.SyntheticEvent
import typingsSlinky.reactInteractive.mod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var event: SyntheticEvent[org.scalajs.dom.raw.Event, Element]
  var nextState: State
  var prevState: State
}

object Event {
  @scala.inline
  def apply(event: SyntheticEvent[org.scalajs.dom.raw.Event, Element], nextState: State, prevState: State): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], nextState = nextState.asInstanceOf[js.Any], prevState = prevState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

