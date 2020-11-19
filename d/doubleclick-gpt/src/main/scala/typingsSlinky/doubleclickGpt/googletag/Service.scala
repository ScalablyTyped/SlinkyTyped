package typingsSlinky.doubleclickGpt.googletag

import typingsSlinky.doubleclickGpt.doubleclickGptStrings.slotRenderEnded
import typingsSlinky.doubleclickGpt.doubleclickGptStrings.slotRequested
import typingsSlinky.doubleclickGpt.doubleclickGptStrings.slotResponseReceived
import typingsSlinky.doubleclickGpt.doubleclickGptStrings.slotVisibilityChanged
import typingsSlinky.doubleclickGpt.googletag.events.Event
import typingsSlinky.doubleclickGpt.googletag.events.SlotRenderEndedEvent
import typingsSlinky.doubleclickGpt.googletag.events.SlotRequestedEvent
import typingsSlinky.doubleclickGpt.googletag.events.SlotResponseReceived
import typingsSlinky.doubleclickGpt.googletag.events.SlotVisibilityChangedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
