package typingsSlinky.mobxReactLite

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observerComponentMod {
  
  object Observer {
    
    @JSImport("mobx-react-lite/dist/ObserverComponent", "Observer")
    @js.native
    def apply(hasChildrenRender: IObserverProps): ReactElement | Null = js.native
    @JSImport("mobx-react-lite/dist/ObserverComponent", "Observer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mobx-react-lite/dist/ObserverComponent", "Observer.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    object propTypes {
      
      @JSImport("mobx-react-lite/dist/ObserverComponent", "Observer.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("mobx-react-lite/dist/ObserverComponent", "Observer.propTypes.children")
      @js.native
      def children: js.Function5[
            /* props */ StringDictionary[js.Any], 
            /* key */ String, 
            /* componentName */ String, 
            /* location */ js.Any, 
            /* propFullName */ String, 
            js.Error | Null
          ] = js.native
      @scala.inline
      def children_=(
        x: js.Function5[
              /* props */ StringDictionary[js.Any], 
              /* key */ String, 
              /* componentName */ String, 
              /* location */ js.Any, 
              /* propFullName */ String, 
              js.Error | Null
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("mobx-react-lite/dist/ObserverComponent", "Observer.propTypes.render")
      @js.native
      def render: js.Function5[
            /* props */ StringDictionary[js.Any], 
            /* key */ String, 
            /* componentName */ String, 
            /* location */ js.Any, 
            /* propFullName */ String, 
            js.Error | Null
          ] = js.native
      @scala.inline
      def render_=(
        x: js.Function5[
              /* props */ StringDictionary[js.Any], 
              /* key */ String, 
              /* componentName */ String, 
              /* location */ js.Any, 
              /* propFullName */ String, 
              js.Error | Null
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("render")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IObserverProps extends StObject {
    
    var children: js.UndefOr[js.Function0[ReactElement | Null]] = js.native
    
    var render: js.UndefOr[js.Function0[ReactElement | Null]] = js.native
  }
  object IObserverProps {
    
    @scala.inline
    def apply(): IObserverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IObserverProps]
    }
    
    @scala.inline
    implicit class IObserverPropsMutableBuilder[Self <: IObserverProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: () => ReactElement | Null): Self = StObject.set(x, "children", js.Any.fromFunction0(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setRender(value: () => ReactElement | Null): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
}
