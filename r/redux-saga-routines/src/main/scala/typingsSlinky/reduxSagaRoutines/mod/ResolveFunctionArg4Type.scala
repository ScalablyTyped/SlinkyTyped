package typingsSlinky.reduxSagaRoutines.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.UndefOr[scala.Nothing]
  - scala.Nothing
*/
trait ResolveFunctionArg4Type[TFunction] extends js.Object

object ResolveFunctionArg4Type {
  @scala.inline
  implicit def apply[TFunction](value: scala.Nothing): ResolveFunctionArg4Type[TFunction] = value.asInstanceOf[ResolveFunctionArg4Type[TFunction]]
  @scala.inline
  implicit def fromUndef[TFunction, T](value: js.UndefOr[T])(implicit ev: T => ResolveFunctionArg4Type[TFunction]): ResolveFunctionArg4Type[TFunction] = value.asInstanceOf[ResolveFunctionArg4Type[TFunction]]
}

