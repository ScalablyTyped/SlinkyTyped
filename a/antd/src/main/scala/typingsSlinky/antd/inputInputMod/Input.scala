package typingsSlinky.antd.inputInputMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.contextMod.ConfigConsumerProps
import typingsSlinky.antd.sizeContextMod.SizeType
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.FocusEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Input
  extends Component[InputProps, InputState, js.Any] {
  var clearableInput: typingsSlinky.antd.clearableLabeledInputMod.default = js.native
  var direction: js.Any = js.native
  var input: HTMLInputElement = js.native
  var onBlur: FocusEventHandler[HTMLInputElement] = js.native
  var onFocus: FocusEventHandler[HTMLInputElement] = js.native
  var removePasswordTimeout: Double = js.native
  def blur(): Unit = js.native
  def clearPasswordValueAttribute(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MInput(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MInput(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MInput(): Unit = js.native
  def focus(): Unit = js.native
  @JSName("getSnapshotBeforeUpdate")
  def getSnapshotBeforeUpdate_MInput(prevProps: InputProps): Null = js.native
  def handleChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def handleKeyDown(e: SyntheticKeyboardEvent[HTMLInputElement]): Unit = js.native
  def handleReset(e: SyntheticMouseEvent[HTMLElement]): Unit = js.native
  def renderComponent(hasGetPrefixClsDirection: ConfigConsumerProps): ReactElement = js.native
  def renderInput(prefixCls: String): ReactElement = js.native
  def renderInput(prefixCls: String, size: SizeType): ReactElement = js.native
  def saveClearableInput(input: typingsSlinky.antd.clearableLabeledInputMod.default): Unit = js.native
  def saveInput(input: HTMLInputElement): Unit = js.native
  def select(): Unit = js.native
  def setValue(value: String): Unit = js.native
  def setValue(value: String, callback: js.Function0[Unit]): Unit = js.native
}

