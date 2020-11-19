package typingsSlinky.phaser.global.MatterJS

import typingsSlinky.phaser.MatterJS.BodyType
import typingsSlinky.phaser.MatterJS.CompositeType
import typingsSlinky.phaser.MatterJS.IEvent
import typingsSlinky.phaser.MatterJS.IEventCollision
import typingsSlinky.phaser.MatterJS.IEventComposite
import typingsSlinky.phaser.MatterJS.IEventTimestamped
import typingsSlinky.phaser.phaserStrings.afterAdd
import typingsSlinky.phaser.phaserStrings.afterRemove
import typingsSlinky.phaser.phaserStrings.afterRender
import typingsSlinky.phaser.phaserStrings.afterTick
import typingsSlinky.phaser.phaserStrings.afterUpdate
import typingsSlinky.phaser.phaserStrings.beforeAdd
import typingsSlinky.phaser.phaserStrings.beforeRemove
import typingsSlinky.phaser.phaserStrings.beforeRender
import typingsSlinky.phaser.phaserStrings.beforeTick
import typingsSlinky.phaser.phaserStrings.beforeUpdate
import typingsSlinky.phaser.phaserStrings.collisionActive
import typingsSlinky.phaser.phaserStrings.collisionEnd
import typingsSlinky.phaser.phaserStrings.collisionStart
import typingsSlinky.phaser.phaserStrings.sleepEnd
import typingsSlinky.phaser.phaserStrings.sleepStart
import typingsSlinky.phaser.phaserStrings.tick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MatterJS.Events")
@js.native
class Events ()
  extends typingsSlinky.phaser.MatterJS.Events
/* static members */
@JSGlobal("MatterJS.Events")
@js.native
object Events extends js.Object {
  
  /**
    * Removes the given event callback. If no callback, clears all callbacks in eventNames. If no eventNames, clears all events.
    *
    * @param obj
    * @param eventName
    * @param callback
    */
  def off(obj: js.Any, eventName: String, callback: js.Function1[/* e */ js.Any, Unit]): Unit = js.native
  
