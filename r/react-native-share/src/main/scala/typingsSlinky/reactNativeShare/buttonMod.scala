package typingsSlinky.reactNativeShare

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.ImageSourcePropType
import typingsSlinky.reactNative.mod.ImageURISource
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextProps
import typingsSlinky.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMod extends Shortcut {
  
  @JSImport("react-native-share/Button", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ButtonProps] = js.native
  
  @js.native
  trait ButtonProps extends StObject {
    
    var buttonStyle: StyleProp[ViewProps] = js.native
    
    var children: ReactElement = js.native
    
    var iconSrc: ImageSourcePropType = js.native
    
    def onPress(): Unit = js.native
    
    var textStyle: StyleProp[TextProps] = js.native
  }
  object ButtonProps {
    
    @scala.inline
    def apply(iconSrc: ImageSourcePropType, onPress: () => Unit): ButtonProps = {
      val __obj = js.Dynamic.literal(iconSrc = iconSrc.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress))
      __obj.asInstanceOf[ButtonProps]
    }
    
    @scala.inline
    implicit class ButtonPropsMutableBuilder[Self <: ButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonStyle(value: StyleProp[ViewProps]): Self = StObject.set(x, "buttonStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonStyleNull: Self = StObject.set(x, "buttonStyle", null)
      
      @scala.inline
      def setButtonStyleUndefined: Self = StObject.set(x, "buttonStyle", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setIconSrc(value: ImageSourcePropType): Self = StObject.set(x, "iconSrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconSrcVarargs(value: ImageURISource*): Self = StObject.set(x, "iconSrc", js.Array(value :_*))
      
      @scala.inline
      def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTextStyle(value: StyleProp[TextProps]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
      
      @scala.inline
      def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ButtonProps]
  
  /* This means you don't have to write `default`, but can instead just say `buttonMod.foo` */
  override def _to: ReactComponentClass[ButtonProps] = default
}
