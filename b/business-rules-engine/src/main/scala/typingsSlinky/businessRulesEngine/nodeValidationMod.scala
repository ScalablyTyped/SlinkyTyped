package typingsSlinky.businessRulesEngine

import typingsSlinky.businessRulesEngine.anon.Contains
import typingsSlinky.businessRulesEngine.mod.IError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeValidationMod {
  
  @JSImport("node-validation", "AbstractValidator")
  @js.native
  class AbstractValidator[T] ()
    extends typingsSlinky.businessRulesEngine.mod.AbstractValidator[T]
  
  @JSImport("node-validation", "CompareOperator")
  @js.native
  object CompareOperator extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.businessRulesEngine.mod.CompareOperator with Double] = js.native
    
    /* 2 */ val Equal: typingsSlinky.businessRulesEngine.mod.CompareOperator.Equal with Double = js.native
    
    /* 5 */ val GreaterThan: typingsSlinky.businessRulesEngine.mod.CompareOperator.GreaterThan with Double = js.native
    
    /* 4 */ val GreaterThanEqual: typingsSlinky.businessRulesEngine.mod.CompareOperator.GreaterThanEqual with Double = js.native
    
    /* 0 */ val LessThan: typingsSlinky.businessRulesEngine.mod.CompareOperator.LessThan with Double = js.native
    
    /* 1 */ val LessThanEqual: typingsSlinky.businessRulesEngine.mod.CompareOperator.LessThanEqual with Double = js.native
    
    /* 3 */ val NotEqual: typingsSlinky.businessRulesEngine.mod.CompareOperator.NotEqual with Double = js.native
  }
  
  @JSImport("node-validation", "CompositeValidationResult")
  @js.native
  class CompositeValidationResult protected ()
    extends typingsSlinky.businessRulesEngine.mod.CompositeValidationResult {
    def this(Name: String) = this()
  }
  
  @JSImport("node-validation", "Error")
  @js.native
  class Error ()
    extends typingsSlinky.businessRulesEngine.mod.Error
  
  @JSImport("node-validation", "MessageLocalization")
  @js.native
  class MessageLocalization ()
    extends typingsSlinky.businessRulesEngine.mod.MessageLocalization
  /* static members */
  object MessageLocalization {
    
    @JSImport("node-validation", "MessageLocalization")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("node-validation", "MessageLocalization.GetValidationMessage")
    @js.native
    def GetValidationMessage(validator: js.Any): String = js.native
    
    @JSImport("node-validation", "MessageLocalization.ValidationMessages")
    @js.native
    def ValidationMessages: Contains = js.native
    @scala.inline
    def ValidationMessages_=(x: Contains): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ValidationMessages")(x.asInstanceOf[js.Any])
    
    @JSImport("node-validation", "MessageLocalization.customMsg")
    @js.native
    def customMsg: String = js.native
    @scala.inline
    def customMsg_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("customMsg")(x.asInstanceOf[js.Any])
    
    @JSImport("node-validation", "MessageLocalization.defaultMessages")
    @js.native
    def defaultMessages: Contains = js.native
    @scala.inline
    def defaultMessages_=(x: Contains): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultMessages")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("node-validation", "ValidationFailure")
  @js.native
  class ValidationFailure protected ()
    extends typingsSlinky.businessRulesEngine.mod.ValidationFailure {
    def this(Error: IError, IsAsync: Boolean) = this()
  }
  
  @JSImport("node-validation", "ValidationResult")
  @js.native
  class ValidationResult protected ()
    extends typingsSlinky.businessRulesEngine.mod.ValidationResult {
    def this(Name: String) = this()
  }
}
