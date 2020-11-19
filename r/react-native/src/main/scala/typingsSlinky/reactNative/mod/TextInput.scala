package typingsSlinky.reactNative.mod

import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.NativeMethodsMixinType
- Dropped new (args : ...any): react-native.react-native.TimerMixin */ @JSImport("react-native", "TextInput")
@js.native
class TextInput ()
  extends Component[TextInputProps, js.Object, js.Any] {
  
  /**
    * Removes all text from the input.
    */
  def clear(): Unit = js.native
  
  /**
    * Returns if the input is currently focused.
    */
  def isFocused(): Boolean = js.native
}
/* static members */
@JSImport("react-native", "TextInput")
@js.native
object TextInput extends js.Object {
  
  /**
    * Access the current focus state.
    */
  var State: TextInputState = js.native
}
