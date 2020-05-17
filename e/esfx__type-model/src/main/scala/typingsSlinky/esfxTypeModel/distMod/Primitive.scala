package typingsSlinky.esfxTypeModel.distMod

import typingsSlinky.std.BigInt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Symbol
  - scala.Boolean
  - scala.Double
  - typingsSlinky.std.BigInt
*/
trait Primitive extends js.Object

object Primitive {
  @scala.inline
  implicit def apply(value: BigInt): Primitive = value.asInstanceOf[Primitive]
  @scala.inline
  implicit def apply(value: Boolean): Primitive = value.asInstanceOf[Primitive]
  @scala.inline
  implicit def apply(value: Double): Primitive = value.asInstanceOf[Primitive]
  @scala.inline
  implicit def apply(value: String): Primitive = value.asInstanceOf[Primitive]
  @scala.inline
  implicit def apply(value: js.Symbol): Primitive = value.asInstanceOf[Primitive]
}

