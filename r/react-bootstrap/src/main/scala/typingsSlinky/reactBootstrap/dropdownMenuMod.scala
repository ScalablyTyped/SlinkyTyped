package typingsSlinky.reactBootstrap

import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.reactBootstrap.mod.SelectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownMenuMod {
  
  @JSImport("react-bootstrap/lib/DropdownMenu", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[DropdownMenuProps, js.Object, js.Any]
  
  @js.native
  trait DropdownMenu
    extends Component[DropdownMenuProps, js.Object, js.Any]
  
  @js.native
  trait DropdownMenuProps extends HTMLProps[DropdownMenu] {
    
    var labelledBy: js.UndefOr[String | Double] = js.native
    
    var onClose: js.UndefOr[js.Function] = js.native
    
    @JSName("onSelect")
    var onSelect_DropdownMenuProps: js.UndefOr[SelectCallback] = js.native
    
    var pullRight: js.UndefOr[Boolean] = js.native
  }
  object DropdownMenuProps {
    
    @scala.inline
    def apply(): DropdownMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownMenuProps]
    }
    
    @scala.inline
    implicit class DropdownMenuPropsMutableBuilder[Self <: DropdownMenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabelledBy(value: String | Double): Self = StObject.set(x, "labelledBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelledByUndefined: Self = StObject.set(x, "labelledBy", js.undefined)
      
      @scala.inline
      def setOnClose(value: js.Function): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnSelect(value: SelectCallback): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setPullRight(value: Boolean): Self = StObject.set(x, "pullRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullRightUndefined: Self = StObject.set(x, "pullRight", js.undefined)
    }
  }
}
