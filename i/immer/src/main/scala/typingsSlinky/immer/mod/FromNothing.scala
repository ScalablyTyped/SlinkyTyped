package typingsSlinky.immer.mod

import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Converts `nothing` into `undefined` */
/* Rewritten from type alias, can be one of: 
  - T
  - typingsSlinky.std.Exclude[T, typingsSlinky.immer.mod.Nothing_]
  - js.UndefOr[scala.Nothing]
*/
trait FromNothing[T]
  extends Produced[js.Any, js.Any]

object FromNothing {
  @scala.inline
  implicit def apply[T](value: (Exclude[T, Nothing_]) | T): FromNothing[T] = value.asInstanceOf[FromNothing[T]]
  @scala.inline
  implicit def fromUndef[T, T_](value: js.UndefOr[T_])(implicit ev: T_ => FromNothing[T]): FromNothing[T] = value.asInstanceOf[FromNothing[T]]
}

