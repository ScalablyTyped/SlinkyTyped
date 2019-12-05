package typingsSlinky.atAntDashDesignReactDashNative.libSearchDashBarMod

import typingsSlinky.atAntDashDesignReactDashNative.Anon_NativeEvent
import typingsSlinky.atAntDashDesignReactDashNative.libSearchDashBarPropsTypeMod.SearchBarState
import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashNative.reactDashNativeMod.NativeSyntheticEvent
import typingsSlinky.reactDashNative.reactDashNativeMod.TextInput
import typingsSlinky.reactDashNative.reactDashNativeMod.TextInputFocusEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchBar
  extends Component[SearchBarProps, SearchBarState, js.Any] {
  var inputRef: TextInput | Null = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MSearchBar(nextProps: SearchBarProps): Unit = js.native
  def onBlur(e: NativeSyntheticEvent[TextInputFocusEventData]): Unit = js.native
  def onCancel(): Unit = js.native
  def onChangeText(value: String): Unit = js.native
  def onFocus(e: NativeSyntheticEvent[TextInputFocusEventData]): Unit = js.native
  def onSubmit(`_`: Anon_NativeEvent): Unit = js.native
}

