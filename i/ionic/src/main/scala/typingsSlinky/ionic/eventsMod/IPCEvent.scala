package typingsSlinky.ionic.eventsMod

import typingsSlinky.ionic.ionicStrings.event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPCEvent[E /* <: String */, D /* <: js.Object */] extends js.Object {
  var data: D = js.native
  var event: E = js.native
  var `type`: event = js.native
}

object IPCEvent {
  @scala.inline
  def apply[E, D](data: D, event: E, `type`: event): IPCEvent[E, D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPCEvent[E, D]]
  }
  @scala.inline
  implicit class IPCEventOps[Self[e, d] <: IPCEvent[e, d], E, D] (val x: Self[E, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[E, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[E, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[E, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[E, D]) with Other]
    @scala.inline
    def withData(value: D): Self[E, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: E): Self[E, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: event): Self[E, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

