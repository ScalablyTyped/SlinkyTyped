package typingsSlinky.reactInteractive

import org.scalajs.dom.raw.Element
import slinky.core.SyntheticEvent
import typingsSlinky.reactInteractive.mod.State
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEvent extends js.Object {
  var event: SyntheticEvent[Event_, Element] = js.native
  var nextState: State = js.native
  var prevState: State = js.native
}

object AnonEvent {
  @scala.inline
  def apply(event: SyntheticEvent[Event_, Element], nextState: State, prevState: State): AnonEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], nextState = nextState.asInstanceOf[js.Any], prevState = prevState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEvent]
  }
  @scala.inline
  implicit class AnonEventOps[Self <: AnonEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: SyntheticEvent[Event_, Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextState(value: State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevState(value: State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

