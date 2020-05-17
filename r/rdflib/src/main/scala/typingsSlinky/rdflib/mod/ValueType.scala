package typingsSlinky.rdflib.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rdflib.mod.Node
  - typingsSlinky.std.Date
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - js.UndefOr[scala.Nothing]
*/
trait ValueType extends js.Object

object ValueType {
  @scala.inline
  implicit def apply(value: Boolean): ValueType = value.asInstanceOf[ValueType]
  @scala.inline
  implicit def apply(value: js.Date): ValueType = value.asInstanceOf[ValueType]
  @scala.inline
  implicit def apply(value: Double): ValueType = value.asInstanceOf[ValueType]
  @scala.inline
  implicit def apply(value: Node): ValueType = value.asInstanceOf[ValueType]
  @scala.inline
  implicit def apply(value: String): ValueType = value.asInstanceOf[ValueType]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => ValueType): ValueType = value.asInstanceOf[ValueType]
}

