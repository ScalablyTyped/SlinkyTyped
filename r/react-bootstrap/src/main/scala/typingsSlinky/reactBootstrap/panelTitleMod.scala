package typingsSlinky.reactBootstrap

import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelTitleMod {
  
  @JSImport("react-bootstrap/lib/PanelTitle", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[PanelTitleProps, js.Object, js.Any]
  
  @js.native
  trait PanelTitle
    extends Component[PanelTitleProps, js.Object, js.Any]
  
  @js.native
  trait PanelTitleProps extends HTMLProps[PanelTitle] {
    
    var bsClass: js.UndefOr[String] = js.native
    
    var componentClass: js.UndefOr[String] = js.native
    
    var toggle: js.UndefOr[Boolean] = js.native
  }
  object PanelTitleProps {
    
    @scala.inline
    def apply(): PanelTitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelTitleProps]
    }
    
    @scala.inline
    implicit class PanelTitlePropsMutableBuilder[Self <: PanelTitleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      @scala.inline
      def setComponentClass(value: String): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
      
      @scala.inline
      def setToggle(value: Boolean): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    }
  }
}
