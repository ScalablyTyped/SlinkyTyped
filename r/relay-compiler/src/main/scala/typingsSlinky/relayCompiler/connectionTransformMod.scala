package typingsSlinky.relayCompiler

import typingsSlinky.relayCompiler.compilerContextMod.CompilerContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("relay-compiler/lib/transforms/ConnectionTransform", JSImport.Namespace)
@js.native
object connectionTransformMod extends js.Object {
  
  /**
    * This transform rewrites LinkedField nodes with @connection_resolver and rewrites them
    * into `ConnectionField` nodes.
    */
  def transform(context: CompilerContext): CompilerContext = js.native
}
