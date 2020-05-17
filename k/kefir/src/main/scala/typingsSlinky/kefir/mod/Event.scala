package typingsSlinky.kefir.mod

import typingsSlinky.kefir.anon.Type
import typingsSlinky.kefir.anon.TypeValue
import typingsSlinky.kefir.anon.ValueVoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.kefir.anon.Type[V]
  - typingsSlinky.kefir.anon.TypeValue[E]
  - typingsSlinky.kefir.anon.ValueVoid
*/
trait Event[V, E] extends js.Object

object Event {
  @scala.inline
  implicit def apply[V, E](value: Type[V]): Event[V, E] = value.asInstanceOf[Event[V, E]]
  @scala.inline
  implicit def apply[V, E](value: TypeValue[E]): Event[V, E] = value.asInstanceOf[Event[V, E]]
  @scala.inline
  implicit def apply[V, E](value: ValueVoid): Event[V, E] = value.asInstanceOf[Event[V, E]]
}

