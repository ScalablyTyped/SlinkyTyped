package typingsSlinky.expressDashValidator

import typingsSlinky.expressDashValidator.srcBaseMod.Request
import typingsSlinky.expressDashValidator.srcChainContextDashHandlerMod.ContextHandler
import typingsSlinky.expressDashValidator.srcChainContextDashRunnerMod.ContextRunner
import typingsSlinky.expressDashValidator.srcChainSanitizersMod.Sanitizers
import typingsSlinky.expressDashValidator.srcChainValidatorsMod.Validators
import typingsSlinky.expressDashValidator.srcContextDashBuilderMod.ContextBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/chain/validation-chain", JSImport.Namespace)
@js.native
object srcChainValidationDashChainMod extends js.Object {
  @js.native
  trait ValidationChain
    extends Validators[ValidationChain]
       with Sanitizers[ValidationChain]
       with ContextHandler[ValidationChain]
       with ContextRunner {
    var builder: ContextBuilder = js.native
    def apply(req: Request, res: js.Any, next: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Unit = js.native
  }
  
}

