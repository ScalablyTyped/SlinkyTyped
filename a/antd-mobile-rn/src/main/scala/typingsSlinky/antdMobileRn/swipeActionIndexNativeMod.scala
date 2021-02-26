package typingsSlinky.antdMobileRn

import typingsSlinky.antdMobileRn.swipeActionPropsTypeMod.SwipeActionPropsType
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swipeActionIndexNativeMod {
  
  @JSImport("antd-mobile-rn/lib/swipe-action/index.native", JSImport.Default)
  @js.native
  class default () extends SwipeAction
  
  @js.native
  trait SwipeAction
    extends Component[SwipeActionProps, js.Any, js.Any]
  
  @js.native
  trait SwipeActionProps extends SwipeActionPropsType[TextStyle] {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var styles: js.UndefOr[js.Any] = js.native
  }
  object SwipeActionProps {
    
    @scala.inline
    def apply(): SwipeActionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwipeActionProps]
    }
    
    @scala.inline
    implicit class SwipeActionPropsMutableBuilder[Self <: SwipeActionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(value: js.Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
