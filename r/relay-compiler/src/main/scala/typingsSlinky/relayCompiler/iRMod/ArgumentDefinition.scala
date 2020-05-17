package typingsSlinky.relayCompiler.iRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayCompiler.iRMod.LocalArgumentDefinition
  - typingsSlinky.relayCompiler.iRMod.RootArgumentDefinition
*/
trait ArgumentDefinition extends js.Object

object ArgumentDefinition {
  @scala.inline
  implicit def apply(value: LocalArgumentDefinition): ArgumentDefinition = value.asInstanceOf[ArgumentDefinition]
  @scala.inline
  implicit def apply(value: RootArgumentDefinition): ArgumentDefinition = value.asInstanceOf[ArgumentDefinition]
}

