package typingsSlinky.eventDashTargetDashShim

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eventDashTargetDashShimMod {
  import typingsSlinky.eventDashTargetDashShim.Anon_AddEventListener
  import typingsSlinky.eventDashTargetDashShim.eventDashTargetDashShimMod.EventTarget.EventAttributes
  import typingsSlinky.eventDashTargetDashShim.eventDashTargetDashShimMod.EventTarget.EventDefinition
  import typingsSlinky.eventDashTargetDashShim.eventDashTargetDashShimMod.EventTarget.Mode

  type EventTarget[TEvents /* <: EventDefinition */, TEventAttributes /* <: EventDefinition */, TMode /* <: Mode */] = EventAttributes[TEventAttributes] with (Anon_AddEventListener[TEvents, TMode])
}
