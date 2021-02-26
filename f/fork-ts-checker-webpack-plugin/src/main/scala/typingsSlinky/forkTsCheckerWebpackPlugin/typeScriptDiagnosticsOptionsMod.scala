package typingsSlinky.forkTsCheckerWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeScriptDiagnosticsOptionsMod {
  
  @js.native
  trait TypeScriptDiagnosticsOptions extends StObject {
    
    var declaration: Boolean = js.native
    
    var global: Boolean = js.native
    
    var semantic: Boolean = js.native
    
    var syntactic: Boolean = js.native
  }
  object TypeScriptDiagnosticsOptions {
    
    @scala.inline
    def apply(declaration: Boolean, global: Boolean, semantic: Boolean, syntactic: Boolean): TypeScriptDiagnosticsOptions = {
      val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], semantic = semantic.asInstanceOf[js.Any], syntactic = syntactic.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeScriptDiagnosticsOptions]
    }
    
    @scala.inline
    implicit class TypeScriptDiagnosticsOptionsMutableBuilder[Self <: TypeScriptDiagnosticsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeclaration(value: Boolean): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSemantic(value: Boolean): Self = StObject.set(x, "semantic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyntactic(value: Boolean): Self = StObject.set(x, "syntactic", value.asInstanceOf[js.Any])
    }
  }
}
