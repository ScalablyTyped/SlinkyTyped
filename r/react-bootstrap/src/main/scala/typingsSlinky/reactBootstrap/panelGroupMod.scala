package typingsSlinky.reactBootstrap

import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.reactBootstrap.mod.SelectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelGroupMod {
  
  @JSImport("react-bootstrap/lib/PanelGroup", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[PanelGroupProps, js.Object, js.Any]
  
  @js.native
  trait PanelGroup
    extends Component[PanelGroupProps, js.Object, js.Any]
  
  @js.native
  trait PanelGroupProps extends HTMLProps[PanelGroup] {
    
    var accordion: js.UndefOr[Boolean] = js.native
    
    var activeKey: js.UndefOr[js.Any] = js.native
    
    var defaultActiveKey: js.UndefOr[js.Any] = js.native
    
    var generateChildId: js.UndefOr[js.Function] = js.native
    
    @JSName("onSelect")
    var onSelect_PanelGroupProps: js.UndefOr[SelectCallback] = js.native
  }
  object PanelGroupProps {
    
    @scala.inline
    def apply(): PanelGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelGroupProps]
    }
    
    @scala.inline
    implicit class PanelGroupPropsMutableBuilder[Self <: PanelGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccordion(value: Boolean): Self = StObject.set(x, "accordion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccordionUndefined: Self = StObject.set(x, "accordion", js.undefined)
      
      @scala.inline
      def setActiveKey(value: js.Any): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
      
      @scala.inline
      def setDefaultActiveKey(value: js.Any): Self = StObject.set(x, "defaultActiveKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultActiveKeyUndefined: Self = StObject.set(x, "defaultActiveKey", js.undefined)
      
      @scala.inline
      def setGenerateChildId(value: js.Function): Self = StObject.set(x, "generateChildId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerateChildIdUndefined: Self = StObject.set(x, "generateChildId", js.undefined)
      
      @scala.inline
      def setOnSelect(value: SelectCallback): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    }
  }
}
