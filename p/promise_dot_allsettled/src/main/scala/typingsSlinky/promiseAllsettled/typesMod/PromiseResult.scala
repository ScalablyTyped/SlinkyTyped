package typingsSlinky.promiseAllsettled.typesMod

import typingsSlinky.promiseAllsettled.promiseAllsettledStrings.fulfilled
import typingsSlinky.promiseAllsettled.promiseAllsettledStrings.rejected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.promiseAllsettled.typesMod.PromiseResolution[T]
  - typingsSlinky.promiseAllsettled.typesMod.PromiseRejection[E]
*/
trait PromiseResult[T, E] extends js.Object
object PromiseResult {
  
  @scala.inline
  def PromiseResolution[T, E](status: fulfilled, value: T): PromiseResult[T, E] = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseResult[T, E]]
  }
  
  @scala.inline
  def PromiseRejection[T, E](reason: E, status: rejected): PromiseResult[T, E] = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseResult[T, E]]
  }
}
