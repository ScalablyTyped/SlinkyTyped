package typingsSlinky.reactBootstrap

import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelBodyMod {
  
  @JSImport("react-bootstrap/lib/PanelBody", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[PanelBodyProps, js.Object, js.Any]
  
  @js.native
  trait PanelBody
    extends Component[PanelBodyProps, js.Object, js.Any]
  
  @js.native
  trait PanelBodyProps extends HTMLProps[PanelBody] {
    
    var bsClass: js.UndefOr[String] = js.native
    
    var collapsible: js.UndefOr[Boolean] = js.native
  }
  object PanelBodyProps {
    
    @scala.inline
    def apply(): PanelBodyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelBodyProps]
    }
    
    @scala.inline
    implicit class PanelBodyPropsMutableBuilder[Self <: PanelBodyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      @scala.inline
      def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
    }
  }
}
