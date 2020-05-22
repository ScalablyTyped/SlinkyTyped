package typingsSlinky.expressValidator

import typingsSlinky.expressValidator.baseMod.Meta
import typingsSlinky.expressValidator.contextItemMod.ContextItem
import typingsSlinky.expressValidator.contextMod.Context
import typingsSlinky.expressValidator.validationChainMod.ValidationChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/context-items/chain-condition", JSImport.Namespace)
@js.native
object chainConditionMod extends js.Object {
  @js.native
  class ChainCondition protected () extends ContextItem {
    def this(chain: ValidationChain) = this()
    val chain: js.Any = js.native
    /* CompleteClass */
    override def run(context: Context, value: js.Any, meta: Meta): js.Promise[Unit] = js.native
  }
  
}

