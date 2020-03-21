package typingsSlinky.openfin.externalApplicationMod

import typingsSlinky.openfin.eventsBaseMod.BaseEventMap
import typingsSlinky.openfin.eventsBaseMod.RuntimeEvent
import typingsSlinky.openfin.openfinStrings.connected
import typingsSlinky.openfin.openfinStrings.disconnected
import typingsSlinky.openfin.openfinStrings.externalapplication
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalApplicationEvents extends BaseEventMap {
  var connected: RuntimeEvent[externalapplication, typingsSlinky.openfin.openfinStrings.connected]
  var disconnected: RuntimeEvent[externalapplication, typingsSlinky.openfin.openfinStrings.disconnected]
}

object ExternalApplicationEvents {
  @scala.inline
  def apply(
    connected: RuntimeEvent[externalapplication, connected],
    disconnected: RuntimeEvent[externalapplication, disconnected],
    listenerRemoved: String,
    newListener: String
  ): ExternalApplicationEvents = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], disconnected = disconnected.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExternalApplicationEvents]
  }
}

