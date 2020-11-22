package typingsSlinky.reactNativeMaterialRipple

import slinky.core.ReactComponentClass
import typingsSlinky.react.anon.Children
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.TouchableWithoutFeedbackProps
import typingsSlinky.reactNativeMaterialRipple.anon.AnimatedPropsViewProps
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
  
  type RippleProps = TouchableWithoutFeedbackProps with Children with AnimatedPropsViewProps with Disabled
}
