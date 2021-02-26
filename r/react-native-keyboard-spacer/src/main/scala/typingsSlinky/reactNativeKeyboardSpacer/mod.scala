package typingsSlinky.reactNativeKeyboardSpacer

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-keyboard-spacer", JSImport.Default)
  @js.native
  class default ()
    extends Component[KeyboardSpacerProps, js.Any, js.Any]
  
  type KeyboardSpacer = ReactComponentClass[KeyboardSpacerProps]
  
  @js.native
  trait KeyboardSpacerProps extends StObject {
    
    var onToggle: js.UndefOr[js.Function2[/* keyboardIsOpen */ Boolean, /* keyboardSpace */ Double, Unit]] = js.native
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var topSpacing: js.UndefOr[Double] = js.native
  }
  object KeyboardSpacerProps {
    
    @scala.inline
    def apply(): KeyboardSpacerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyboardSpacerProps]
    }
    
    @scala.inline
    implicit class KeyboardSpacerPropsMutableBuilder[Self <: KeyboardSpacerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnToggle(value: (/* keyboardIsOpen */ Boolean, /* keyboardSpace */ Double) => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTopSpacing(value: Double): Self = StObject.set(x, "topSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopSpacingUndefined: Self = StObject.set(x, "topSpacing", js.undefined)
    }
  }
}
