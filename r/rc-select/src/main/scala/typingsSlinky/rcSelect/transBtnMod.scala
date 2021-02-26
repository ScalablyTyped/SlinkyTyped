package typingsSlinky.rcSelect

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLSpanElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcSelect.interfaceMod.RenderNode
import typingsSlinky.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transBtnMod extends Shortcut {
  
  @JSImport("rc-select/lib/TransBtn", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TransBtnProps] = js.native
  
  @js.native
  trait TransBtnProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: String = js.native
    
    var customizeIcon: RenderNode = js.native
    
    var customizeIconProps: js.UndefOr[js.Any] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.native
  }
  object TransBtnProps {
    
    @scala.inline
    def apply(className: String): TransBtnProps = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransBtnProps]
    }
    
    @scala.inline
    implicit class TransBtnPropsMutableBuilder[Self <: TransBtnProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomizeIcon(value: RenderNode): Self = StObject.set(x, "customizeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomizeIconFunction1(value: /* props */ js.Any => ReactElement): Self = StObject.set(x, "customizeIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomizeIconProps(value: js.Any): Self = StObject.set(x, "customizeIconProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomizeIconPropsUndefined: Self = StObject.set(x, "customizeIconProps", js.undefined)
      
      @scala.inline
      def setCustomizeIconReactElement(value: ReactElement): Self = StObject.set(x, "customizeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomizeIconUndefined: Self = StObject.set(x, "customizeIcon", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLSpanElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: SyntheticMouseEvent[HTMLSpanElement] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TransBtnProps]
  
  /* This means you don't have to write `default`, but can instead just say `transBtnMod.foo` */
  override def _to: ReactComponentClass[TransBtnProps] = default
}
