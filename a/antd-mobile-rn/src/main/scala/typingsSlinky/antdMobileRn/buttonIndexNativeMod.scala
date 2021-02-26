package typingsSlinky.antdMobileRn

import typingsSlinky.antdMobileRn.anon.Container
import typingsSlinky.antdMobileRn.anon.Disabled
import typingsSlinky.antdMobileRn.antdMobileRnStrings.ghost
import typingsSlinky.antdMobileRn.antdMobileRnStrings.large
import typingsSlinky.antdMobileRn.antdMobileRnStrings.primary
import typingsSlinky.antdMobileRn.antdMobileRnStrings.small
import typingsSlinky.antdMobileRn.antdMobileRnStrings.warning
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TouchableHighlightProps
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonIndexNativeMod {
  
  @JSImport("antd-mobile-rn/lib/button/index.native", JSImport.Default)
  @js.native
  class default protected () extends Button {
    def this(props: ButtonProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/button/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/button/index.native", "default.defaultProps")
    @js.native
    def defaultProps: Disabled = js.native
    @scala.inline
    def defaultProps_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Button
    extends Component[ButtonProps, js.Any, js.Any] {
    
    def onHideUnderlay(arg: js.Any*): Unit = js.native
    
    def onPressIn(arg: js.Any*): Unit = js.native
    
    def onPressOut(arg: js.Any*): Unit = js.native
    
    def onShowUnderlay(arg: js.Any*): Unit = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.antdMobileRn.buttonPropsTypeMod.ButtonPropsType because var conflicts: disabled. Inlined `type`, size, loading */ @js.native
  trait ButtonProps extends TouchableHighlightProps {
    
    var activeStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var loading: js.UndefOr[Boolean] = js.native
    
    var onClick: js.UndefOr[js.Function1[/* _ */ js.UndefOr[js.Any], Unit]] = js.native
    
    var size: js.UndefOr[large | small] = js.native
    
    var styles: js.UndefOr[Container] = js.native
    
    var `type`: js.UndefOr[primary | warning | ghost] = js.native
  }
  object ButtonProps {
    
    @scala.inline
    def apply(): ButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonProps]
    }
    
    @scala.inline
    implicit class ButtonPropsMutableBuilder[Self <: ButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveStyleNull: Self = StObject.set(x, "activeStyle", null)
      
      @scala.inline
      def setActiveStyleUndefined: Self = StObject.set(x, "activeStyle", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* _ */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setSize(value: large | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyles(value: Container): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setType(value: primary | warning | ghost): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
