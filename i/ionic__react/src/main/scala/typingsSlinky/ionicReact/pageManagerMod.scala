package typingsSlinky.ionicReact

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactRef
import typingsSlinky.ionicReact.ionLifeCycleContextMod.IonLifeCycleContextInterface
import typingsSlinky.ionicReact.routeInfoMod.RouteInfo
import typingsSlinky.ionicReact.stackContextMod.StackContextState
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ContextType
import typingsSlinky.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pageManagerMod {
  
  @JSImport("@ionic/react/dist/types/routing/PageManager", JSImport.Default)
  @js.native
  class default protected () extends PageManager {
    def this(props: PageManagerProps) = this()
  }
  
  @JSImport("@ionic/react/dist/types/routing/PageManager", "PageManager")
  @js.native
  class PageManager protected ()
    extends PureComponent[PageManagerProps, js.Object, js.Any] {
    def this(props: PageManagerProps) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MPageManager(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPageManager(): Unit = js.native
    
    @JSName("context")
    var context_PageManager: ContextType[Context[StackContextState]] = js.native
    
    var ionLifeCycleContext: ContextType[Context[IonLifeCycleContextInterface]] = js.native
    
    var ionPageElementRef: ReactRef[HTMLDivElement] = js.native
    
    def ionViewDidEnterHandler(): Unit = js.native
    
    def ionViewDidLeaveHandler(): Unit = js.native
    
    def ionViewWillEnterHandler(): Unit = js.native
    
    def ionViewWillLeaveHandler(): Unit = js.native
  }
  
  @js.native
  trait PageManagerProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var forwardedRef: js.UndefOr[ReactRef[HTMLDivElement]] = js.native
    
    var routeInfo: js.UndefOr[RouteInfo[_]] = js.native
  }
  object PageManagerProps {
    
    @scala.inline
    def apply(): PageManagerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageManagerProps]
    }
    
    @scala.inline
    implicit class PageManagerPropsMutableBuilder[Self <: PageManagerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setForwardedRef(value: ReactRef[HTMLDivElement]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForwardedRefUndefined: Self = StObject.set(x, "forwardedRef", js.undefined)
      
      @scala.inline
      def setRouteInfo(value: RouteInfo[_]): Self = StObject.set(x, "routeInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteInfoUndefined: Self = StObject.set(x, "routeInfo", js.undefined)
    }
  }
}
