package typingsSlinky.openfin.externalApplicationMod

import typingsSlinky.openfin.eventsBaseMod.BaseEventMap
import typingsSlinky.openfin.eventsBaseMod.RuntimeEvent
import typingsSlinky.openfin.openfinStrings.connected
import typingsSlinky.openfin.openfinStrings.disconnected
import typingsSlinky.openfin.openfinStrings.externalapplication
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExternalApplicationEvents extends BaseEventMap {
  var connected: RuntimeEvent[externalapplication, typingsSlinky.openfin.openfinStrings.connected] = js.native
  var disconnected: RuntimeEvent[externalapplication, typingsSlinky.openfin.openfinStrings.disconnected] = js.native
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
  @scala.inline
  implicit class ExternalApplicationEventsOps[Self <: ExternalApplicationEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnected(value: RuntimeEvent[externalapplication, connected]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisconnected(value: RuntimeEvent[externalapplication, disconnected]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnected")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

