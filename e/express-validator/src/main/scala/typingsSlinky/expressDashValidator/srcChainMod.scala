package typingsSlinky.expressDashValidator

import typingsSlinky.expressDashValidator.srcContextDashBuilderMod.ContextBuilder
import typingsSlinky.expressDashValidator.srcSelectDashFieldsMod.SelectFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/chain", JSImport.Namespace)
@js.native
object srcChainMod extends js.Object {
  @js.native
  class ContextHandlerImpl[Chain] protected ()
    extends typingsSlinky.expressDashValidator.srcChainContextDashHandlerDashImplMod.ContextHandlerImpl[Chain] {
    def this(builder: ContextBuilder, chain: Chain) = this()
  }
  
  @js.native
  class ContextRunnerImpl protected ()
    extends typingsSlinky.expressDashValidator.srcChainContextDashRunnerDashImplMod.ContextRunnerImpl {
    def this(builder: ContextBuilder) = this()
    def this(builder: ContextBuilder, selectFields: SelectFields) = this()
  }
  
  @js.native
  class SanitizersImpl[Chain] protected ()
    extends typingsSlinky.expressDashValidator.srcChainSanitizersDashImplMod.SanitizersImpl[Chain] {
    def this(builder: ContextBuilder, chain: Chain) = this()
  }
  
  @js.native
  class ValidatorsImpl[Chain] protected ()
    extends typingsSlinky.expressDashValidator.srcChainValidatorsDashImplMod.ValidatorsImpl[Chain] {
    def this(builder: ContextBuilder, chain: Chain) = this()
  }
  
}

