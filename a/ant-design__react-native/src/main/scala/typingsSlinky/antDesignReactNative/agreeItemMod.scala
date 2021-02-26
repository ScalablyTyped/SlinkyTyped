package typingsSlinky.antDesignReactNative

import typingsSlinky.antDesignReactNative.checkboxPropsTypeMod.CheckboxPropsType
import typingsSlinky.antDesignReactNative.checkboxStyleMod.CheckboxStyle
import typingsSlinky.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object agreeItemMod {
  
  @JSImport("@ant-design/react-native/lib/checkbox/AgreeItem", JSImport.Default)
  @js.native
  class default () extends AgreeItem
  
  @js.native
  trait AgreeItem
    extends Component[AgreeItemProps, js.Any, js.Any] {
    
    var checkbox: typingsSlinky.antDesignReactNative.checkboxCheckboxMod.default | Null = js.native
    
    def handleClick(): Unit = js.native
  }
  
  @js.native
  trait AgreeItemProps
    extends CheckboxPropsType
       with WithThemeStyles[CheckboxStyle] {
    
    var checkboxStyle: js.UndefOr[StyleProp[ImageStyle]] = js.native
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  }
  object AgreeItemProps {
    
    @scala.inline
    def apply(): AgreeItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AgreeItemProps]
    }
    
    @scala.inline
    implicit class AgreeItemPropsMutableBuilder[Self <: AgreeItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckboxStyle(value: StyleProp[ImageStyle]): Self = StObject.set(x, "checkboxStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckboxStyleNull: Self = StObject.set(x, "checkboxStyle", null)
      
      @scala.inline
      def setCheckboxStyleUndefined: Self = StObject.set(x, "checkboxStyle", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
