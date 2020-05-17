package typingsSlinky.ethereumProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ethereumProtocol.mod.FunctionAbi
  - typingsSlinky.ethereumProtocol.mod.EventAbi
*/
trait AbiDefinition extends js.Object

object AbiDefinition {
  @scala.inline
  implicit def apply(value: EventAbi): AbiDefinition = value.asInstanceOf[AbiDefinition]
  @scala.inline
  implicit def apply(value: FunctionAbi): AbiDefinition = value.asInstanceOf[AbiDefinition]
}

