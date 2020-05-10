package typingsSlinky.openfin.systemMod

import typingsSlinky.openfin.eventsBaseMod.BaseEvent
import typingsSlinky.openfin.openfinStrings.`remote-connect`
import typingsSlinky.openfin.openfinStrings.`remote-disconnect`
import typingsSlinky.openfin.openfinStrings.lock
import typingsSlinky.openfin.openfinStrings.unknown
import typingsSlinky.openfin.openfinStrings.unlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionChangedEvent[Topic, Type] extends BaseEvent[Topic, Type] {
  var reason: lock | unlock | `remote-connect` | `remote-disconnect` | unknown = js.native
}

object SessionChangedEvent {
  @scala.inline
  def apply[Topic, Type](
    reason: lock | unlock | `remote-connect` | `remote-disconnect` | unknown,
    topic: Topic,
    `type`: Type
  ): SessionChangedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionChangedEvent[Topic, Type]]
  }
  @scala.inline
  implicit class SessionChangedEventOps[Self[topic, `type`] <: SessionChangedEvent[topic, `type`], Topic, Type] (val x: Self[Topic, Type]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Topic, Type] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Topic, Type]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Topic, Type]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Topic, Type]) with Other]
    @scala.inline
    def withReason(value: lock | unlock | `remote-connect` | `remote-disconnect` | unknown): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

