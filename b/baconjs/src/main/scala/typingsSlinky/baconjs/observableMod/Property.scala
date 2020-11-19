package typingsSlinky.baconjs.observableMod

import typingsSlinky.baconjs.describeMod.Desc
import typingsSlinky.baconjs.typesMod.EventSink
import typingsSlinky.baconjs.typesMod.Subscribe
import typingsSlinky.baconjs.typesMod.Unsub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/observable", "Property")
@js.native
class Property[V] protected () extends Observable[V] {
  def this(desc: Desc, subscribe: Subscribe[V]) = this()
  def this(desc: Desc, subscribe: Subscribe[V], handler: EventSink[V]) = this()
  
  /**
    Combines properties with the `&&` operator. It produces a new value when either of the Properties change,
    combining the latest values using `&&`.
    */
  def and(other: Property[_]): Property[Boolean] = js.native
  
  /**
    Combines properties with the `||` operator. It produces a new value when either of the Properties change,
    combining the latest values using `||`.
    */
  def or(other: Property[_]): Property[Boolean] = js.native
  
  /**
    Creates an EventStream by sampling the
    property value at given interval (in milliseconds)
    */
  def sample(interval: Double): EventStream[V] = js.native
  
  /** @hidden */
  def subscribeInternal(): Unsub = js.native
  
  def toEventStream(options: EventStreamOptions): EventStream[V] = js.native
}
