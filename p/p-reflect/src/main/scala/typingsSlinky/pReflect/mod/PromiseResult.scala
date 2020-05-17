package typingsSlinky.pReflect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pReflect.mod.PromiseFulfilledResult[ValueType]
  - typingsSlinky.pReflect.mod.PromiseRejectedResult
*/
trait PromiseResult[ValueType] extends js.Object

object PromiseResult {
  @scala.inline
  implicit def apply[ValueType](value: PromiseFulfilledResult[ValueType]): PromiseResult[ValueType] = value.asInstanceOf[PromiseResult[ValueType]]
  @scala.inline
  implicit def apply[ValueType](value: PromiseRejectedResult): PromiseResult[ValueType] = value.asInstanceOf[PromiseResult[ValueType]]
}

