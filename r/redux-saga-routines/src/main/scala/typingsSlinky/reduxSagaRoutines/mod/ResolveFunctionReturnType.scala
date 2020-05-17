package typingsSlinky.reduxSagaRoutines.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.UndefOr[scala.Nothing]
  - scala.Nothing
*/
trait ResolveFunctionReturnType[TFunction] extends js.Object

object ResolveFunctionReturnType {
  @scala.inline
  implicit def apply[TFunction](value: scala.Nothing): ResolveFunctionReturnType[TFunction] = value.asInstanceOf[ResolveFunctionReturnType[TFunction]]
  @scala.inline
  implicit def fromUndef[TFunction, T](value: js.UndefOr[T])(implicit ev: T => ResolveFunctionReturnType[TFunction]): ResolveFunctionReturnType[TFunction] = value.asInstanceOf[ResolveFunctionReturnType[TFunction]]
}

