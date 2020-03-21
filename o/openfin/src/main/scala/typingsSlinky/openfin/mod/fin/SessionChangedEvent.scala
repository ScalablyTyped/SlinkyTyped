package typingsSlinky.openfin.mod.fin

import typingsSlinky.openfin.openfinStrings.`remote-connect`
import typingsSlinky.openfin.openfinStrings.`remote-disconnect`
import typingsSlinky.openfin.openfinStrings.`session-changed`
import typingsSlinky.openfin.openfinStrings.lock
import typingsSlinky.openfin.openfinStrings.system
import typingsSlinky.openfin.openfinStrings.unknown
import typingsSlinky.openfin.openfinStrings.unlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionChangedEvent extends js.Object {
  /**
    * the action that triggered this event:
    */
  var reason: lock | unlock | `remote-connect` | `remote-disconnect` | unknown
  var topic: system
  var `type`: `session-changed`
}

object SessionChangedEvent {
  @scala.inline
  def apply(
    reason: lock | unlock | `remote-connect` | `remote-disconnect` | unknown,
    topic: system,
    `type`: `session-changed`
  ): SessionChangedEvent = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionChangedEvent]
  }
}

