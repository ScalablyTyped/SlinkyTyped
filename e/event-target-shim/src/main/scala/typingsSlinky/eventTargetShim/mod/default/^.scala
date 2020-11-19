package typingsSlinky.eventTargetShim.mod.default

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.eventTargetShim.anon.EventTargetloose
import typingsSlinky.eventTargetShim.mod.EventTarget
import typingsSlinky.eventTargetShim.mod.EventTarget.EventDefinition
import typingsSlinky.eventTargetShim.mod.EventTarget.Mode
import typingsSlinky.eventTargetShim.mod.EventTargetConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("event-target-shim", JSImport.Default)
@js.native
class ^ () extends EventTargetloose
@JSImport("event-target-shim", JSImport.Default)
@js.native
object ^
  extends TopLevel[
      (/**
  * Create an `EventTarget` instance with detailed event definition.
  *
  * The detailed event definition requires to use `defineEventAttribute()`
  * function later.
  *
  * Unfortunately, the second type parameter `TEventAttributes` was needed
  * because we cannot compute string literal types.
  *
  * @example
  * const signal = new EventTarget<{ abort: Event }, { onabort: Event }>()
  * defineEventAttribute(signal, "abort")
  */
Instantiable0[EventTarget[EventDefinition, EventDefinition, Mode]]) with Instantiable0[EventTargetloose]
    ] {
  
  /**
    * Define an `EventTarget` constructor with attribute events and detailed event definition.
    *
    * Unfortunately, the second type parameter `TEventAttributes` was needed
    * because we cannot compute string literal types.
    *
    * @example
    * class AbortSignal extends EventTarget<{ abort: Event }, { onabort: Event }>("abort") {
    *      abort(): void {}
    * }
    *
    * @param events Optional event attributes (e.g. passing in `"click"` adds `onclick` to prototype).
    */
  def apply[TEvents /* <: EventDefinition */, TEventAttributes /* <: EventDefinition */, TMode /* <: Mode */](event0: String, events: String*): EventTargetConstructor[TEvents, TEventAttributes, TMode] = js.native
  /**
    * Define an `EventTarget` constructor with attribute events and detailed event definition.
    *
    * Unfortunately, the second type parameter `TEventAttributes` was needed
    * because we cannot compute string literal types.
    *
    * @example
    * class AbortSignal extends EventTarget<{ abort: Event }, { onabort: Event }>("abort") {
    *      abort(): void {}
    * }
    *
    * @param events Optional event attributes (e.g. passing in `"click"` adds `onclick` to prototype).
    */
  def apply[TEvents /* <: EventDefinition */, TEventAttributes /* <: EventDefinition */, TMode /* <: Mode */](events: js.Array[String]): EventTargetConstructor[TEvents, TEventAttributes, TMode] = js.native
}
