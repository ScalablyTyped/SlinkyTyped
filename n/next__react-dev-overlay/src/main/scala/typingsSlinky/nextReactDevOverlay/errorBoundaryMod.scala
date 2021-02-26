package typingsSlinky.nextReactDevOverlay

import typingsSlinky.nextReactDevOverlay.anon.ComponentStack
import typingsSlinky.nextReactDevOverlay.anon.Error
import typingsSlinky.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorBoundaryMod {
  
  @JSImport("@next/react-dev-overlay/lib/internal/ErrorBoundary", "ErrorBoundary")
  @js.native
  class ErrorBoundary protected ()
    extends PureComponent[ErrorBoundaryProps, ErrorBoundaryState, js.Any] {
    def this(props: ErrorBoundaryProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ErrorBoundaryProps, context: js.Any) = this()
    
    @JSName("componentDidCatch")
    def componentDidCatch_MErrorBoundary(error: js.Error): Unit = js.native
    @JSName("componentDidCatch")
    def componentDidCatch_MErrorBoundary(error: js.Error, errorInfo: ComponentStack): Unit = js.native
    
    @JSName("state")
    var state_ErrorBoundary: Error = js.native
  }
  
  @js.native
  trait ErrorBoundaryProps extends StObject {
    
    def onError(error: js.Error): Unit = js.native
    def onError(error: js.Error, componentStack: String): Unit = js.native
  }
  
  @js.native
  trait ErrorBoundaryState extends StObject {
    
    var error: js.Error | Null = js.native
  }
  object ErrorBoundaryState {
    
    @scala.inline
    def apply(): ErrorBoundaryState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorBoundaryState]
    }
    
    @scala.inline
    implicit class ErrorBoundaryStateMutableBuilder[Self <: ErrorBoundaryState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorNull: Self = StObject.set(x, "error", null)
    }
  }
}
