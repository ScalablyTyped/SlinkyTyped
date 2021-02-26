package typingsSlinky.nodePgMigrate

import typingsSlinky.nodePgMigrate.anon.ReverseCreateTriggerFn
import typingsSlinky.nodePgMigrate.anon.ReverseRenameTriggerFn
import typingsSlinky.nodePgMigrate.functionsTypesMod.FunctionOptions
import typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions
import typingsSlinky.nodePgMigrate.generalTypesMod.Name
import typingsSlinky.nodePgMigrate.generalTypesMod.Value
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.AFTER
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.BEFORE
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.ROW
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.STATEMENT
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.`INSTEAD OF`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggersTypesMod {
  
  type CreateTrigger = CreateTriggerFn with ReverseCreateTriggerFn
  
  type CreateTriggerFn = CreateTriggerFn1 | CreateTriggerFn2
  
  type CreateTriggerFn1 = js.Function3[
    /* tableName */ Name, 
    /* triggerName */ String, 
    /* triggerOptions */ TriggerOptions with DropOptions, 
    String | js.Array[String]
  ]
  
  type CreateTriggerFn2 = js.Function4[
    /* tableName */ Name, 
    /* triggerName */ String, 
    /* triggerOptions */ TriggerOptions with FunctionOptions with DropOptions, 
    /* definition */ Value, 
    String | js.Array[String]
  ]
  
  type DropTrigger = js.Function3[
    /* tableName */ Name, 
    /* triggerName */ String, 
    /* dropOptions */ js.UndefOr[DropOptions], 
    String | js.Array[String]
  ]
  
  type RenameTrigger = RenameTriggerFn with ReverseRenameTriggerFn
  
  type RenameTriggerFn = js.Function3[
    /* tableName */ Name, 
    /* oldTriggerName */ String, 
    /* newTriggerName */ String, 
    String | js.Array[String]
  ]
  
  @js.native
  trait TriggerOptions extends StObject {
    
    var condition: js.UndefOr[String] = js.native
    
    var constraint: js.UndefOr[Boolean] = js.native
    
    var deferrable: js.UndefOr[Boolean] = js.native
    
    var deferred: js.UndefOr[Boolean] = js.native
    
    var function: js.UndefOr[Name] = js.native
    
    var functionParams: js.UndefOr[js.Array[Value]] = js.native
    
    var level: js.UndefOr[STATEMENT | ROW] = js.native
    
    var operation: String | js.Array[String] = js.native
    
    var when: js.UndefOr[BEFORE | AFTER | (`INSTEAD OF`)] = js.native
  }
  object TriggerOptions {
    
    @scala.inline
    def apply(operation: String | js.Array[String]): TriggerOptions = {
      val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
      __obj.asInstanceOf[TriggerOptions]
    }
    
    @scala.inline
    implicit class TriggerOptionsMutableBuilder[Self <: TriggerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      @scala.inline
      def setConstraint(value: Boolean): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstraintUndefined: Self = StObject.set(x, "constraint", js.undefined)
      
      @scala.inline
      def setDeferrable(value: Boolean): Self = StObject.set(x, "deferrable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeferrableUndefined: Self = StObject.set(x, "deferrable", js.undefined)
      
      @scala.inline
      def setDeferred(value: Boolean): Self = StObject.set(x, "deferred", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeferredUndefined: Self = StObject.set(x, "deferred", js.undefined)
      
      @scala.inline
      def setFunction(value: Name): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionParams(value: js.Array[Value]): Self = StObject.set(x, "functionParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionParamsUndefined: Self = StObject.set(x, "functionParams", js.undefined)
      
      @scala.inline
      def setFunctionParamsVarargs(value: Value*): Self = StObject.set(x, "functionParams", js.Array(value :_*))
      
      @scala.inline
      def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
      
      @scala.inline
      def setLevel(value: STATEMENT | ROW): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setOperation(value: String | js.Array[String]): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationVarargs(value: String*): Self = StObject.set(x, "operation", js.Array(value :_*))
      
      @scala.inline
      def setWhen(value: BEFORE | AFTER | (`INSTEAD OF`)): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
    }
  }
}
