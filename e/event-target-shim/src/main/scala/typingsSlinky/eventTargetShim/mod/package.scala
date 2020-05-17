package typingsSlinky.eventTargetShim

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EventTarget[TEvents /* <: typingsSlinky.eventTargetShim.mod.EventTarget.EventDefinition */, TEventAttributes /* <: typingsSlinky.eventTargetShim.mod.EventTarget.EventDefinition */, TMode /* <: typingsSlinky.eventTargetShim.mod.EventTarget.Mode */] = typingsSlinky.eventTargetShim.mod.EventTarget.EventAttributes[TEventAttributes] with (typingsSlinky.eventTargetShim.anon.AddEventListener[TEvents, TMode])
}
