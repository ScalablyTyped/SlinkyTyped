package typingsSlinky.eventTargetShim.mod.EventTarget

import typingsSlinky.eventTargetShim.anon.PartialPickEventOmittable
import typingsSlinky.eventTargetShim.mod.Event
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.eventTargetShim.mod.Event
  - typingsSlinky.eventTargetShim.mod.EventTarget.NonStandardEvent
  - (typingsSlinky.std.Pick[
/ * import warning: importer.ImportType#apply Failed type conversion: TEvents[TEventType] * / js.Any, 
typingsSlinky.std.Exclude[
  / * import warning: importer.ImportType#apply Failed type conversion: keyof TEvents[TEventType] * / js.Any, 
  typingsSlinky.eventTargetShim.mod.EventTarget.OmittableEventKeys
]]) with typingsSlinky.eventTargetShim.anon.PartialPickEventOmittable[TEvents]
*/
trait EventData[TEvents /* <: EventDefinition */, TEventType /* <: /* keyof TEvents */ String */, TMode /* <: Mode */] extends js.Object

object EventData {
  @scala.inline
  implicit def apply[TEvents, TEventType, TMode](
    value: (Pick[
      /* import warning: importer.ImportType#apply Failed type conversion: TEvents[TEventType] */ js.Any, 
      Exclude[
        /* import warning: importer.ImportType#apply Failed type conversion: keyof TEvents[TEventType] */ js.Any, 
        OmittableEventKeys
      ]
    ]) with PartialPickEventOmittable[TEvents]
  ): EventData[TEvents, TEventType, TMode] = value.asInstanceOf[EventData[TEvents, TEventType, TMode]]
  @scala.inline
  implicit def apply[TEvents, TEventType, TMode](value: Event): EventData[TEvents, TEventType, TMode] = value.asInstanceOf[EventData[TEvents, TEventType, TMode]]
  @scala.inline
  implicit def apply[TEvents, TEventType, TMode](value: NonStandardEvent): EventData[TEvents, TEventType, TMode] = value.asInstanceOf[EventData[TEvents, TEventType, TMode]]
}

