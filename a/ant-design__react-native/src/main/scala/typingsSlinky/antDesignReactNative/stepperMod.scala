package typingsSlinky.antDesignReactNative

import typingsSlinky.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsSlinky.antDesignReactNative.stepperPropsTypeMod.StepPropsType
import typingsSlinky.antDesignReactNative.stepperStyleMod.StepperStyle
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepperMod {
  
  @JSImport("@ant-design/react-native/lib/stepper", JSImport.Default)
  @js.native
  class default () extends Stepper
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/stepper", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/stepper", "default.defaultProps")
    @js.native
    def defaultProps: StepProps = js.native
    @scala.inline
    def defaultProps_=(x: StepProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait StepProps
    extends StepPropsType
       with WithThemeStyles[StepperStyle] {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  }
  object StepProps {
    
    @scala.inline
    def apply(): StepProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepProps]
    }
    
    @scala.inline
    implicit class StepPropsMutableBuilder[Self <: StepProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait Stepper
    extends Component[StepProps, js.Any, js.Any]
}
