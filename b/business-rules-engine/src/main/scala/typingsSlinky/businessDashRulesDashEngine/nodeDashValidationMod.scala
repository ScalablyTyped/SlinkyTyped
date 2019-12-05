package typingsSlinky.businessDashRulesDashEngine

import typingsSlinky.businessDashRulesDashEngine.businessDashRulesDashEngineMod.IError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-validation", JSImport.Namespace)
@js.native
object nodeDashValidationMod extends js.Object {
  @js.native
  class AbstractValidator[T] ()
    extends typingsSlinky.businessDashRulesDashEngine.businessDashRulesDashEngineMod.AbstractValidator[T]
  
  @js.native
  class CompositeValidationResult protected ()
    extends typingsSlinky.businessDashRulesDashEngine.businessDashRulesDashEngineMod.CompositeValidationResult {
    def this(Name: String) = this()
  }
  
  @js.native
  class Error ()
    extends typingsSlinky.businessDashRulesDashEngine.businessDashRulesDashEngineMod.Error
  
  @js.native
  class MessageLocalization ()
    extends typingsSlinky.businessDashRulesDashEngine.businessDashRulesDashEngineMod.MessageLocalization
  
  @js.native
  class ValidationFailure protected ()
    extends typingsSlinky.businessDashRulesDashEngine.businessDashRulesDashEngineMod.ValidationFailure {
    def this(Error: IError, IsAsync: Boolean) = this()
  }
  
  @js.native
  class ValidationResult protected ()
    extends typingsSlinky.businessDashRulesDashEngine.businessDashRulesDashEngineMod.ValidationResult {
    def this(Name: String) = this()
  }
  
  @js.native
  object CompareOperator extends js.Object {
    /* 2 */ val Equal: typingsSlinky.businessDashRulesDashEngine.businessDashRulesDashEngineMod.CompareOperator.Equal with Double = js.native
    /* 5 */ val GreaterThan: typingsSlinky.businessDashRulesDashEngine.businessDashRulesDashEngineMod.CompareOperator.GreaterThan with Double = js.native
    /* 4 */ val GreaterThanEqual: typingsSlinky.businessDashRulesDashEngine.businessDashRulesDashEngineMod.CompareOperator.GreaterThanEqual with Double = js.native
    /* 0 */ val LessThan: typingsSlinky.businessDashRulesDashEngine.businessDashRulesDashEngineMod.CompareOperator.LessThan with Double = js.native
    /* 1 */ val LessThanEqual: typingsSlinky.businessDashRulesDashEngine.businessDashRulesDashEngineMod.CompareOperator.LessThanEqual with Double = js.native
    /* 3 */ val NotEqual: typingsSlinky.businessDashRulesDashEngine.businessDashRulesDashEngineMod.CompareOperator.NotEqual with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.businessDashRulesDashEngine.businessDashRulesDashEngineMod.CompareOperator with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object MessageLocalization extends js.Object {
    var ValidationMessages: Anon_Contains = js.native
    var customMsg: String = js.native
    var defaultMessages: Anon_Contains = js.native
    def GetValidationMessage(validator: js.Any): String = js.native
  }
  
}

