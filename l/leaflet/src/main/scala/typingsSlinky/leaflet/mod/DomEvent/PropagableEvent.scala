package typingsSlinky.leaflet.mod.DomEvent

import org.scalajs.dom.raw.Event
import typingsSlinky.leaflet.mod.LeafletEvent
import typingsSlinky.leaflet.mod.LeafletKeyboardEvent
import typingsSlinky.leaflet.mod.LeafletMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.leaflet.mod.LeafletMouseEvent
  - typingsSlinky.leaflet.mod.LeafletKeyboardEvent
  - typingsSlinky.leaflet.mod.LeafletEvent
  - typingsSlinky.std.Event
*/
trait PropagableEvent extends js.Object

object PropagableEvent {
  @scala.inline
  implicit def apply(value: Event): PropagableEvent = value.asInstanceOf[PropagableEvent]
  @scala.inline
  implicit def apply(value: LeafletEvent): PropagableEvent = value.asInstanceOf[PropagableEvent]
  @scala.inline
  implicit def apply(value: LeafletKeyboardEvent): PropagableEvent = value.asInstanceOf[PropagableEvent]
  @scala.inline
  implicit def apply(value: LeafletMouseEvent): PropagableEvent = value.asInstanceOf[PropagableEvent]
}

