package typingsSlinky.expo

import slinky.core.facade.ReactElement
import typingsSlinky.expo.anon.ErrorAny
import typingsSlinky.expo.anon.ErrorNull
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rootErrorBoundaryWebMod {
  
  @JSImport("expo/build/launch/RootErrorBoundary.web", JSImport.Default)
  @js.native
  class default () extends RootErrorBoundary
  /* static members */
  object default {
    
    @JSImport("expo/build/launch/RootErrorBoundary.web", "default.getDerivedStateFromError")
    @js.native
    def getDerivedStateFromError(error: js.Any): ErrorAny = js.native
  }
  
  @js.native
  trait Props extends StObject {
    
    var children: ReactElement = js.native
  }
  object Props {
    
    @scala.inline
    def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  @js.native
  trait RootErrorBoundary
    extends Component[Props, State, js.Any] {
    
    @JSName("state")
    var state_RootErrorBoundary: ErrorNull = js.native
  }
  
  @js.native
  trait State extends StObject {
    
    var error: js.Error | Null = js.native
  }
  object State {
    
    @scala.inline
    def apply(): State = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorNull: Self = StObject.set(x, "error", null)
    }
  }
}
