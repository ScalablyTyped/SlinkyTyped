package typingsSlinky.reactNativeElements.mod

import typingsSlinky.react.mod.Component
import typingsSlinky.reactNativeElements.anon.PartialTextInputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-elements", "Input")
@js.native
class Input protected ()
  extends Component[InputProps, js.Object, js.Any] {
  def this(props: InputProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: InputProps, context: js.Any) = this()
  
  /**
    * Calls blur on the Input
    *
    * eg `this.inputRef.blur()`
    */
  def blur(): Unit = js.native
  
  /**
    * Calls clear on the Input
    *
    * eg `this.inputRef.clear()`
    */
  def clear(): Unit = js.native
  
  /**
    * Calls focus on the Input
    *
    * eg `this.inputRef.focus()`
    */
  def focus(): Unit = js.native
  
  /**
    * Calls isFocused() on the Input
    *
    * eg `let focused = this.inputRef.isFocused()`
    */
  def isFocused(): Boolean = js.native
  
  /**
    * Calls setNativeProps on the Input
    *
    * eg `this.inputRef.setNativeProps({ text: 'any text' })`
    */
  def setNativeProps(nativeProps: PartialTextInputProps): Unit = js.native
  
  /**
    * Shakes the Input
    *
    * eg `this.inputRef.shake()`
    */
  def shake(): Unit = js.native
}
