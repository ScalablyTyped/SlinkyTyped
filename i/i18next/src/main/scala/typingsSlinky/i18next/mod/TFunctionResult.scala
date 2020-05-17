package typingsSlinky.i18next.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Object
  - js.Array[java.lang.String | js.Object]
  - js.UndefOr[scala.Nothing]
  - scala.Null
*/
trait TFunctionResult extends js.Object

object TFunctionResult {
  @scala.inline
  implicit def apply(value: js.Array[String | js.Object]): TFunctionResult = value.asInstanceOf[TFunctionResult]
  @scala.inline
  implicit def apply(value: Null): TFunctionResult = value.asInstanceOf[TFunctionResult]
  @scala.inline
  implicit def apply(value: js.Object): TFunctionResult = value.asInstanceOf[TFunctionResult]
  @scala.inline
  implicit def apply(value: String): TFunctionResult = value.asInstanceOf[TFunctionResult]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => TFunctionResult): TFunctionResult = value.asInstanceOf[TFunctionResult]
}

