package typingsSlinky.promiseInflight.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Thenable[T]
  - T
*/
trait Resolvable[T] extends js.Object

object Resolvable {
  @scala.inline
  implicit def apply[T](value: T): Resolvable[T] = value.asInstanceOf[Resolvable[T]]
  @scala.inline
  implicit def apply[T](value: js.Thenable[T]): Resolvable[T] = value.asInstanceOf[Resolvable[T]]
}

