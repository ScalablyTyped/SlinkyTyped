package typingsSlinky.expressDashValidator

import typingsSlinky.expressDashValidator.srcBaseMod.Meta
import typingsSlinky.expressDashValidator.srcChainValidationDashChainMod.ValidationChain
import typingsSlinky.expressDashValidator.srcContextDashItemsContextDashItemMod.ContextItem
import typingsSlinky.expressDashValidator.srcContextMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/context-items/chain-condition", JSImport.Namespace)
@js.native
object srcContextDashItemsChainDashConditionMod extends js.Object {
  @js.native
  class ChainCondition protected () extends ContextItem {
    def this(chain: ValidationChain) = this()
    val chain: js.Any = js.native
    /* CompleteClass */
    override def run(context: Context, value: js.Any, meta: Meta): js.Promise[Unit] = js.native
  }
  
}

