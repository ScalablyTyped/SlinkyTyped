package typingsSlinky.antDesignReactNative

import typingsSlinky.antDesignReactNative.actionSheetStyleMod.ActionSheetStyle
import typingsSlinky.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsSlinky.react.mod.PureComponent
import typingsSlinky.reactNative.mod.ActionSheetIOSOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object androidContainerMod {
  
  @JSImport("@ant-design/react-native/lib/action-sheet/AndroidContainer", JSImport.Default)
  @js.native
  class default protected () extends ActionSheetAndroid {
    def this(props: ActionSheetNativeProps) = this()
  }
  
  @js.native
  trait ActionSheetAndroid
    extends PureComponent[ActionSheetNativeProps, js.Any, js.Any] {
    
    def close(): Unit = js.native
    
    def confirm(index: Double): Unit = js.native
  }
  
  @js.native
  trait ActionSheetNativeProps extends WithThemeStyles[ActionSheetStyle] {
    
    var callback: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
    
    var config: ActionSheetIOSOptions = js.native
    
    var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
  }
  object ActionSheetNativeProps {
    
    @scala.inline
    def apply(config: ActionSheetIOSOptions): ActionSheetNativeProps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionSheetNativeProps]
    }
    
    @scala.inline
    implicit class ActionSheetNativePropsMutableBuilder[Self <: ActionSheetNativeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: /* index */ Double => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setConfig(value: ActionSheetIOSOptions): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAnimationEnd(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
