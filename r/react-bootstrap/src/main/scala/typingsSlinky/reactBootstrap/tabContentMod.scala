package typingsSlinky.reactBootstrap

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabContentMod {
  
  @JSImport("react-bootstrap/lib/TabContent", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[TabContentProps, js.Object, js.Any]
  
  @js.native
  trait TabContent
    extends Component[TabContentProps, js.Object, js.Any]
  
  @js.native
  trait TabContentProps extends HTMLProps[TabContent] {
    
    var animation: js.UndefOr[Boolean | ReactType[_]] = js.native
    
    var bsClass: js.UndefOr[String] = js.native
    
    var componentClass: js.UndefOr[ReactType[_]] = js.native
    
    var mountOnEnter: js.UndefOr[Boolean] = js.native
    
    var unmountOnExit: js.UndefOr[Boolean] = js.native
  }
  object TabContentProps {
    
    @scala.inline
    def apply(): TabContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabContentProps]
    }
    
    @scala.inline
    implicit class TabContentPropsMutableBuilder[Self <: TabContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: Boolean | ReactType[_]): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      @scala.inline
      def setComponentClass(value: ReactType[_]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
      
      @scala.inline
      def setMountOnEnter(value: Boolean): Self = StObject.set(x, "mountOnEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountOnEnterUndefined: Self = StObject.set(x, "mountOnEnter", js.undefined)
      
      @scala.inline
      def setUnmountOnExit(value: Boolean): Self = StObject.set(x, "unmountOnExit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnmountOnExitUndefined: Self = StObject.set(x, "unmountOnExit", js.undefined)
    }
  }
}
