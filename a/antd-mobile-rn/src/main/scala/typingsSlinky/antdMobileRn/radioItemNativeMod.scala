package typingsSlinky.antdMobileRn

import typingsSlinky.antdMobileRn.anon.Styles
import typingsSlinky.antdMobileRn.radioPropsTypeMod.RadioItemPropsType
import typingsSlinky.antdMobileRn.radioStyleIndexNativeMod.IRadioStyle
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioItemNativeMod {
  
  @JSImport("antd-mobile-rn/lib/radio/RadioItem.native", JSImport.Default)
  @js.native
  class default () extends RadioItem
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/radio/RadioItem.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/radio/RadioItem.native", "default.defaultProps")
    @js.native
    def defaultProps: Styles = js.native
    @scala.inline
    def defaultProps_=(x: Styles): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait RadioItem
    extends Component[RadioItemNativeProps, js.Any, js.Any] {
    
    def handleClick(): Unit = js.native
  }
  
  @js.native
  trait RadioItemNativeProps extends RadioItemPropsType {
    
    var radioStyle: js.UndefOr[StyleProp[ImageStyle]] = js.native
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var styles: js.UndefOr[IRadioStyle] = js.native
  }
  object RadioItemNativeProps {
    
    @scala.inline
    def apply(): RadioItemNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioItemNativeProps]
    }
    
    @scala.inline
    implicit class RadioItemNativePropsMutableBuilder[Self <: RadioItemNativeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRadioStyle(value: StyleProp[ImageStyle]): Self = StObject.set(x, "radioStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioStyleNull: Self = StObject.set(x, "radioStyle", null)
      
      @scala.inline
      def setRadioStyleUndefined: Self = StObject.set(x, "radioStyle", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(value: IRadioStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
