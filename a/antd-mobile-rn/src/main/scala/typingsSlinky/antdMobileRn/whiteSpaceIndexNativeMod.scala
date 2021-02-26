package typingsSlinky.antdMobileRn

import typingsSlinky.antdMobileRn.whiteSpacePropsTypeMod.WhiteSpacePropsType
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object whiteSpaceIndexNativeMod {
  
  @JSImport("antd-mobile-rn/lib/white-space/index.native", JSImport.Default)
  @js.native
  class default () extends WhiteSpace
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("antd-mobile-rn/lib/white-space/index.native", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("antd-mobile-rn/lib/white-space/index.native", "default.defaultProps.size")
      @js.native
      def size: String = js.native
      @scala.inline
      def size_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WhiteSpace
    extends Component[WhiteSpaceProps, js.Any, js.Any]
  
  @js.native
  trait WhiteSpaceProps extends WhiteSpacePropsType {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  }
  object WhiteSpaceProps {
    
    @scala.inline
    def apply(): WhiteSpaceProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WhiteSpaceProps]
    }
    
    @scala.inline
    implicit class WhiteSpacePropsMutableBuilder[Self <: WhiteSpaceProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
