package typingsSlinky.expressValidator

import typingsSlinky.expressValidator.baseMod.CustomValidator
import typingsSlinky.expressValidator.baseMod.StandardValidator
import typingsSlinky.expressValidator.validationChainMod.ValidationChain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextItemsMod {
  
  @JSImport("express-validator/src/context-items", "ChainCondition")
  @js.native
  class ChainCondition protected ()
    extends typingsSlinky.expressValidator.chainConditionMod.ChainCondition {
    def this(chain: ValidationChain) = this()
  }
  
  @JSImport("express-validator/src/context-items", "CustomCondition")
  @js.native
  class CustomCondition protected ()
    extends typingsSlinky.expressValidator.customConditionMod.CustomCondition {
    def this(condition: CustomValidator) = this()
  }
  
  @JSImport("express-validator/src/context-items", "CustomValidation")
  @js.native
  class CustomValidation protected ()
    extends typingsSlinky.expressValidator.customValidationMod.CustomValidation {
    def this(validator: CustomValidator, negated: Boolean) = this()
  }
  
  @JSImport("express-validator/src/context-items", "StandardValidation")
  @js.native
  class StandardValidation protected ()
    extends typingsSlinky.expressValidator.standardValidationMod.StandardValidation {
    def this(validator: StandardValidator, negated: Boolean) = this()
    def this(validator: StandardValidator, negated: Boolean, options: js.Array[_]) = this()
  }
}
