package typingsSlinky.reactBootstrap

import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.reactBootstrap.mod.SelectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuItemMod {
  
  @JSImport("react-bootstrap/lib/MenuItem", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[MenuItemProps, js.Object, js.Any]
  
  @js.native
  trait MenuItem
    extends Component[MenuItemProps, js.Object, js.Any]
  
  @js.native
  trait MenuItemProps extends HTMLProps[MenuItem] {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var bsClass: js.UndefOr[String] = js.native
    
    var divider: js.UndefOr[Boolean] = js.native
    
    var eventKey: js.UndefOr[js.Any] = js.native
    
    var header: js.UndefOr[Boolean] = js.native
    
    @JSName("onClick")
    var onClick_MenuItemProps: js.UndefOr[MouseEventHandler[js.Object]] = js.native
    
    @JSName("onSelect")
    var onSelect_MenuItemProps: js.UndefOr[SelectCallback] = js.native
  }
  object MenuItemProps {
    
    @scala.inline
    def apply(): MenuItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItemProps]
    }
    
    @scala.inline
    implicit class MenuItemPropsMutableBuilder[Self <: MenuItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      @scala.inline
      def setDivider(value: Boolean): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
      
      @scala.inline
      def setEventKey(value: js.Any): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      @scala.inline
      def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[js.Object] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnSelect(value: SelectCallback): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    }
  }
}
