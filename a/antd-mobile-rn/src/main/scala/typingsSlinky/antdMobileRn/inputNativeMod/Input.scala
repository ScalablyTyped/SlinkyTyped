package typingsSlinky.antdMobileRn.inputNativeMod

import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.TextInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Input
  extends Component[TextInputProps, js.Any, js.Any] {
  
  def clear(): Unit = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MInput(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MInput(): Unit = js.native
  
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MInput(nextProps: TextInputProps): Unit = js.native
  
  def focus(): Unit = js.native
  
  var inputRef: TextInput | Null = js.native
}
