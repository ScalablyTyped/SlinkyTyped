package typingsSlinky.nodePgMigrate

import typingsSlinky.nodePgMigrate.anon.ReverseCreateFunctionFn
import typingsSlinky.nodePgMigrate.anon.ReverseRenameFunctionFn
import typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions
import typingsSlinky.nodePgMigrate.generalTypesMod.Name
import typingsSlinky.nodePgMigrate.generalTypesMod.Value
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.IMMUTABLE
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.IN
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.INOUT
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.OUT
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.RESTRICTED
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.SAFE
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.STABLE
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.UNSAFE
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.VARIADIC
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.VOLATILE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionsTypesMod {
  
  type CreateFunction = CreateFunctionFn with ReverseCreateFunctionFn
  
  type CreateFunctionFn = js.Function4[
    /* functionName */ Name, 
    /* functionParams */ js.Array[FunctionParam], 
    /* functionOptions */ FunctionOptions with DropOptions, 
    /* definition */ Value, 
    String | js.Array[String]
  ]
  
  type DropFunction = js.Function3[
    /* functionName */ Name, 
    /* functionParams */ js.Array[FunctionParam], 
    /* dropOptions */ js.UndefOr[DropOptions], 
    String | js.Array[String]
  ]
  
  @js.native
  trait FunctionOptions extends StObject {
    
    var behavior: js.UndefOr[IMMUTABLE | STABLE | VOLATILE] = js.native
    
    var language: String = js.native
    
    var onNull: js.UndefOr[Boolean] = js.native
    
    var parallel: js.UndefOr[UNSAFE | RESTRICTED | SAFE] = js.native
    
    var replace: js.UndefOr[Boolean] = js.native
    
    var returns: js.UndefOr[String] = js.native
    
    var window: js.UndefOr[Boolean] = js.native
  }
  object FunctionOptions {
    
    @scala.inline
    def apply(language: String): FunctionOptions = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionOptions]
    }
    
    @scala.inline
    implicit class FunctionOptionsMutableBuilder[Self <: FunctionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBehavior(value: IMMUTABLE | STABLE | VOLATILE): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnNull(value: Boolean): Self = StObject.set(x, "onNull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnNullUndefined: Self = StObject.set(x, "onNull", js.undefined)
      
      @scala.inline
      def setParallel(value: UNSAFE | RESTRICTED | SAFE): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
      
      @scala.inline
      def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      @scala.inline
      def setReturns(value: String): Self = StObject.set(x, "returns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnsUndefined: Self = StObject.set(x, "returns", js.undefined)
      
      @scala.inline
      def setWindow(value: Boolean): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
  
  type FunctionParam = String | FunctionParamType
  
  @js.native
  trait FunctionParamType extends StObject {
    
    var default: js.UndefOr[Value] = js.native
    
    var mode: js.UndefOr[IN | OUT | INOUT | VARIADIC] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var `type`: String = js.native
  }
  object FunctionParamType {
    
    @scala.inline
    def apply(`type`: String): FunctionParamType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionParamType]
    }
    
    @scala.inline
    implicit class FunctionParamTypeMutableBuilder[Self <: FunctionParamType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: Value): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultNull: Self = StObject.set(x, "default", null)
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDefaultVarargs(
        value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Value */ js.Object)*
      ): Self = StObject.set(x, "default", js.Array(value :_*))
      
      @scala.inline
      def setMode(value: IN | OUT | INOUT | VARIADIC): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type RenameFunction = RenameFunctionFn with ReverseRenameFunctionFn
  
  type RenameFunctionFn = js.Function3[
    /* oldFunctionName */ Name, 
    /* functionParams */ js.Array[FunctionParam], 
    /* newFunctionName */ Name, 
    String | js.Array[String]
  ]
}
