package typingsSlinky.ethereumProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ethereumProtocol.mod.MethodAbi
  - typingsSlinky.ethereumProtocol.mod.ConstructorAbi
  - typingsSlinky.ethereumProtocol.mod.FallbackAbi
*/
trait FunctionAbi extends AbiDefinition

object FunctionAbi {
  @scala.inline
  implicit def apply(value: ConstructorAbi): FunctionAbi = value.asInstanceOf[FunctionAbi]
  @scala.inline
  implicit def apply(value: FallbackAbi): FunctionAbi = value.asInstanceOf[FunctionAbi]
  @scala.inline
  implicit def apply(value: MethodAbi): FunctionAbi = value.asInstanceOf[FunctionAbi]
}

