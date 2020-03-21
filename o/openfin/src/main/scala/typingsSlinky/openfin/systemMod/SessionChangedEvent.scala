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

trait SessionChangedEvent[Topic, Type] extends BaseEvent[Topic, Type] {
  var reason: lock | unlock | `remote-connect` | `remote-disconnect` | unknown
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
}

