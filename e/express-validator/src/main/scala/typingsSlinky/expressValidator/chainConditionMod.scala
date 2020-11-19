package typingsSlinky.expressValidator

import typingsSlinky.expressValidator.contextItemMod.ContextItem
import typingsSlinky.expressValidator.validationChainMod.ValidationChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-validator/src/context-items/chain-condition", JSImport.Namespace)
@js.native
object chainConditionMod extends js.Object {
  
  @js.native
  class ChainCondition protected () extends ContextItem {
    def this(chain: ValidationChain) = this()
    
    val chain: js.Any = js.native
  }
}
