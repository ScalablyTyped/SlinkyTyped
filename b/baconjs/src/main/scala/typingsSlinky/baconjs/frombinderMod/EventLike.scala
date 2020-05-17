package typingsSlinky.baconjs.frombinderMod

import typingsSlinky.baconjs.eventMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - V
  - typingsSlinky.baconjs.eventMod.Event[V]
  - js.Array[typingsSlinky.baconjs.eventMod.Event[V]]
*/
trait EventLike[V] extends js.Object

object EventLike {
  @scala.inline
  implicit def apply[V](value: js.Array[Event[V]]): EventLike[V] = value.asInstanceOf[EventLike[V]]
  @scala.inline
  implicit def apply[V](value: Event[V]): EventLike[V] = value.asInstanceOf[EventLike[V]]
  @scala.inline
  implicit def apply[V](value: V): EventLike[V] = value.asInstanceOf[EventLike[V]]
}

