package typingsSlinky.mockingoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - js.Symbol
  - js.Object
  - scala.Unit
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait ExpectedReturnType extends js.Object

object ExpectedReturnType {
  @scala.inline
  implicit def apply(value: Boolean): ExpectedReturnType = value.asInstanceOf[ExpectedReturnType]
  @scala.inline
  implicit def apply(value: Double): ExpectedReturnType = value.asInstanceOf[ExpectedReturnType]
  @scala.inline
  implicit def apply(value: Null): ExpectedReturnType = value.asInstanceOf[ExpectedReturnType]
  @scala.inline
  implicit def apply(value: js.Object): ExpectedReturnType = value.asInstanceOf[ExpectedReturnType]
  @scala.inline
  implicit def apply(value: String): ExpectedReturnType = value.asInstanceOf[ExpectedReturnType]
  @scala.inline
  implicit def apply(value: js.Symbol): ExpectedReturnType = value.asInstanceOf[ExpectedReturnType]
  @scala.inline
  implicit def apply(value: Unit): ExpectedReturnType = value.asInstanceOf[ExpectedReturnType]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => ExpectedReturnType): ExpectedReturnType = value.asInstanceOf[ExpectedReturnType]
}

