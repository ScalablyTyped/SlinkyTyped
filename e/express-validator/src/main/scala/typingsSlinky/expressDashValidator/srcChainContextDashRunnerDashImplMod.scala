package typingsSlinky.expressDashValidator

import typingsSlinky.expressDashValidator.srcChainContextDashRunnerMod.ContextRunner
import typingsSlinky.expressDashValidator.srcContextDashBuilderMod.ContextBuilder
import typingsSlinky.expressDashValidator.srcSelectDashFieldsMod.SelectFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/chain/context-runner-impl", JSImport.Namespace)
@js.native
object srcChainContextDashRunnerDashImplMod extends js.Object {
  @js.native
  class ContextRunnerImpl protected () extends ContextRunner {
    def this(builder: ContextBuilder) = this()
    def this(builder: ContextBuilder, selectFields: SelectFields) = this()
    val builder: js.Any = js.native
    val selectFields: js.Any = js.native
  }
  
}

