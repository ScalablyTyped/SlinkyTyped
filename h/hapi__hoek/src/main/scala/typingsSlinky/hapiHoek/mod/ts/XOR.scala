package typingsSlinky.hapiHoek.mod.ts

import typingsSlinky.hapiHoek.mod.internals.Without
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a type that can must be one of T or U but not both.
  */
/* Rewritten from type alias, can be one of: 
  - T
  - U
  - (typingsSlinky.hapiHoek.mod.internals.Without[T, U]) with U
  - (typingsSlinky.hapiHoek.mod.internals.Without[U, T]) with T
*/
trait XOR[T, U] extends js.Object

object XOR {
  @scala.inline
  implicit def apply[T, U](value: (Without[T, U]) with U with (Without[U, T]) with T): XOR[T, U] = value.asInstanceOf[XOR[T, U]]
  @scala.inline
  implicit def apply[T, U](value: T | U): XOR[T, U] = value.asInstanceOf[XOR[T, U]]
}

