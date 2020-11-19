package typingsSlinky.reactNativeElements.mod

import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.TextInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-elements", "SearchBar")
@js.native
class SearchBar ()
  extends Component[SearchBarProps, js.Any, js.Any] {
  
  /**
    * Call blur on the TextInput
    */
  def blur(): Unit = js.native
  
  /**
    * Only available for Android and IOS
    * call blur on the TextInput
    * call cancel passed from Props
    */
  var cancel: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Call clear on the TextInput
    */
  def clear(): Unit = js.native
  
  /**
    * Call focus on the TextInput
    */
  def focus(): Unit = js.native
  
  /**
    * Holds reference to the stored input.
    */
  var input: TextInput = js.native
}
