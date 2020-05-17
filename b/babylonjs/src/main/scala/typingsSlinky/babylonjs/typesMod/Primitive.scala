package typingsSlinky.babylonjs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Alias type for primitive types
  * @ignorenaming
  */
/* Rewritten from type alias, can be one of: 
  - js.UndefOr[scala.Nothing]
  - scala.Null
  - scala.Boolean
  - java.lang.String
  - scala.Double
  - js.Function
*/
trait Primitive extends js.Object

object Primitive {
  @scala.inline
  implicit def apply(value: Boolean): Primitive = value.asInstanceOf[Primitive]
  @scala.inline
  implicit def apply(value: Double): Primitive = value.asInstanceOf[Primitive]
  @scala.inline
  implicit def apply(value: js.Function): Primitive = value.asInstanceOf[Primitive]
  @scala.inline
  implicit def apply(value: Null): Primitive = value.asInstanceOf[Primitive]
  @scala.inline
  implicit def apply(value: String): Primitive = value.asInstanceOf[Primitive]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => Primitive): Primitive = value.asInstanceOf[Primitive]
}

