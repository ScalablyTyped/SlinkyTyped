package typingsSlinky.expressValidator

import typingsSlinky.expressValidator.contextBuilderMod.ContextBuilder
import typingsSlinky.expressValidator.contextHandlerMod.ContextHandler
import typingsSlinky.expressValidator.contextMod.Optional
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-validator/src/chain/context-handler-impl", JSImport.Namespace)
@js.native
object contextHandlerImplMod extends js.Object {
  
  @js.native
  class ContextHandlerImpl[Chain] protected () extends ContextHandler[Chain] {
    def this(builder: ContextBuilder, chain: Chain) = this()
    
    val builder: js.Any = js.native
    
    val chain: js.Any = js.native
    
    def optional(options: Optional): Chain = js.native
  }
}
