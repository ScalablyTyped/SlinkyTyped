package typingsSlinky.minappEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - js.UndefOr[scala.Nothing]
  - scala.Null
*/
trait Void[T] extends js.Object

object Void {
  @scala.inline
  implicit def apply[T](value: Null): Void[T] = value.asInstanceOf[Void[T]]
  @scala.inline
  implicit def apply[T](value: T): Void[T] = value.asInstanceOf[Void[T]]
  @scala.inline
  implicit def fromUndef[T, T_](value: js.UndefOr[T_])(implicit ev: T_ => Void[T]): Void[T] = value.asInstanceOf[Void[T]]
}

