package typingsSlinky.relayCompiler

import typingsSlinky.relayCompiler.compilerContextMod.CompilerContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("relay-compiler/lib/transforms/MaskTransform", JSImport.Namespace)
@js.native
object maskTransformMod extends js.Object {
  
  /**
    * A transform that inlines fragment spreads with the @relay(mask: false)
    * directive.
    */
  def transform(context: CompilerContext): CompilerContext = js.native
}
