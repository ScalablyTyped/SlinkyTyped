package typingsSlinky.antDesignReactNative

import typingsSlinky.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsSlinky.antDesignReactNative.radioPropsTypeMod.RadioItemPropsType
import typingsSlinky.antDesignReactNative.radioStyleMod.RadioStyle
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioItemMod {
  
  @JSImport("@ant-design/react-native/lib/radio/RadioItem", JSImport.Default)
  @js.native
  class default () extends RadioItem
  
  @js.native
  trait RadioItem
    extends Component[RadioItemNativeProps, js.Any, js.Any] {
    
    def handleClick(): Unit = js.native
    
    var radio: typingsSlinky.antDesignReactNative.radioRadioMod.default | Null = js.native
  }
  
  @js.native
  trait RadioItemNativeProps
    extends RadioItemPropsType
       with WithThemeStyles[RadioStyle] {
    
    var radioStyle: js.UndefOr[StyleProp[ImageStyle]] = js.native
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
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
    }
  }
}
