package typingsSlinky.relayCompiler.iRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayCompiler.iRMod.ListValue
  - typingsSlinky.relayCompiler.iRMod.Literal
  - typingsSlinky.relayCompiler.iRMod.ObjectValue
  - typingsSlinky.relayCompiler.iRMod.Variable
*/
trait ArgumentValue extends js.Object

object ArgumentValue {
  @scala.inline
  implicit def apply(value: ListValue): ArgumentValue = value.asInstanceOf[ArgumentValue]
  @scala.inline
  implicit def apply(value: Literal): ArgumentValue = value.asInstanceOf[ArgumentValue]
  @scala.inline
  implicit def apply(value: ObjectValue): ArgumentValue = value.asInstanceOf[ArgumentValue]
  @scala.inline
  implicit def apply(value: Variable): ArgumentValue = value.asInstanceOf[ArgumentValue]
}

