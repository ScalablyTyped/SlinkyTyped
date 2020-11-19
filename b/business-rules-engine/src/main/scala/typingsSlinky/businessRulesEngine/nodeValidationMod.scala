package typingsSlinky.businessRulesEngine

import typingsSlinky.businessRulesEngine.anon.Contains
import typingsSlinky.businessRulesEngine.mod.IError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-validation", JSImport.Namespace)
@js.native
object nodeValidationMod extends js.Object {
  
  @js.native
  class AbstractValidator[T] ()
    extends typingsSlinky.businessRulesEngine.mod.AbstractValidator[T]
  
  @js.native
  object CompareOperator extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.businessRulesEngine.mod.CompareOperator with Double] = js.native
    
    /* 2 */ val Equal: typingsSlinky.businessRulesEngine.mod.CompareOperator.Equal with Double = js.native
    
    /* 5 */ val GreaterThan: typingsSlinky.businessRulesEngine.mod.CompareOperator.GreaterThan with Double = js.native
    
    /* 4 */ val GreaterThanEqual: typingsSlinky.businessRulesEngine.mod.CompareOperator.GreaterThanEqual with Double = js.native
    
    /* 0 */ val LessThan: typingsSlinky.businessRulesEngine.mod.CompareOperator.LessThan with Double = js.native
    
    /* 1 */ val LessThanEqual: typingsSlinky.businessRulesEngine.mod.CompareOperator.LessThanEqual with Double = js.native
    
    /* 3 */ val NotEqual: typingsSlinky.businessRulesEngine.mod.CompareOperator.NotEqual with Double = js.native
  }
  
  @js.native
  class CompositeValidationResult protected ()
    extends typingsSlinky.businessRulesEngine.mod.CompositeValidationResult {
    def this(Name: String) = this()
  }
  
  @js.native
  class Error ()
    extends typingsSlinky.businessRulesEngine.mod.Error
  
  @js.native
  class MessageLocalization ()
    extends typingsSlinky.businessRulesEngine.mod.MessageLocalization
  /* static members */
  @js.native
  object MessageLocalization extends js.Object {
    
    def GetValidationMessage(validator: js.Any): String = js.native
    
    var ValidationMessages: Contains = js.native
    
    var customMsg: String = js.native
    
    var defaultMessages: Contains = js.native
  }
  
  @js.native
  class ValidationFailure protected ()
    extends typingsSlinky.businessRulesEngine.mod.ValidationFailure {
    def this(Error: IError, IsAsync: Boolean) = this()
  }
  
  @js.native
  class ValidationResult protected ()
    extends typingsSlinky.businessRulesEngine.mod.ValidationResult {
    def this(Name: String) = this()
  }
}
