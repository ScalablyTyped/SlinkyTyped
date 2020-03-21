package typingsSlinky.antDesignReactNative.searchBarMod

import slinky.core.SyntheticEvent
import typingsSlinky.antDesignReactNative.AnonNativeEvent
import typingsSlinky.antDesignReactNative.searchBarPropsTypeMod.SearchBarState
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.TextInput
import typingsSlinky.reactNative.mod.TextInputFocusEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchBar
  extends Component[SearchBarProps, SearchBarState, js.Any] {
  var inputRef: TextInput | Null = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MSearchBar(nextProps: SearchBarProps): Unit = js.native
  def onBlur(e: SyntheticEvent[NodeHandle, TextInputFocusEventData]): Unit = js.native
  def onCancel(): Unit = js.native
  def onChangeText(value: String): Unit = js.native
  def onFocus(e: SyntheticEvent[NodeHandle, TextInputFocusEventData]): Unit = js.native
  def onSubmit(_underscore: AnonNativeEvent): Unit = js.native
}

