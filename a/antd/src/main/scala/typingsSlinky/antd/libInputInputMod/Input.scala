package typingsSlinky.antd.libInputInputMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.reactMod.ChangeEvent
import typingsSlinky.react.reactMod.Component
import typingsSlinky.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Input
  extends Component[InputProps, js.Any, js.Any] {
  var input: HTMLInputElement = js.native
  def blur(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MInput(): Unit = js.native
  def focus(): Unit = js.native
  def getInputClassName(prefixCls: String): String = js.native
  @JSName("getSnapshotBeforeUpdate")
  def getSnapshotBeforeUpdate_MInput(prevProps: InputProps): Null = js.native
  def handleChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def handleKeyDown(e: SyntheticKeyboardEvent[HTMLInputElement]): Unit = js.native
  def handleReset(e: SyntheticMouseEvent[HTMLElement]): Unit = js.native
  def renderClearIcon(prefixCls: String): ReactElement | Null = js.native
  def renderComponent(hasGetPrefixCls: ConfigConsumerProps): ReactElement = js.native
  def renderInput(prefixCls: String): ReactElement = js.native
  def renderLabeledIcon(prefixCls: String, children: ReactElement): ReactElement = js.native
  def renderLabeledInput(prefixCls: String, children: ReactElement): ReactElement = js.native
  def renderSuffix(prefixCls: String): ReactElement | Null = js.native
  def saveInput(node: HTMLInputElement): Unit = js.native
  def select(): Unit = js.native
  def setValue(value: String, e: ChangeEvent[typingsSlinky.std.HTMLInputElement]): Unit = js.native
  def setValue(value: String, e: ChangeEvent[typingsSlinky.std.HTMLInputElement], callback: js.Function0[Unit]): Unit = js.native
  def setValue(
    value: String,
    e: typingsSlinky.react.reactMod.MouseEvent[typingsSlinky.std.HTMLElement, MouseEvent]
  ): Unit = js.native
  def setValue(
    value: String,
    e: typingsSlinky.react.reactMod.MouseEvent[typingsSlinky.std.HTMLElement, MouseEvent],
    callback: js.Function0[Unit]
  ): Unit = js.native
}

