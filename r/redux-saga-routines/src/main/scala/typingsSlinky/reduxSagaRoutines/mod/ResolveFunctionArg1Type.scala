package typingsSlinky.reduxSagaRoutines.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.UndefOr[scala.Nothing]
  - scala.Nothing
*/
trait ResolveFunctionArg1Type[TFunction] extends js.Object

object ResolveFunctionArg1Type {
  @scala.inline
  implicit def apply[TFunction](value: scala.Nothing): ResolveFunctionArg1Type[TFunction] = value.asInstanceOf[ResolveFunctionArg1Type[TFunction]]
  @scala.inline
  implicit def fromUndef[TFunction, T](value: js.UndefOr[T])(implicit ev: T => ResolveFunctionArg1Type[TFunction]): ResolveFunctionArg1Type[TFunction] = value.asInstanceOf[ResolveFunctionArg1Type[TFunction]]
}

