package typingsSlinky.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ractive.mod.ObserverBaseDescriptor[T]
  - typingsSlinky.ractive.mod.ObserverArrayDescriptor[T]
*/
trait ObserverDescriptor[T /* <: Ractive[T] */] extends js.Object

object ObserverDescriptor {
  @scala.inline
  implicit def apply[T](value: ObserverArrayDescriptor[T]): ObserverDescriptor[T] = value.asInstanceOf[ObserverDescriptor[T]]
  @scala.inline
  implicit def apply[T](value: ObserverBaseDescriptor[T]): ObserverDescriptor[T] = value.asInstanceOf[ObserverDescriptor[T]]
}

