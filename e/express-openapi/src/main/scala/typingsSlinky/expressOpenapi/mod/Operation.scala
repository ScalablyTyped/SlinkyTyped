package typingsSlinky.expressOpenapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.expressOpenapi.mod.OperationFunction
  - typingsSlinky.expressOpenapi.mod.OperationHandlerArray
*/
trait Operation extends js.Object

object Operation {
  @scala.inline
  implicit def apply(value: OperationFunction): Operation = value.asInstanceOf[Operation]
  @scala.inline
  implicit def apply(value: OperationHandlerArray): Operation = value.asInstanceOf[Operation]
}

