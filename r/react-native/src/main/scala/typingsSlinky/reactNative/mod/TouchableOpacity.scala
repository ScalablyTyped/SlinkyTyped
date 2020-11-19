package typingsSlinky.reactNative.mod

import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.TimerMixin
- Dropped new (args : ...any): react-native.react-native.TouchableMixin
- Dropped new (args : ...any): react-native.react-native.NativeMethodsMixinType */ @JSImport("react-native", "TouchableOpacity")
@js.native
class TouchableOpacity ()
  extends Component[TouchableOpacityProps, js.Object, js.Any] {
  
  /**
    * Animate the touchable to a new opacity.
    */
  def setOpacityTo(value: Double): Unit = js.native
}
