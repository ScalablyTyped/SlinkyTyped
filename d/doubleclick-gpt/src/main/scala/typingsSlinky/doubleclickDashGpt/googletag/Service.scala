package typingsSlinky.doubleclickDashGpt.googletag

import typingsSlinky.doubleclickDashGpt.doubleclickDashGptStrings.slotRenderEnded
import typingsSlinky.doubleclickDashGpt.doubleclickDashGptStrings.slotRequested
import typingsSlinky.doubleclickDashGpt.doubleclickDashGptStrings.slotResponseReceived
import typingsSlinky.doubleclickDashGpt.doubleclickDashGptStrings.slotVisibilityChanged
import typingsSlinky.doubleclickDashGpt.googletag.events.Event
import typingsSlinky.doubleclickDashGpt.googletag.events.SlotRenderEndedEvent
import typingsSlinky.doubleclickDashGpt.googletag.events.SlotRequestedEvent
import typingsSlinky.doubleclickDashGpt.googletag.events.SlotResponseReceived
import typingsSlinky.doubleclickDashGpt.googletag.events.SlotVisibilityChangedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Service extends js.Object {
  def addEventListener(eventType: String, listener: js.Function1[/* event */ Event, Unit]): Service = js.native
  @JSName("addEventListener")
  def addEventListener_slotRenderEnded(eventType: slotRenderEnded, listener: js.Function1[/* event */ SlotRenderEndedEvent, Unit]): Service = js.native
  @JSName("addEventListener")
  def addEventListener_slotRequested(eventType: slotRequested, listener: js.Function1[/* event */ SlotRequestedEvent, Unit]): Service = js.native
  @JSName("addEventListener")
  def addEventListener_slotResponseReceived(eventType: slotResponseReceived, listener: js.Function1[/* event */ SlotResponseReceived, Unit]): Service = js.native
  @JSName("addEventListener")
  def addEventListener_slotVisibilityChanged(
    eventType: slotVisibilityChanged,
    listener: js.Function1[/* event */ SlotVisibilityChangedEvent, Unit]
  ): Service = js.native
  def getSlots(): js.Array[Slot] = js.native
}

