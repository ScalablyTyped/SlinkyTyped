package typingsSlinky.reactLifecycleComponent

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentLifecycle
import typingsSlinky.reactRedux.mod.Connect_
import typingsSlinky.reactRedux.mod.DefaultRootState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-lifecycle-component", "LifecycleComponent")
  @js.native
  class LifecycleComponent protected ()
    extends Component[Props[js.Any, js.Any], js.Any, js.Any] {
    def this(props: Props[_, _]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props[_, _], context: js.Any) = this()
  }
  
  @JSImport("react-lifecycle-component", "applyLifecycle")
  @js.native
  def applyLifecycle[P, S](component: ReactComponentClass[P]): ReactComponentClass[P with (LifecycleDispatchProps[P, S])] = js.native
  
  @JSImport("react-lifecycle-component", "connectWithLifecycle")
  @js.native
  val connectWithLifecycle: Connect_[DefaultRootState] = js.native
  
  type LifecycleDispatchProps[P, S] = ComponentLifecycle[P, S, js.Any]
  
  @js.native
  trait LifecycleStateProps[P, S] extends StObject {
    
    var component: ReactComponentClass[P] = js.native
  }
  object LifecycleStateProps {
    
    @scala.inline
    def apply[P, S](component: ReactComponentClass[P]): LifecycleStateProps[P, S] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[LifecycleStateProps[P, S]]
    }
    
    @scala.inline
    implicit class LifecycleStatePropsMutableBuilder[Self <: LifecycleStateProps[_, _], P, S] (val x: Self with (LifecycleStateProps[P, S])) extends AnyVal {
      
      @scala.inline
      def setComponent(value: ReactComponentClass[P]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Props[P, S]
    extends ComponentLifecycle[P, S, js.Any]
       with LifecycleStateProps[P, S]
  object Props {
    
    @scala.inline
    def apply[P, S](component: ReactComponentClass[P]): Props[P, S] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props[P, S]]
    }
  }
}
