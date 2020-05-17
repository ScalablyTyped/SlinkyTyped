package typingsSlinky.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.ractive.mod.ComputationFn[T]
  - typingsSlinky.ractive.mod.ComputationDescriptor[T]
*/
trait Computation[T /* <: Ractive[T] */] extends js.Object

object Computation {
  @scala.inline
  implicit def apply[T](value: ComputationDescriptor[T]): Computation[T] = value.asInstanceOf[Computation[T]]
  @scala.inline
  implicit def apply[T](value: ComputationFn[T]): Computation[T] = value.asInstanceOf[Computation[T]]
  @scala.inline
  implicit def apply[T](value: String): Computation[T] = value.asInstanceOf[Computation[T]]
}

