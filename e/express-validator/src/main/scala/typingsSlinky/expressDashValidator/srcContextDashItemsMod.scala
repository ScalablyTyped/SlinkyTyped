package typingsSlinky.expressDashValidator

import typingsSlinky.expressDashValidator.srcBaseMod.CustomValidator
import typingsSlinky.expressDashValidator.srcBaseMod.StandardValidator
import typingsSlinky.expressDashValidator.srcChainValidationDashChainMod.ValidationChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/context-items", JSImport.Namespace)
@js.native
object srcContextDashItemsMod extends js.Object {
  @js.native
  class ChainCondition protected ()
    extends typingsSlinky.expressDashValidator.srcContextDashItemsChainDashConditionMod.ChainCondition {
    def this(chain: ValidationChain) = this()
  }
  
  @js.native
  class CustomCondition protected ()
    extends typingsSlinky.expressDashValidator.srcContextDashItemsCustomDashConditionMod.CustomCondition {
    def this(condition: CustomValidator) = this()
  }
  
  @js.native
  class CustomValidation protected ()
    extends typingsSlinky.expressDashValidator.srcContextDashItemsCustomDashValidationMod.CustomValidation {
    def this(validator: CustomValidator, negated: Boolean) = this()
  }
  
  @js.native
  class StandardValidation protected ()
    extends typingsSlinky.expressDashValidator.srcContextDashItemsStandardDashValidationMod.StandardValidation {
    def this(validator: StandardValidator, negated: Boolean) = this()
    def this(validator: StandardValidator, negated: Boolean, options: js.Array[_]) = this()
  }
  
}

