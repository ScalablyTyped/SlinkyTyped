package typingsSlinky.antDesignReactNative

import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.lg
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.md
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.sm
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wingBlankMod {
  
  @JSImport("@ant-design/react-native/lib/wing-blank", JSImport.Default)
  @js.native
  class default () extends WingBlank
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("@ant-design/react-native/lib/wing-blank", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@ant-design/react-native/lib/wing-blank", "default.defaultProps.size")
      @js.native
      def size: String = js.native
      @scala.inline
      def size_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WingBlank
    extends Component[WingBlankProps, js.Any, js.Any]
  
  @js.native
  trait WingBlankProps extends StObject {
    
    var size: js.UndefOr[sm | md | lg] = js.native
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  }
  object WingBlankProps {
    
    @scala.inline
    def apply(): WingBlankProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WingBlankProps]
    }
    
    @scala.inline
    implicit class WingBlankPropsMutableBuilder[Self <: WingBlankProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: sm | md | lg): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
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
