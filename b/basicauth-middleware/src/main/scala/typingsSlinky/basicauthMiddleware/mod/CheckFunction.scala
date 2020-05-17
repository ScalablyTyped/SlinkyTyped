package typingsSlinky.basicauthMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.basicauthMiddleware.mod.checkFunctionSync
  - typingsSlinky.basicauthMiddleware.mod.checkFunctionPromise
  - typingsSlinky.basicauthMiddleware.mod.checkFunctionCallback
*/
trait CheckFunction extends js.Object

object CheckFunction {
  @scala.inline
  implicit def apply(value: checkFunctionPromise | checkFunctionSync): CheckFunction = value.asInstanceOf[CheckFunction]
  @scala.inline
  implicit def apply(value: checkFunctionCallback): CheckFunction = value.asInstanceOf[CheckFunction]
}

