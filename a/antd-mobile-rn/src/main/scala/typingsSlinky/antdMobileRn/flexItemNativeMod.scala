package typingsSlinky.antdMobileRn

import typingsSlinky.antdMobileRn.anon.FlexNumber
import typingsSlinky.antdMobileRn.flexPropsTypeMod.FlexItemPropsType
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flexItemNativeMod {
  
  @JSImport("antd-mobile-rn/lib/flex/FlexItem.native", JSImport.Default)
  @js.native
  class default () extends FlexItem
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/flex/FlexItem.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/flex/FlexItem.native", "default.defaultProps")
    @js.native
    def defaultProps: FlexNumber = js.native
    @scala.inline
    def defaultProps_=(x: FlexNumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait FlexItem
    extends Component[FlexItemProps, js.Any, js.Any]
  
  @js.native
  trait FlexItemProps extends FlexItemPropsType {
    
    var flex: js.UndefOr[Double] = js.native
    
    var onLongPress: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onPress: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onPressIn: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onPressOut: js.UndefOr[js.Function0[Unit]] = js.native
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  }
  object FlexItemProps {
    
    @scala.inline
    def apply(): FlexItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexItemProps]
    }
    
    @scala.inline
    implicit class FlexItemPropsMutableBuilder[Self <: FlexItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlex(value: Double): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      @scala.inline
      def setOnLongPress(value: () => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
      
      @scala.inline
      def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPressIn(value: () => Unit): Self = StObject.set(x, "onPressIn", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
      
      @scala.inline
      def setOnPressOut(value: () => Unit): Self = StObject.set(x, "onPressOut", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
      
      @scala.inline
      def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
