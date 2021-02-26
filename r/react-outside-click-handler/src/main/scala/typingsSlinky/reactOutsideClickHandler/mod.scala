package typingsSlinky.reactOutsideClickHandler

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.reactOutsideClickHandler.reactOutsideClickHandlerStrings.`inline-block`
import typingsSlinky.reactOutsideClickHandler.reactOutsideClickHandlerStrings.`inline`
import typingsSlinky.reactOutsideClickHandler.reactOutsideClickHandlerStrings.block
import typingsSlinky.reactOutsideClickHandler.reactOutsideClickHandlerStrings.contents
import typingsSlinky.reactOutsideClickHandler.reactOutsideClickHandlerStrings.flex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-outside-click-handler", JSImport.Default)
  @js.native
  class default ()
    extends Component[Props, js.Object, js.Any]
  /* static members */
  object default {
    
    @JSImport("react-outside-click-handler", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-outside-click-handler", "default.defaultProps")
    @js.native
    def defaultProps: DefaultProps = js.native
    @scala.inline
    def defaultProps_=(x: DefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait DefaultProps extends StObject {
    
    var disabled: Boolean = js.native
    
    var display: block | flex | `inline` | `inline-block` | contents = js.native
    
    var useCapture: Boolean = js.native
  }
  object DefaultProps {
    
    @scala.inline
    def apply(
      disabled: Boolean,
      display: block | flex | `inline` | `inline-block` | contents,
      useCapture: Boolean
    ): DefaultProps = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], useCapture = useCapture.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultProps]
    }
    
    @scala.inline
    implicit class DefaultPropsMutableBuilder[Self <: DefaultProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay(value: block | flex | `inline` | `inline-block` | contents): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCapture(value: Boolean): Self = StObject.set(x, "useCapture", value.asInstanceOf[js.Any])
    }
  }
  
  type OutsideClickHandler = ReactComponentClass[Props]
  
  /* Inlined parent std.Partial<react-outside-click-handler.react-outside-click-handler.DefaultProps> */
  @js.native
  trait Props extends StObject {
    
    var children: ReactElement = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var display: js.UndefOr[block | flex | `inline` | `inline-block` | contents] = js.native
    
    def onOutsideClick(e: SyntheticMouseEvent[HTMLElement]): Unit = js.native
    
    var useCapture: js.UndefOr[Boolean] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(onOutsideClick: SyntheticMouseEvent[HTMLElement] => Unit): Props = {
      val __obj = js.Dynamic.literal(onOutsideClick = js.Any.fromFunction1(onOutsideClick))
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDisplay(value: block | flex | `inline` | `inline-block` | contents): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setOnOutsideClick(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onOutsideClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUseCapture(value: Boolean): Self = StObject.set(x, "useCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCaptureUndefined: Self = StObject.set(x, "useCapture", js.undefined)
    }
  }
}
