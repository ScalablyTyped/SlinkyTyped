package typingsSlinky.nextReactDevOverlay

import slinky.core.ReactComponentClass
import typingsSlinky.nextReactDevOverlay.errorsMod.ReadyRuntimeError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeErrorMod {
  
  @JSImport("@next/react-dev-overlay/lib/internal/container/RuntimeError", "RuntimeError")
  @js.native
  val RuntimeError: ReactComponentClass[RuntimeErrorProps] = js.native
  
  @JSImport("@next/react-dev-overlay/lib/internal/container/RuntimeError", "styles")
  @js.native
  val styles: String = js.native
  
  @js.native
  trait RuntimeErrorProps extends StObject {
    
    var error: ReadyRuntimeError = js.native
  }
  object RuntimeErrorProps {
    
    @scala.inline
    def apply(error: ReadyRuntimeError): RuntimeErrorProps = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuntimeErrorProps]
    }
    
    @scala.inline
    implicit class RuntimeErrorPropsMutableBuilder[Self <: RuntimeErrorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: ReadyRuntimeError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
}
