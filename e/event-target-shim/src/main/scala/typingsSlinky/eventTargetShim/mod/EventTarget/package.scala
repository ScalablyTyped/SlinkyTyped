package typingsSlinky.eventTargetShim.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventTarget {
  type EventAttributes[TEventAttributes /* <: typingsSlinky.eventTargetShim.mod.EventTarget.EventDefinition */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof TEventAttributes ]: event-target-shim.event-target-shim.EventTarget.FunctionListener<TEventAttributes[P]> | null}
    */ typingsSlinky.eventTargetShim.eventTargetShimStrings.EventAttributes with org.scalablytyped.runtime.TopLevel[TEventAttributes]
  type EventDefinition = org.scalablytyped.runtime.StringDictionary[typingsSlinky.eventTargetShim.mod.Event]
  type EventType[TEvents /* <: typingsSlinky.eventTargetShim.mod.EventTarget.EventDefinition */, TMode /* <: typingsSlinky.eventTargetShim.mod.EventTarget.Mode */] = /* keyof TEvents */ java.lang.String
  type FunctionListener[TEvent] = js.Function1[/* event */ TEvent, scala.Unit]
}
