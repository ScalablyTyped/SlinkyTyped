package typingsSlinky.graphql.definitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function0[T]
  - T
*/
trait Thunk[T] extends js.Object

object Thunk {
  @scala.inline
  implicit def apply[T](value: js.Function0[T]): Thunk[T] = value.asInstanceOf[Thunk[T]]
  @scala.inline
  implicit def apply[T](value: T): Thunk[T] = value.asInstanceOf[Thunk[T]]
}

