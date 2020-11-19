package typingsSlinky.relayCompiler

import typingsSlinky.relayCompiler.compilerContextMod.CompilerContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("relay-compiler/lib/transforms/MatchTransform", JSImport.Namespace)
@js.native
object matchTransformMod extends js.Object {
  
  /**
    * This transform rewrites LinkedField nodes with @match and rewrites them
    * into `LinkedField` nodes with a `supported` argument.
    */
  def transform(context: CompilerContext): CompilerContext = js.native
}
