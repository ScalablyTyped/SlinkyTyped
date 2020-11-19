package typingsSlinky.antDesignReactNative.searchBarMod

import slinky.core.SyntheticEvent
import typingsSlinky.antDesignReactNative.anon.NativeEvent
import typingsSlinky.antDesignReactNative.searchBarPropsTypeMod.SearchBarState
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.TextInput
import typingsSlinky.reactNative.mod.TextInputFocusEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchBar
  extends Component[SearchBarProps, SearchBarState, js.Any] {
  
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MSearchBar(nextProps: SearchBarProps): Unit = js.native
  
  var inputRef: TextInput | Null = js.native
  
  def onBlur(e: SyntheticEvent[NodeHandle, TextInputFocusEventData]): Unit = js.native
  
  def onCancel(): Unit = js.native
  
  def onChangeText(value: String): Unit = js.native
  
  def onFocus(e: SyntheticEvent[NodeHandle, TextInputFocusEventData]): Unit = js.native
  
  def onSubmit(_underscore: NativeEvent): Unit = js.native
}
