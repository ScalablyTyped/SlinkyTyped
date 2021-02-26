package typingsSlinky.antDesignReactNative

import typingsSlinky.antDesignReactNative.checkboxPropsTypeMod.CheckboxItemPropsType
import typingsSlinky.antDesignReactNative.checkboxStyleMod.CheckboxStyle
import typingsSlinky.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxItemMod {
  
  @JSImport("@ant-design/react-native/lib/checkbox/CheckboxItem", JSImport.Default)
  @js.native
  class default () extends CheckboxItem
  
  @js.native
  trait CheckboxItem
    extends Component[CheckboxItemProps, js.Any, js.Any] {
    
    var checkbox: typingsSlinky.antDesignReactNative.checkboxCheckboxMod.default | Null = js.native
    
    def handleClick(): Unit = js.native
  }
  
  @js.native
  trait CheckboxItemProps
    extends CheckboxItemPropsType
       with WithThemeStyles[CheckboxStyle] {
    
    var checkboxStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  }
  object CheckboxItemProps {
    
    @scala.inline
    def apply(): CheckboxItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxItemProps]
    }
    
    @scala.inline
    implicit class CheckboxItemPropsMutableBuilder[Self <: CheckboxItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckboxStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "checkboxStyle", value.asInstanceOf[js.Any])
      
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
