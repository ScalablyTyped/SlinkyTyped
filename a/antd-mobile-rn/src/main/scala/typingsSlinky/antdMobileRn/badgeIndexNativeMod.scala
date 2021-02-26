package typingsSlinky.antdMobileRn

import typingsSlinky.antdMobileRn.anon.Corner
import typingsSlinky.antdMobileRn.badgePropsTypeMod.BadgePropsTypes
import typingsSlinky.antdMobileRn.badgeStyleIndexNativeMod.IBadgeStyle
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeIndexNativeMod {
  
  @JSImport("antd-mobile-rn/lib/badge/index.native", JSImport.Default)
  @js.native
  class default () extends Badge
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/badge/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/badge/index.native", "default.defaultProps")
    @js.native
    def defaultProps: Corner = js.native
    @scala.inline
    def defaultProps_=(x: Corner): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Badge
    extends Component[BadgeNativeProps, js.Any, js.Any]
  
  @js.native
  trait BadgeNativeProps extends BadgePropsTypes {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var styles: js.UndefOr[IBadgeStyle] = js.native
  }
  object BadgeNativeProps {
    
    @scala.inline
    def apply(): BadgeNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BadgeNativeProps]
    }
    
    @scala.inline
    implicit class BadgeNativePropsMutableBuilder[Self <: BadgeNativeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(value: IBadgeStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
