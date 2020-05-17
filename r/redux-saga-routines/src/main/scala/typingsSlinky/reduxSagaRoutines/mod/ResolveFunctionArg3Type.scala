package typingsSlinky.reduxSagaRoutines.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.UndefOr[scala.Nothing]
  - scala.Nothing
*/
trait ResolveFunctionArg3Type[TFunction] extends js.Object

object ResolveFunctionArg3Type {
  @scala.inline
  implicit def apply[TFunction](value: scala.Nothing): ResolveFunctionArg3Type[TFunction] = value.asInstanceOf[ResolveFunctionArg3Type[TFunction]]
  @scala.inline
  implicit def fromUndef[TFunction, T](value: js.UndefOr[T])(implicit ev: T => ResolveFunctionArg3Type[TFunction]): ResolveFunctionArg3Type[TFunction] = value.asInstanceOf[ResolveFunctionArg3Type[TFunction]]
}

