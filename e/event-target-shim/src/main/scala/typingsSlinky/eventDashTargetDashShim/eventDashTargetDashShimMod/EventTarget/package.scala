package typingsSlinky.eventDashTargetDashShim.eventDashTargetDashShimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventTarget {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.eventDashTargetDashShim.eventDashTargetDashShimMod.Event
  import typingsSlinky.eventDashTargetDashShim.eventDashTargetDashShimStrings.AT_TARGET
  import typingsSlinky.eventDashTargetDashShim.eventDashTargetDashShimStrings.BUBBLING_PHASE
  import typingsSlinky.eventDashTargetDashShim.eventDashTargetDashShimStrings.CAPTURING_PHASE
  import typingsSlinky.eventDashTargetDashShim.eventDashTargetDashShimStrings.NONE
  import typingsSlinky.eventDashTargetDashShim.eventDashTargetDashShimStrings.`type`
  import typingsSlinky.eventDashTargetDashShim.eventDashTargetDashShimStrings.bubbles
  import typingsSlinky.eventDashTargetDashShim.eventDashTargetDashShimStrings.cancelBubble
  import typingsSlinky.eventDashTargetDashShim.eventDashTargetDashShimStrings.cancelable
  import typingsSlinky.eventDashTargetDashShim.eventDashTargetDashShimStrings.composed
  import typingsSlinky.eventDashTargetDashShim.eventDashTargetDashShimStrings.currentTarget
  import typingsSlinky.eventDashTargetDashShim.eventDashTargetDashShimStrings.defaultPrevented
  import typingsSlinky.eventDashTargetDashShim.eventDashTargetDashShimStrings.eventPhase
  import typingsSlinky.eventDashTargetDashShim.eventDashTargetDashShimStrings.isTrusted
  import typingsSlinky.eventDashTargetDashShim.eventDashTargetDashShimStrings.returnValue
  import typingsSlinky.eventDashTargetDashShim.eventDashTargetDashShimStrings.srcElement
  import typingsSlinky.eventDashTargetDashShim.eventDashTargetDashShimStrings.target
  import typingsSlinky.eventDashTargetDashShim.eventDashTargetDashShimStrings.timeStamp
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type EventAttributes[TEventAttributes /* <: EventDefinition */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof TEventAttributes ]: event-target-shim.event-target-shim.EventTarget.FunctionListener<TEventAttributes[P]> | null}
    */ typingsSlinky.eventDashTargetDashShim.eventDashTargetDashShimStrings.EventAttributes with TEventAttributes
  /* Rewritten from type alias, can be one of: 
    - typings.eventDashTargetDashShim.eventDashTargetDashShimMod.Event
    - typings.eventDashTargetDashShim.eventDashTargetDashShimMod.EventTarget.NonStandardEvent
    - (typings.std.Pick[
  / * import warning: importer.ImportType#apply Failed type conversion: TEvents[TEventType] * / js.Any, 
  typings.std.Exclude[
    / * import warning: importer.ImportType#apply Failed type conversion: keyof TEvents[TEventType] * / js.Any, 
    typings.eventDashTargetDashShim.eventDashTargetDashShimMod.EventTarget.OmittableEventKeys
  ]]) with (typings.std.Partial[
  typings.std.Pick[
    typings.eventDashTargetDashShim.eventDashTargetDashShimMod.Event, 
    typings.eventDashTargetDashShim.eventDashTargetDashShimMod.EventTarget.OmittableEventKeys
  ]])
  */
  type EventData[TEvents /* <: EventDefinition */, TEventType /* <: String */, TMode /* <: Mode */] = (_EventData[TEvents, TEventType, TMode]) | ((Pick[
    /* import warning: importer.ImportType#apply Failed type conversion: TEvents[TEventType] */ js.Any, 
    Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: keyof TEvents[TEventType] */ js.Any, 
      OmittableEventKeys
    ]
  ]) with (Partial[Pick[Event, OmittableEventKeys]]))
  type EventDefinition = StringDictionary[Event]
  type EventType[TEvents /* <: EventDefinition */, TMode /* <: Mode */] = String
  type FunctionListener[TEvent] = js.Function1[/* event */ TEvent, Unit]
  type Listener[TEvent] = FunctionListener[TEvent] | ObjectListener[TEvent]
  type OmittableEventKeys = Exclude[
    `type` | target | currentTarget | srcElement | NONE | CAPTURING_PHASE | BUBBLING_PHASE | AT_TARGET | eventPhase | bubbles | cancelBubble | returnValue | cancelable | defaultPrevented | composed | isTrusted | timeStamp, 
    `type`
  ]
  type PickEvent[TEvents /* <: EventDefinition */, TEventType /* <: String */] = Event | (/* import warning: importer.ImportType#apply Failed type conversion: TEvents[TEventType] */ js.Any)
}
