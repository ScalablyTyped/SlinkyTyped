package typingsSlinky.reactNativeRssParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - js.UndefOr[scala.Nothing]
*/
trait Maybe[T] extends js.Object

object Maybe {
  @scala.inline
  implicit def apply[T](value: T): Maybe[T] = value.asInstanceOf[Maybe[T]]
  @scala.inline
  implicit def fromUndef[T, T_](value: js.UndefOr[T_])(implicit ev: T_ => Maybe[T]): Maybe[T] = value.asInstanceOf[Maybe[T]]
}

