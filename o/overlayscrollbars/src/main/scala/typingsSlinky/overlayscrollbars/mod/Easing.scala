package typingsSlinky.overlayscrollbars.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait Easing extends js.Object

object Easing {
  @scala.inline
  implicit def apply(value: Null): Easing = value.asInstanceOf[Easing]
  @scala.inline
  implicit def apply(value: String): Easing = value.asInstanceOf[Easing]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => Easing): Easing = value.asInstanceOf[Easing]
}

