package typingsSlinky.antdDashMobileDashRn.libSearchDashBarIndexDotNativeMod

import typingsSlinky.antdDashMobileDashRn.Anon_NativeEvent
import typingsSlinky.antdDashMobileDashRn.libSearchDashBarPropsTypeMod.SearchBarState
import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashNative.reactDashNativeMod.TextInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchBar
  extends Component[SearchBarNativeProps, SearchBarState, js.Any] {
  var inputRef: TextInput | Null = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MSearchBar(nextProps: SearchBarNativeProps): Unit = js.native
  def onBlur(): Unit = js.native
  def onCancel(): Unit = js.native
  def onChangeText(value: String): Unit = js.native
  def onFocus(): Unit = js.native
  def onSubmit(`_`: Anon_NativeEvent): Unit = js.native
}

