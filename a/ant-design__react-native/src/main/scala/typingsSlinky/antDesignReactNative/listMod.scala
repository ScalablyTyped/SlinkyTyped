package typingsSlinky.antDesignReactNative

import typingsSlinky.antDesignReactNative.anon.TypeofItem
import typingsSlinky.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsSlinky.antDesignReactNative.listPropsTypeMod.ListPropsType
import typingsSlinky.antDesignReactNative.listStyleMod.ListStyle
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  @JSImport("@ant-design/react-native/lib/list", JSImport.Default)
  @js.native
  class default () extends List
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/list", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/list", "default.Item")
    @js.native
    def Item: TypeofItem = js.native
    @scala.inline
    def Item_=(x: TypeofItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait List
    extends Component[ListProps, js.Any, js.Any]
  
  @js.native
  trait ListProps
    extends ListPropsType
       with WithThemeStyles[ListStyle] {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  }
  object ListProps {
    
    @scala.inline
    def apply(): ListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListProps]
    }
    
    @scala.inline
    implicit class ListPropsMutableBuilder[Self <: ListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
