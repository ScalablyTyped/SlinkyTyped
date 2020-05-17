package typingsSlinky.jest.mod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Any
  - T
*/
trait ResolvedValue[T] extends js.Object

object ResolvedValue {
  @scala.inline
  implicit def apply[T](value: js.Any): ResolvedValue[T] = value.asInstanceOf[ResolvedValue[T]]
  @scala.inline
  implicit def apply[T](value: T): ResolvedValue[T] = value.asInstanceOf[ResolvedValue[T]]
}

