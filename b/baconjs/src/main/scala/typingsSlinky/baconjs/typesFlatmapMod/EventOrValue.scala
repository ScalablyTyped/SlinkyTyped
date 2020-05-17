package typingsSlinky.baconjs.typesFlatmapMod

import typingsSlinky.baconjs.eventMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.baconjs.eventMod.Event[V]
  - V
*/
trait EventOrValue[V] extends js.Object

object EventOrValue {
  @scala.inline
  implicit def apply[V](value: Event[V]): EventOrValue[V] = value.asInstanceOf[EventOrValue[V]]
  @scala.inline
  implicit def apply[V](value: V): EventOrValue[V] = value.asInstanceOf[EventOrValue[V]]
}

