package typingsSlinky.expressValidator

import typingsSlinky.expressValidator.baseMod.Request
import typingsSlinky.expressValidator.contextBuilderMod.ContextBuilder
import typingsSlinky.expressValidator.contextRunnerMod.ContextRunner
import typingsSlinky.expressValidator.sanitizersMod.Sanitizers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sanitizationChainMod {
  
  @js.native
  trait SanitizationChain
    extends Sanitizers[SanitizationChain]
       with ContextRunner {
    
    def apply(req: Request, res: js.Any, next: js.Function1[/* errors */ js.UndefOr[js.Any], Unit]): Unit = js.native
    
    var builder: ContextBuilder = js.native
  }
}
