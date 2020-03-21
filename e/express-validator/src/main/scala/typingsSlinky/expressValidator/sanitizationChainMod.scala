package typingsSlinky.expressValidator

import typingsSlinky.expressValidator.baseMod.Request
import typingsSlinky.expressValidator.contextBuilderMod.ContextBuilder
import typingsSlinky.expressValidator.contextRunnerMod.ContextRunner
import typingsSlinky.expressValidator.sanitizersMod.Sanitizers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/chain/sanitization-chain", JSImport.Namespace)
@js.native
object sanitizationChainMod extends js.Object {
  @js.native
  trait SanitizationChain
    extends Sanitizers[SanitizationChain]
       with ContextRunner {
    var builder: ContextBuilder = js.native
    def apply(req: Request, res: js.Any, next: js.Function1[/* errors */ js.UndefOr[js.Any], Unit]): Unit = js.native
  }
  
}

