package typingsSlinky.rdfLoaderCode

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.rdfLoaderCode.anon.Register
import typingsSlinky.rdfLoadersRegistry.mod.Loader
import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecmaScriptLiteralMod extends Shortcut {
  
  @JSImport("rdf-loader-code/ecmaScriptLiteral", JSImport.Namespace)
  @js.native
  val ^ : EcmaScriptLiteralLoader = js.native
  
  type EcmaScriptLiteralLoader = (Loader[String, Options]) with Register
  
  @js.native
  trait Options extends StObject {
    
    var context: js.UndefOr[js.Any] = js.native
    
    var variables: js.UndefOr[Map[String, _]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setVariables(value: Map[String, _]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    }
  }
  
  type _To = EcmaScriptLiteralLoader
  
  /* This means you don't have to write `^`, but can instead just say `ecmaScriptLiteralMod.foo` */
  override def _to: EcmaScriptLiteralLoader = ^
}
