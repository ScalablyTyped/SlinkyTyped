package typingsSlinky.openfin.frameMod

import typingsSlinky.openfin.eventsBaseMod.BaseEventMap
import typingsSlinky.openfin.openfinStrings.connected
import typingsSlinky.openfin.openfinStrings.disconnected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameEvents extends BaseEventMap {
  var connected: FrameEvent[typingsSlinky.openfin.openfinStrings.connected] = js.native
  var disconnected: FrameEvent[typingsSlinky.openfin.openfinStrings.disconnected] = js.native
}

object FrameEvents {
  @scala.inline
  def apply(
    connected: FrameEvent[connected],
    disconnected: FrameEvent[disconnected],
    listenerRemoved: String,
    newListener: String
  ): FrameEvents = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], disconnected = disconnected.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameEvents]
  }
  @scala.inline
  implicit class FrameEventsOps[Self <: FrameEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnected(value: FrameEvent[connected]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisconnected(value: FrameEvent[disconnected]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnected")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

