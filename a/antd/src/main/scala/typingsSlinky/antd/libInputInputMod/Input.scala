package typingsSlinky.antd.libInputInputMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.reactMod.ChangeEvent
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Input
  extends Component[InputProps, InputState, js.Any] {
  var clearableInput: typingsSlinky.antd.libInputClearableLabeledInputMod.default = js.native
  var input: HTMLInputElement = js.native
  def blur(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MInput(): Unit = js.native
  def focus(): Unit = js.native
  @JSName("getSnapshotBeforeUpdate")
  def getSnapshotBeforeUpdate_MInput(prevProps: InputProps): Null = js.native
  def handleChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def handleKeyDown(e: SyntheticKeyboardEvent[HTMLInputElement]): Unit = js.native
  def handleReset(e: SyntheticMouseEvent[HTMLElement]): Unit = js.native
  def renderComponent(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def renderInput(prefixCls: String): Element = js.native
  def saveClearableInput(input: typingsSlinky.antd.libInputClearableLabeledInputMod.default): Unit = js.native
  def saveInput(input: HTMLInputElement): Unit = js.native
  def select(): Unit = js.native
  def setValue(value: String): Unit = js.native
  def setValue(value: String, callback: js.Function0[Unit]): Unit = js.native
}

