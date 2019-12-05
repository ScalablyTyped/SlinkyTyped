package typingsSlinky.expressDashValidator

import typingsSlinky.expressDashValidator.srcBaseMod.Request
import typingsSlinky.expressDashValidator.srcChainContextDashRunnerMod.ContextRunner
import typingsSlinky.expressDashValidator.srcChainSanitizationDashChainMod.SanitizationChain
import typingsSlinky.expressDashValidator.srcChainSanitizersMod.Sanitizers
import typingsSlinky.expressDashValidator.srcContextDashBuilderMod.ContextBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/chain/sanitization-chain", JSImport.Namespace)
@js.native
object srcChainSanitizationDashChainMod extends js.Object {
  @js.native
  trait SanitizationChain
    extends Sanitizers[SanitizationChain]
       with ContextRunner {
    var builder: ContextBuilder = js.native
    def apply(req: Request, res: js.Any, next: js.Function1[/* errors */ js.UndefOr[js.Any], Unit]): Unit = js.native
  }
  
}

