package typingsSlinky.oja.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - scala.Double
  - java.lang.String
  - js.Symbol
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait Primitive extends js.Object

object Primitive {
  @scala.inline
  implicit def apply(value: Boolean): Primitive = value.asInstanceOf[Primitive]
  @scala.inline
  implicit def apply(value: Double): Primitive = value.asInstanceOf[Primitive]
  @scala.inline
  implicit def apply(value: Null): Primitive = value.asInstanceOf[Primitive]
  @scala.inline
  implicit def apply(value: String): Primitive = value.asInstanceOf[Primitive]
  @scala.inline
  implicit def apply(value: js.Symbol): Primitive = value.asInstanceOf[Primitive]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => Primitive): Primitive = value.asInstanceOf[Primitive]
}

