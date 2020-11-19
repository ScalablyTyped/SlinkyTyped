package typingsSlinky.expressValidator

import typingsSlinky.expressValidator.baseMod.CustomValidator
import typingsSlinky.expressValidator.baseMod.StandardValidator
import typingsSlinky.expressValidator.validationChainMod.ValidationChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-validator/src/context-items", JSImport.Namespace)
@js.native
object contextItemsMod extends js.Object {
  
  @js.native
  class ChainCondition protected ()
    extends typingsSlinky.expressValidator.chainConditionMod.ChainCondition {
    def this(chain: ValidationChain) = this()
  }
  
  @js.native
  class CustomCondition protected ()
    extends typingsSlinky.expressValidator.customConditionMod.CustomCondition {
    def this(condition: CustomValidator) = this()
  }
  
  @js.native
  class CustomValidation protected ()
    extends typingsSlinky.expressValidator.customValidationMod.CustomValidation {
    def this(validator: CustomValidator, negated: Boolean) = this()
  }
  
  @js.native
  class StandardValidation protected ()
    extends typingsSlinky.expressValidator.standardValidationMod.StandardValidation {
    def this(validator: StandardValidator, negated: Boolean) = this()
    def this(validator: StandardValidator, negated: Boolean, options: js.Array[_]) = this()
  }
}
