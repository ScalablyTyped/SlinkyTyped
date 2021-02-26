package typingsSlinky.expressValidator

import typingsSlinky.expressValidator.contextBuilderMod.ContextBuilder
import typingsSlinky.expressValidator.contextMod.Context
import typingsSlinky.expressValidator.contextMod.ReadonlyContext
import typingsSlinky.expressValidator.contextRunnerMod.ContextRunner
import typingsSlinky.expressValidator.selectFieldsMod.SelectFields_
import typingsSlinky.expressValidator.validationResultMod.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextRunnerImplMod {
  
  @JSImport("express-validator/src/chain/context-runner-impl", "ContextRunnerImpl")
  @js.native
  class ContextRunnerImpl protected () extends ContextRunner {
    def this(builderOrContext: ContextBuilder) = this()
    def this(builderOrContext: Context) = this()
    def this(builderOrContext: ContextBuilder, selectFields: SelectFields_) = this()
    def this(builderOrContext: Context, selectFields: SelectFields_) = this()
    
    val builderOrContext: js.Any = js.native
    
    val selectFields: js.Any = js.native
  }
  
  @js.native
  trait ResultWithContext
    extends Result[js.Any] {
    
    val context: ReadonlyContext = js.native
  }
}
