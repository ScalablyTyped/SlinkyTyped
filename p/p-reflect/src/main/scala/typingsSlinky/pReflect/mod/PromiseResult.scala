package typingsSlinky.pReflect.mod

import typingsSlinky.pReflect.pReflectBooleans.`false`
import typingsSlinky.pReflect.pReflectBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pReflect.mod.PromiseFulfilledResult[ValueType]
  - typingsSlinky.pReflect.mod.PromiseRejectedResult
*/
trait PromiseResult[ValueType] extends js.Object
object PromiseResult {
  
  @scala.inline
  def PromiseFulfilledResult[ValueType](isFulfilled: `true`, isRejected: `false`, value: ValueType): PromiseResult[ValueType] = {
    val __obj = js.Dynamic.literal(isFulfilled = isFulfilled.asInstanceOf[js.Any], isRejected = isRejected.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseResult[ValueType]]
  }
  
  @scala.inline
  def PromiseRejectedResult[ValueType](isFulfilled: `false`, isRejected: `true`, reason: js.Any): PromiseResult[ValueType] = {
    val __obj = js.Dynamic.literal(isFulfilled = isFulfilled.asInstanceOf[js.Any], isRejected = isRejected.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseResult[ValueType]]
  }
}
