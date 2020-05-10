package typingsSlinky.openfin.channelMod

import typingsSlinky.openfin.eventsBaseMod.BaseEventMap
import typingsSlinky.openfin.openfinStrings.connected
import typingsSlinky.openfin.openfinStrings.disconnected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelEvents extends BaseEventMap {
  var connected: ChannelEvent[typingsSlinky.openfin.openfinStrings.connected] = js.native
  var disconnected: ChannelEvent[typingsSlinky.openfin.openfinStrings.disconnected] = js.native
}

object ChannelEvents {
  @scala.inline
  def apply(
    connected: ChannelEvent[connected],
    disconnected: ChannelEvent[disconnected],
    listenerRemoved: String,
    newListener: String
  ): ChannelEvents = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], disconnected = disconnected.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelEvents]
  }
  @scala.inline
  implicit class ChannelEventsOps[Self <: ChannelEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnected(value: ChannelEvent[connected]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisconnected(value: ChannelEvent[disconnected]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnected")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

