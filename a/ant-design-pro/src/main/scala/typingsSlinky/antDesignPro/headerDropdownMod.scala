package typingsSlinky.antDesignPro

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.antDesignPro.antDesignProStrings.bottomCenter
import typingsSlinky.antDesignPro.antDesignProStrings.bottomLeft
import typingsSlinky.antDesignPro.antDesignProStrings.bottomRight
import typingsSlinky.antDesignPro.antDesignProStrings.topCenter
import typingsSlinky.antDesignPro.antDesignProStrings.topLeft
import typingsSlinky.antDesignPro.antDesignProStrings.topRight
import typingsSlinky.antd.dropdownDropdownMod.DropDownProps
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerDropdownMod {
  
  @JSImport("ant-design-pro/lib/HeaderDropdown", JSImport.Default)
  @js.native
  class default ()
    extends Component[HeaderDropdownProps, js.Any, js.Any]
  
  type HeaderDropdown = ReactComponentClass[HeaderDropdownProps]
  
  @js.native
  trait HeaderDropdownProps extends DropDownProps {
    
    @JSName("overlay")
    var overlay_HeaderDropdownProps: ReactElement | OverlayFunc = js.native
    
    @JSName("placement")
    var placement_HeaderDropdownProps: js.UndefOr[bottomLeft | bottomRight | topLeft | topCenter | topRight | bottomCenter] = js.native
  }
  object HeaderDropdownProps {
    
    @scala.inline
    def apply(): HeaderDropdownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderDropdownProps]
    }
    
    @scala.inline
    implicit class HeaderDropdownPropsMutableBuilder[Self <: HeaderDropdownProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOverlay(value: ReactElement | OverlayFunc): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayFunction0(value: () => ReactElement): Self = StObject.set(x, "overlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOverlayReactElement(value: ReactElement): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      @scala.inline
      def setPlacement(value: bottomLeft | bottomRight | topLeft | topCenter | topRight | bottomCenter): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    }
  }
  
  type OverlayFunc = js.Function0[ReactElement]
}
