package typingsSlinky.eventTargetShim.anon

import typingsSlinky.eventTargetShim.mod.EventTarget.AddOptions
import typingsSlinky.eventTargetShim.mod.EventTarget.EventData
import typingsSlinky.eventTargetShim.mod.EventTarget.EventDefinition
import typingsSlinky.eventTargetShim.mod.EventTarget.EventType
import typingsSlinky.eventTargetShim.mod.EventTarget.Listener
import typingsSlinky.eventTargetShim.mod.EventTarget.Mode
import typingsSlinky.eventTargetShim.mod.EventTarget.PickEvent
import typingsSlinky.eventTargetShim.mod.EventTarget.RemoveOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddEventListener[TEvents /* <: EventDefinition */, TMode /* <: Mode */] extends js.Object {
  
  /**
    * Add a given listener to this event target.
    * @param eventName The event name to add.
    * @param listener The listener to add.
    * @param options The options for this listener.
    */
  def addEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType): Unit = js.native
  def addEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType, listener: Null, options: Boolean): Unit = js.native
  def addEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType, listener: Null, options: AddOptions): Unit = js.native
  def addEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType, listener: Listener[PickEvent[TEvents, TEventType]]): Unit = js.native
  def addEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType, listener: Listener[PickEvent[TEvents, TEventType]], options: Boolean): Unit = js.native
  def addEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType, listener: Listener[PickEvent[TEvents, TEventType]], options: AddOptions): Unit = js.native
  
  /**
    * Dispatch a given event.
    * @param event The event to dispatch.
    * @returns `false` if canceled.
    */
  def dispatchEvent[TEventType /* <: EventType[TEvents, TMode] */](event: EventData[TEvents, TEventType, TMode]): Boolean = js.native
  
  /**
    * Remove a given listener from this event target.
    * @param eventName The event name to remove.
    * @param listener The listener to remove.
    * @param options The options for this listener.
    */
  def removeEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType): Unit = js.native
  def removeEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType, listener: Null, options: Boolean): Unit = js.native
  def removeEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType, listener: Null, options: RemoveOptions): Unit = js.native
  def removeEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType, listener: Listener[PickEvent[TEvents, TEventType]]): Unit = js.native
  def removeEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType, listener: Listener[PickEvent[TEvents, TEventType]], options: Boolean): Unit = js.native
  def removeEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType, listener: Listener[PickEvent[TEvents, TEventType]], options: RemoveOptions): Unit = js.native
}
