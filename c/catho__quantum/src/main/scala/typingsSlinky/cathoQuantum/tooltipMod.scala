package typingsSlinky.cathoQuantum

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.cathoQuantum.anon.BaseFontSizeColors
import typingsSlinky.cathoQuantum.cathoQuantumStrings.bottom
import typingsSlinky.cathoQuantum.cathoQuantumStrings.left
import typingsSlinky.cathoQuantum.cathoQuantumStrings.right
import typingsSlinky.cathoQuantum.cathoQuantumStrings.top
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMod {
  
  @JSImport("@catho/quantum/Tooltip", JSImport.Default)
  @js.native
  class default ()
    extends Component[TooltipProps, js.Object, js.Any]
  
  type Tooltip = ReactComponentClass[TooltipProps]
  
  @js.native
  trait TooltipProps extends StObject {
    
    var children: js.Array[ReactElement] | ReactElement = js.native
    
    var multiline: js.UndefOr[Boolean] = js.native
    
    var placement: js.UndefOr[top | right | bottom | left] = js.native
    
    var text: String = js.native
    
    var theme: js.UndefOr[BaseFontSizeColors] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
  }
  object TooltipProps {
    
    @scala.inline
    def apply(text: String): TooltipProps = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipProps]
    }
    
    @scala.inline
    implicit class TooltipPropsMutableBuilder[Self <: TooltipProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ReactElement] | ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      @scala.inline
      def setPlacement(value: top | right | bottom | left): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: BaseFontSizeColors): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
