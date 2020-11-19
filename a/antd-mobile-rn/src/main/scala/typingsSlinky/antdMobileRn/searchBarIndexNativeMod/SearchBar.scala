package typingsSlinky.antdMobileRn.searchBarIndexNativeMod

import typingsSlinky.antdMobileRn.anon.NativeEvent
import typingsSlinky.antdMobileRn.searchBarPropsTypeMod.SearchBarState
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.TextInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchBar
  extends Component[SearchBarNativeProps, SearchBarState, js.Any] {
  
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MSearchBar(nextProps: SearchBarNativeProps): Unit = js.native
  
  var inputRef: TextInput | Null = js.native
  
  def onBlur(): Unit = js.native
  
  def onCancel(): Unit = js.native
  
  def onChangeText(value: String): Unit = js.native
  
  def onFocus(): Unit = js.native
  
  def onSubmit(_underscore: NativeEvent): Unit = js.native
}
