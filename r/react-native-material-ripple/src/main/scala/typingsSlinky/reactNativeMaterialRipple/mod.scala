package typingsSlinky.reactNativeMaterialRipple

import slinky.core.ReactComponentClass
import typingsSlinky.react.anon.Children
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.Animated.AnimatedProps
import typingsSlinky.reactNative.mod.TouchableWithoutFeedbackProps
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNativeMaterialRipple.anon.Disabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-material-ripple", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class default ()
    extends Component[RippleProps, js.Object, js.Any]
  
  type Ripple = ReactComponentClass[RippleProps]
  
  type RippleProps = TouchableWithoutFeedbackProps with Children with AnimatedProps[ViewProps] with Disabled
}
