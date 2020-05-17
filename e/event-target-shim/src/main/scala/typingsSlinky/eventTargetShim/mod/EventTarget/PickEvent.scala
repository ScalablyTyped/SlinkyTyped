package typingsSlinky.eventTargetShim.mod.EventTarget

import typingsSlinky.eventTargetShim.mod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.eventTargetShim.mod.Event
  - / * import warning: importer.ImportType#apply Failed type conversion: TEvents[TEventType] * / js.Any
*/
trait PickEvent[TEvents /* <: EventDefinition */, TEventType /* <: /* keyof TEvents */ String */] extends js.Object

object PickEvent {
  @scala.inline
  implicit def apply[TEvents, TEventType](
    value: /* import warning: importer.ImportType#apply Failed type conversion: TEvents[TEventType] */ js.Any
  ): PickEvent[TEvents, TEventType] = value.asInstanceOf[PickEvent[TEvents, TEventType]]
  @scala.inline
  implicit def apply[TEvents, TEventType](value: Event): PickEvent[TEvents, TEventType] = value.asInstanceOf[PickEvent[TEvents, TEventType]]
}

