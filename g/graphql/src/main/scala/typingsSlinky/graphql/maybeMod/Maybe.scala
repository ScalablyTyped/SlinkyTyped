package typingsSlinky.graphql.maybeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Null
  - js.UndefOr[scala.Nothing]
  - T
*/
trait Maybe[T] extends js.Object

object Maybe {
  @scala.inline
  implicit def apply[T](value: Null): Maybe[T] = value.asInstanceOf[Maybe[T]]
  @scala.inline
  implicit def apply[T](value: T): Maybe[T] = value.asInstanceOf[Maybe[T]]
  @scala.inline
  implicit def fromUndef[T, T_](value: js.UndefOr[T_])(implicit ev: T_ => Maybe[T]): Maybe[T] = value.asInstanceOf[Maybe[T]]
}

