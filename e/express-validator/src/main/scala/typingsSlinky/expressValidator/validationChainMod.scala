package typingsSlinky.expressValidator

import typingsSlinky.expressValidator.baseMod.Request
import typingsSlinky.expressValidator.contextBuilderMod.ContextBuilder
import typingsSlinky.expressValidator.contextHandlerMod.ContextHandler
import typingsSlinky.expressValidator.contextRunnerMod.ContextRunner
import typingsSlinky.expressValidator.sanitizersMod.Sanitizers
import typingsSlinky.expressValidator.validatorsMod.Validators
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validationChainMod {
  
  @js.native
  trait ValidationChain
    extends Validators[ValidationChain]
       with Sanitizers[ValidationChain]
       with ContextHandler[ValidationChain]
       with ContextRunner {
    
    def apply(req: Request, res: js.Any, next: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Unit = js.native
    
    var builder: ContextBuilder = js.native
  }
}
