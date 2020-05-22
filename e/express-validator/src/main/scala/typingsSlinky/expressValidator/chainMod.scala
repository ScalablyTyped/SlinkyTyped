package typingsSlinky.expressValidator

import typingsSlinky.expressValidator.contextBuilderMod.ContextBuilder
import typingsSlinky.expressValidator.contextMod.Context
import typingsSlinky.expressValidator.selectFieldsMod.SelectFields_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/chain", JSImport.Namespace)
@js.native
object chainMod extends js.Object {
  @js.native
  class ContextHandlerImpl[Chain] protected ()
    extends typingsSlinky.expressValidator.contextHandlerImplMod.ContextHandlerImpl[Chain] {
    def this(builder: ContextBuilder, chain: Chain) = this()
  }
  
  @js.native
  class ContextRunnerImpl protected ()
    extends typingsSlinky.expressValidator.contextRunnerImplMod.ContextRunnerImpl {
    def this(builderOrContext: ContextBuilder) = this()
    def this(builderOrContext: Context) = this()
    def this(builderOrContext: ContextBuilder, selectFields: SelectFields_) = this()
    def this(builderOrContext: Context, selectFields: SelectFields_) = this()
  }
  
  @js.native
  class SanitizersImpl[Chain] protected ()
    extends typingsSlinky.expressValidator.sanitizersImplMod.SanitizersImpl[Chain] {
    def this(builder: ContextBuilder, chain: Chain) = this()
  }
  
  @js.native
  class ValidatorsImpl[Chain] protected ()
    extends typingsSlinky.expressValidator.validatorsImplMod.ValidatorsImpl[Chain] {
    def this(builder: ContextBuilder, chain: Chain) = this()
  }
  
}

