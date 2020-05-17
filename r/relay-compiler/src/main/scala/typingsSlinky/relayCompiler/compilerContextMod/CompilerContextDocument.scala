package typingsSlinky.relayCompiler.compilerContextMod

import typingsSlinky.relayCompiler.iRMod.Fragment
import typingsSlinky.relayCompiler.iRMod.Root
import typingsSlinky.relayCompiler.iRMod.SplitOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayCompiler.iRMod.Fragment
  - typingsSlinky.relayCompiler.iRMod.Root
  - typingsSlinky.relayCompiler.iRMod.SplitOperation
*/
trait CompilerContextDocument extends js.Object

object CompilerContextDocument {
  @scala.inline
  implicit def apply(value: Fragment): CompilerContextDocument = value.asInstanceOf[CompilerContextDocument]
  @scala.inline
  implicit def apply(value: Root): CompilerContextDocument = value.asInstanceOf[CompilerContextDocument]
  @scala.inline
  implicit def apply(value: SplitOperation): CompilerContextDocument = value.asInstanceOf[CompilerContextDocument]
}

