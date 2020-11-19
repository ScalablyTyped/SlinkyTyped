package typingsSlinky.expressValidator

import typingsSlinky.expressValidator.baseMod.StandardValidator
import typingsSlinky.expressValidator.contextItemMod.ContextItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-validator/src/context-items/standard-validation", JSImport.Namespace)
@js.native
object standardValidationMod extends js.Object {
  
  @js.native
  class StandardValidation protected () extends ContextItem {
    def this(validator: StandardValidator, negated: Boolean) = this()
    def this(validator: StandardValidator, negated: Boolean, options: js.Array[_]) = this()
    
    var message: js.Any = js.native
    
    val negated: js.Any = js.native
    
    val options: js.Any = js.native
    
    val validator: js.Any = js.native
  }
}
