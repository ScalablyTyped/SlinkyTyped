package typingsSlinky.openfin.mod.fin

import typingsSlinky.openfin.AnonHost
import typingsSlinky.openfin.openfinStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowAuthRequestedEvent extends WindowBaseEvent {
  var authInfo: AnonHost
}

object WindowAuthRequestedEvent {
  @scala.inline
  def apply(authInfo: AnonHost, name: String, topic: window, `type`: OpenFinWindowEventType, uuid: String): WindowAuthRequestedEvent = {
    val __obj = js.Dynamic.literal(authInfo = authInfo.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowAuthRequestedEvent]
  }
}

