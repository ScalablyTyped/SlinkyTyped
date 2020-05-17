package typingsSlinky.sanctuary.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - A
  - scala.Null
*/
trait Nullable[A] extends js.Object

object Nullable {
  @scala.inline
  implicit def apply[A](value: A): Nullable[A] = value.asInstanceOf[Nullable[A]]
  @scala.inline
  implicit def apply[A](value: Null): Nullable[A] = value.asInstanceOf[Nullable[A]]
}

