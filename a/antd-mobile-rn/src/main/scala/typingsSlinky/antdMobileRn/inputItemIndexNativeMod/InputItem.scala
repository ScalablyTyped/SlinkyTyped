package typingsSlinky.antdMobileRn.inputItemIndexNativeMod

import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputItem
  extends Component[InputItemProps, js.Any, js.Any] {
  
  def focus(): Unit = js.native
  
  var inputRef: typingsSlinky.antdMobileRn.inputNativeMod.default | Null = js.native
  
  def onChange(text: String): Unit = js.native
  
  def onInputBlur(): Unit = js.native
  
  def onInputClear(): Unit = js.native
  
  def onInputFocus(): Unit = js.native
}
