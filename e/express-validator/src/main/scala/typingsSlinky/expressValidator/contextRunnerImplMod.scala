package typingsSlinky.expressValidator

import typingsSlinky.expressValidator.contextBuilderMod.ContextBuilder
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
    def this(builder: ContextBuilder) = this()
    def this(builder: ContextBuilder, selectFields: SelectFields_) = this()
    val builder: js.Any = js.native
    val selectFields: js.Any = js.native
  }
  
}

