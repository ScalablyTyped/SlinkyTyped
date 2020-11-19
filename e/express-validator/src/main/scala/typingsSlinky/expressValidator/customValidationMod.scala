package typingsSlinky.expressValidator

import typingsSlinky.expressValidator.baseMod.CustomValidator
import typingsSlinky.expressValidator.contextItemMod.ContextItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-validator/src/context-items/custom-validation", JSImport.Namespace)
@js.native
object customValidationMod extends js.Object {
  
  @js.native
  class CustomValidation protected () extends ContextItem {
    def this(validator: CustomValidator, negated: Boolean) = this()
    
    var message: js.Any = js.native
    
    val negated: js.Any = js.native
    
    val validator: js.Any = js.native
  }
}
