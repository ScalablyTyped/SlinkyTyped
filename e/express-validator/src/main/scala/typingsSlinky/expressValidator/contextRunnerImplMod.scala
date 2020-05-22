package typingsSlinky.expressValidator

import typingsSlinky.expressValidator.contextBuilderMod.ContextBuilder
import typingsSlinky.expressValidator.contextMod.Context
import typingsSlinky.expressValidator.contextRunnerMod.ContextRunner
import typingsSlinky.expressValidator.selectFieldsMod.SelectFields_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/chain/context-runner-impl", JSImport.Namespace)
@js.native
object contextRunnerImplMod extends js.Object {
  @js.native
  class ContextRunnerImpl protected () extends ContextRunner {
    def this(builderOrContext: ContextBuilder) = this()
    def this(builderOrContext: Context) = this()
    def this(builderOrContext: ContextBuilder, selectFields: SelectFields_) = this()
    def this(builderOrContext: Context, selectFields: SelectFields_) = this()
    val builderOrContext: js.Any = js.native
    val selectFields: js.Any = js.native
  }
  
}

