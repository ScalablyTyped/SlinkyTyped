package typingsSlinky.openfin.frameMod

import typingsSlinky.openfin.eventsBaseMod.BaseEventMap
import typingsSlinky.openfin.openfinStrings.connected
import typingsSlinky.openfin.openfinStrings.disconnected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameEvents extends BaseEventMap {
  var connected: FrameEvent[typingsSlinky.openfin.openfinStrings.connected]
  var disconnected: FrameEvent[typingsSlinky.openfin.openfinStrings.disconnected]
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
}

