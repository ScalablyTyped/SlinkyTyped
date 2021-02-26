package typingsSlinky.rcRate

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object starMod {
  
  @JSImport("rc-rate/es/Star", JSImport.Default)
  @js.native
  class default () extends Star
  
  @js.native
  trait Star
    extends Component[StarProps, js.Object, js.Any] {
    
    def getClassName(): String = js.native
    
    def onClick(e: js.Any): Unit = js.native
    
    var onHover: MouseEventHandler[HTMLDivElement] = js.native
    
    var onKeyDown: KeyboardEventHandler[HTMLDivElement] = js.native
  }
  
  @js.native
  trait StarProps extends StObject {
    
    var allowHalf: js.UndefOr[Boolean] = js.native
    
    var character: js.UndefOr[ReactElement] = js.native
    
    var characterRender: js.UndefOr[js.Function2[/* origin */ ReactElement, /* props */ this.type, ReactElement]] = js.native
    
    var count: js.UndefOr[Double] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var focused: js.UndefOr[Boolean] = js.native
    
    var index: js.UndefOr[Double] = js.native
    
    var onClick: js.UndefOr[
        js.Function2[
          /* e */ SyntheticMouseEvent[HTMLDivElement] | SyntheticKeyboardEvent[HTMLDivElement], 
          /* index */ Double, 
          Unit
        ]
      ] = js.native
    
    var onHover: js.UndefOr[
        js.Function2[/* e */ SyntheticMouseEvent[HTMLDivElement], /* index */ Double, Unit]
      ] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[Double] = js.native
  }
  object StarProps {
    
    @scala.inline
    def apply(): StarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StarProps]
    }
    
    @scala.inline
    implicit class StarPropsMutableBuilder[Self <: StarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowHalf(value: Boolean): Self = StObject.set(x, "allowHalf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowHalfUndefined: Self = StObject.set(x, "allowHalf", js.undefined)
      
      @scala.inline
      def setCharacter(value: ReactElement): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacterReactElement(value: ReactElement): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacterRender(value: (/* origin */ ReactElement, StarProps) => ReactElement): Self = StObject.set(x, "characterRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCharacterRenderUndefined: Self = StObject.set(x, "characterRender", js.undefined)
      
      @scala.inline
      def setCharacterUndefined: Self = StObject.set(x, "character", js.undefined)
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setOnClick(
        value: (/* e */ SyntheticMouseEvent[HTMLDivElement] | SyntheticKeyboardEvent[HTMLDivElement], /* index */ Double) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnHover(value: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* index */ Double) => Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
