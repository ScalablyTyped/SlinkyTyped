package typingsSlinky.antdMobileRn

import typingsSlinky.antdMobileRn.anon.ArrowV
import typingsSlinky.antdMobileRn.anon.Styles
import typingsSlinky.antdMobileRn.anon.TypeofItem
import typingsSlinky.antdMobileRn.listPropsTypeMod.ListPropsType
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listIndexNativeMod {
  
  @JSImport("antd-mobile-rn/lib/list/index.native", JSImport.Default)
  @js.native
  class default () extends List
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/list/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/list/index.native", "default.Item")
    @js.native
    def Item: TypeofItem = js.native
    @scala.inline
    def Item_=(x: TypeofItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/list/index.native", "default.defaultProps")
    @js.native
    def defaultProps: Styles = js.native
    @scala.inline
    def defaultProps_=(x: Styles): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait List
    extends Component[ListProps, js.Any, js.Any]
  
  @js.native
  trait ListProps extends ListPropsType {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var styles: js.UndefOr[ArrowV] = js.native
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
      
      @scala.inline
      def setStyles(value: ArrowV): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
