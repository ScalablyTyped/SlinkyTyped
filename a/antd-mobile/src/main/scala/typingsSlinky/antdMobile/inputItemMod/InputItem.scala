package typingsSlinky.antdMobile.inputItemMod

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputItem
  extends Component[InputItemProps, js.Any, js.Any] {
  var debounceTimeout: js.Any = js.native
  var inputRef: typingsSlinky.antdMobile.inputMod.default | typingsSlinky.antdMobile.customInputMod.default | Null = js.native
  def calcPos(
    prePos: Double,
    preCtrlVal: String,
    rawVal: String,
    ctrlVal: String,
    placeholderChars: js.Array[String],
    maskReg: js.RegExp
  ): Double = js.native
  def clearInput(): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MInputItem(nextProps: InputItemProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MInputItem(): Unit = js.native
  def focus(): Unit = js.native
  def handleOnChange(value: String): Unit = js.native
  def handleOnChange(value: String, isMutated: Boolean): Unit = js.native
  def handleOnChange(value: String, isMutated: Boolean, adjustPos: js.Function): Unit = js.native
  def onInputBlur(value: String): Unit = js.native
  def onInputChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def onInputFocus(value: String): Unit = js.native
}

