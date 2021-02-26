package typingsSlinky.ionicReact

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonRouterOutletElement
import typingsSlinky.ionicReact.ionTabsContextMod.IonTabsContextState
import typingsSlinky.ionicReact.navContextMod.NavContextState
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ContextType
import typingsSlinky.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionTabsMod {
  
  @JSImport("@ionic/react/dist/types/components/navigation/IonTabs", "IonTabs")
  @js.native
  class IonTabs protected ()
    extends Component[Props, js.Object, js.Any] {
    def this(props: Props) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MIonTabs(): Unit = js.native
    
    @JSName("context")
    var context_IonTabs: ContextType[Context[NavContextState]] = js.native
    
    var ionTabContextState: IonTabsContextState = js.native
    
    var routerOutletRef: Ref[HTMLIonRouterOutletElement] = js.native
    
    var selectTabHandler: js.UndefOr[js.Function1[/* tag */ String, Boolean]] = js.native
    
    var tabBarRef: ReactRef[_] = js.native
  }
  
  type ChildFunction = js.Function1[/* ionTabContext */ IonTabsContextState, ReactElement]
  
  @js.native
  trait Props
    extends typingsSlinky.ionicCore.componentsMod.LocalJSX.IonTabs {
    
    var children: ChildFunction | ReactElement = js.native
    
    var className: js.UndefOr[String] = js.native
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
      def setChildren(value: ChildFunction | ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: /* ionTabContext */ IonTabsContextState => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  object global {
    
    object JSX {
      
      @js.native
      trait IntrinsicElements extends StObject {
        
        var `ion-tabs`: js.Any = js.native
      }
      object IntrinsicElements {
        
        @scala.inline
        def apply(`ion-tabs`: js.Any): IntrinsicElements = {
          val __obj = js.Dynamic.literal()
          __obj.updateDynamic("ion-tabs")(`ion-tabs`.asInstanceOf[js.Any])
          __obj.asInstanceOf[IntrinsicElements]
        }
        
        @scala.inline
        implicit class IntrinsicElementsMutableBuilder[Self <: IntrinsicElements] (val x: Self) extends AnyVal {
          
          @scala.inline
          def `setIon-tabs`(value: js.Any): Self = StObject.set(x, "ion-tabs", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
