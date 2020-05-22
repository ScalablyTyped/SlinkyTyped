package typingsSlinky.eventTargetShim.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventTarget {
  type EventAttributes[TEventAttributes /* <: typingsSlinky.eventTargetShim.mod.EventTarget.EventDefinition */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof TEventAttributes ]: event-target-shim.event-target-shim.EventTarget.FunctionListener<TEventAttributes[P]> | null}
    */ typingsSlinky.eventTargetShim.eventTargetShimStrings.EventAttributes with org.scalablytyped.runtime.TopLevel[TEventAttributes]
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
  type EventData[TEvents /* <: typingsSlinky.eventTargetShim.mod.EventTarget.EventDefinition */, TEventType /* <: /* keyof TEvents */ java.lang.String */, TMode /* <: typingsSlinky.eventTargetShim.mod.EventTarget.Mode */] = (typingsSlinky.eventTargetShim.mod.EventTarget._EventData[TEvents, TEventType, TMode]) | ((typingsSlinky.std.Pick[
    /* import warning: importer.ImportType#apply Failed type conversion: TEvents[TEventType] */ js.Any, 
    typingsSlinky.std.Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: keyof TEvents[TEventType] */ js.Any, 
      typingsSlinky.eventTargetShim.mod.EventTarget.OmittableEventKeys
    ]
  ]) with typingsSlinky.eventTargetShim.anon.PartialPickEventOmittable[TEvents])
  type EventDefinition = org.scalablytyped.runtime.StringDictionary[typingsSlinky.eventTargetShim.mod.Event]
  type EventType[TEvents /* <: typingsSlinky.eventTargetShim.mod.EventTarget.EventDefinition */, TMode /* <: typingsSlinky.eventTargetShim.mod.EventTarget.Mode */] = /* keyof TEvents */ java.lang.String
  type FunctionListener[TEvent] = js.Function1[/* event */ TEvent, scala.Unit]
  type Listener[TEvent] = typingsSlinky.eventTargetShim.mod.EventTarget.FunctionListener[TEvent] | typingsSlinky.eventTargetShim.mod.EventTarget.ObjectListener[TEvent]
  type PickEvent[TEvents /* <: typingsSlinky.eventTargetShim.mod.EventTarget.EventDefinition */, TEventType /* <: /* keyof TEvents */ java.lang.String */] = typingsSlinky.eventTargetShim.mod.Event | (/* import warning: importer.ImportType#apply Failed type conversion: TEvents[TEventType] */ js.Any)
}