  def on(obj: js.Any, name: String, callback: js.Function1[/* e */ js.Any, Unit]): Unit = js.native
  /**
    * Fired when a call to `Composite.add` is made, after objects have been added.
    *
    * @event afterAdd
    * @param {} event An event object
    * @param {} event.object The object(s) that have been added (may be a single body, constraint, composite or a mixed array of these)
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_afterAdd(
    obj: typingsSlinky.phaser.MatterJS.Engine,
    name: afterAdd,
    callback: js.Function1[/* e */ IEventComposite[CompositeType], Unit]
  ): Unit = js.native
  /**
    * Fired when a call to `Composite.remove` is made, after objects have been removed.
    *
    * @event afterRemove
    * @param {} event An event object
    * @param {} event.object The object(s) that have been removed (may be a single body, constraint, composite or a mixed array of these)
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_afterRemove(
    obj: typingsSlinky.phaser.MatterJS.Engine,
    name: afterRemove,
    callback: js.Function1[/* e */ IEventComposite[CompositeType], Unit]
  ): Unit = js.native
  /**
    * Fired after rendering
    *
    * @event afterRender
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_afterRender(
    obj: typingsSlinky.phaser.MatterJS.Engine,
    name: afterRender,
    callback: js.Function1[/* e */ IEventTimestamped[typingsSlinky.phaser.MatterJS.Runner], Unit]
  ): Unit = js.native
  /**
    * Fired at the end of a tick, after engine update and after rendering
    *
    * @event afterTick
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_afterTick(
    obj: typingsSlinky.phaser.MatterJS.Engine,
    name: afterTick,
    callback: js.Function1[/* e */ IEventTimestamped[typingsSlinky.phaser.MatterJS.Runner], Unit]
  ): Unit = js.native
  /**
    * Fired after engine update and all collision events
    *
    * @event afterUpdate
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_afterUpdate(
    obj: typingsSlinky.phaser.MatterJS.Engine,
    name: afterUpdate,
    callback: js.Function1[/* e */ IEventTimestamped[typingsSlinky.phaser.MatterJS.Engine], Unit]
  ): Unit = js.native
  /**
    * Fired when a call to `Composite.add` is made, before objects have been added.
    *
    * @event beforeAdd
    * @param {} event An event object
    * @param {} event.object The object(s) to be added (may be a single body, constraint, composite or a mixed array of these)
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_beforeAdd(
    obj: typingsSlinky.phaser.MatterJS.Engine,
    name: beforeAdd,
    callback: js.Function1[/* e */ IEventComposite[CompositeType], Unit]
  ): Unit = js.native
  /**
    * Fired when a call to `Composite.remove` is made, before objects have been removed.
    *
    * @event beforeRemove
    * @param {} event An event object
    * @param {} event.object The object(s) to be removed (may be a single body, constraint, composite or a mixed array of these)
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_beforeRemove(
    obj: typingsSlinky.phaser.MatterJS.Engine,
    name: beforeRemove,
    callback: js.Function1[/* e */ IEventComposite[CompositeType], Unit]
  ): Unit = js.native
  /**
    * Fired before rendering
    *
    * @event beforeRender
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_beforeRender(
    obj: typingsSlinky.phaser.MatterJS.Engine,
    name: beforeRender,
    callback: js.Function1[/* e */ IEventTimestamped[typingsSlinky.phaser.MatterJS.Runner], Unit]
  ): Unit = js.native
  /**
    * Fired at the start of a tick, before any updates to the engine or timing
    *
    * @event beforeTick
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_beforeTick(
    obj: typingsSlinky.phaser.MatterJS.Engine,
    name: beforeTick,
    callback: js.Function1[/* e */ IEventTimestamped[typingsSlinky.phaser.MatterJS.Runner], Unit]
  ): Unit = js.native
  /**
    * Fired just before an update
    *
    * @event beforeUpdate
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_beforeUpdate(
    obj: typingsSlinky.phaser.MatterJS.Engine,
    name: beforeUpdate,
    callback: js.Function1[/* e */ IEventTimestamped[typingsSlinky.phaser.MatterJS.Engine], Unit]
  ): Unit = js.native
  /**
    * Fired after engine update, provides a list of all pairs that are colliding in the current tick (if any)
    *
    * @event collisionActive
    * @param {} event An event object
    * @param {} event.pairs List of affected pairs
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_collisionActive(
    obj: typingsSlinky.phaser.MatterJS.Engine,
    name: collisionActive,
    callback: js.Function1[/* e */ IEventCollision[typingsSlinky.phaser.MatterJS.Engine], Unit]
  ): Unit = js.native
  /**
    * Fired after engine update, provides a list of all pairs that have ended collision in the current tick (if any)
    *
    * @event collisionEnd
    * @param {} event An event object
    * @param {} event.pairs List of affected pairs
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_collisionEnd(
    obj: typingsSlinky.phaser.MatterJS.Engine,
    name: collisionEnd,
    callback: js.Function1[/* e */ IEventCollision[typingsSlinky.phaser.MatterJS.Engine], Unit]
  ): Unit = js.native
  /**
    * Fired after engine update, provides a list of all pairs that have started to collide in the current tick (if any)
    *
    * @event collisionStart
    * @param {} event An event object
    * @param {} event.pairs List of affected pairs
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_collisionStart(
    obj: typingsSlinky.phaser.MatterJS.Engine,
    name: collisionStart,
    callback: js.Function1[/* e */ IEventCollision[typingsSlinky.phaser.MatterJS.Engine], Unit]
  ): Unit = js.native
  /**
    * Fired when a body ends sleeping (where `this` is the body).
    *
    * @event sleepEnd
    * @this {body} The body that has ended sleeping
    * @param {} event An event object
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_sleepEnd(obj: BodyType, name: sleepEnd, callback: js.Function1[/* e */ IEvent[BodyType], Unit]): Unit = js.native
  /**
    * Fired when a body starts sleeping (where `this` is the body).
    *
    * @event sleepStart
    * @this {body} The body that has started sleeping
    * @param {} event An event object
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_sleepStart(obj: BodyType, name: sleepStart, callback: js.Function1[/* e */ IEvent[BodyType], Unit]): Unit = js.native
  /**
    * Fired after engine timing updated, but just before update
    *
    * @event tick
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_tick(
    obj: typingsSlinky.phaser.MatterJS.Engine,
    name: tick,
    callback: js.Function1[/* e */ IEventTimestamped[typingsSlinky.phaser.MatterJS.Runner], Unit]
  ): Unit = js.native
  
  /**
    * Fires all the callbacks subscribed to the given object's eventName, in the order they subscribed, if any.
    *
    * @param object
    * @param eventNames
    * @param event
    */
  def trigger(`object`: js.Any, eventNames: String): Unit = js.native
  def trigger(`object`: js.Any, eventNames: String, event: js.Function1[/* e */ js.Any, Unit]): Unit = js.native
}
