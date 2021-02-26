package typingsSlinky.antdMobileRn

import typingsSlinky.antdMobileRn.anon.Size
import typingsSlinky.antdMobileRn.antdMobileRnStrings.lg
import typingsSlinky.antdMobileRn.antdMobileRnStrings.md
import typingsSlinky.antdMobileRn.antdMobileRnStrings.sm
import typingsSlinky.antdMobileRn.antdMobileRnStrings.xs
import typingsSlinky.antdMobileRn.antdMobileRnStrings.xxs
import typingsSlinky.antdMobileRn.iconPropsTypeMod.IconPropsType
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconIndexNativeMod {
  
  @JSImport("antd-mobile-rn/lib/icon/index.native", JSImport.Default)
  @js.native
  class default () extends Icon
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/icon/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/icon/index.native", "default.defaultProps")
    @js.native
    def defaultProps: Size = js.native
    @scala.inline
    def defaultProps_=(x: Size): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Icon
    extends Component[IconProps, js.Any, js.Any]
  
  @js.native
  trait IconProps extends IconPropsType {
    
    var size: js.UndefOr[xxs | xs | sm | md | lg | Double] = js.native
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  }
  object IconProps {
    
    @scala.inline
    def apply(`type`: String): IconProps = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconProps]
    }
    
    @scala.inline
    implicit class IconPropsMutableBuilder[Self <: IconProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: xxs | xs | sm | md | lg | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
