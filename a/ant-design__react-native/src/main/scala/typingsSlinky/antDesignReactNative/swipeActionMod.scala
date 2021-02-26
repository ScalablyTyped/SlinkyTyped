package typingsSlinky.antDesignReactNative

import typingsSlinky.antDesignReactNative.anon.BackgroundColor
import typingsSlinky.antDesignReactNative.anon.Color
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNativeSwipeout.mod.SwipeoutButtonProperties
import typingsSlinky.reactNativeSwipeout.mod.SwipeoutProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swipeActionMod {
  
  @JSImport("@ant-design/react-native/lib/swipe-action", JSImport.Default)
  @js.native
  class default () extends SwipeAction
  object default {
    
    @JSImport("@ant-design/react-native/lib/swipe-action", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ant-design/react-native/lib/swipe-action", "default.defaultProps")
    @js.native
    def defaultProps: SwipeActionProps = js.native
    @scala.inline
    def defaultProps_=(x: SwipeActionProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait SwipeAction
    extends Component[SwipeActionProps, js.Object, js.Any] {
    
    def renderCustomButton(button: SwipeoutButtonProps): Color = js.native
  }
  
  @js.native
  trait SwipeActionProps extends SwipeoutProperties {
    
    @JSName("left")
    var left_SwipeActionProps: js.UndefOr[js.Array[SwipeoutButtonProps]] = js.native
    
    @JSName("right")
    var right_SwipeActionProps: js.UndefOr[js.Array[SwipeoutButtonProps]] = js.native
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
      def setLeft(value: js.Array[SwipeoutButtonProps]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setLeftVarargs(value: SwipeoutButtonProps*): Self = StObject.set(x, "left", js.Array(value :_*))
      
      @scala.inline
      def setRight(value: js.Array[SwipeoutButtonProps]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setRightVarargs(value: SwipeoutButtonProps*): Self = StObject.set(x, "right", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SwipeoutButtonProps extends SwipeoutButtonProperties {
    
    var style: js.UndefOr[StyleProp[TextStyle] with BackgroundColor] = js.native
  }
  object SwipeoutButtonProps {
    
    @scala.inline
    def apply(): SwipeoutButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwipeoutButtonProps]
    }
    
    @scala.inline
    implicit class SwipeoutButtonPropsMutableBuilder[Self <: SwipeoutButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: StyleProp[TextStyle] with BackgroundColor): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
