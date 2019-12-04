package typingsSlinky.antd.libInputTextAreaMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLTextAreaElement
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
trait TextArea
  extends Component[TextAreaProps, TextAreaState, js.Any] {
  var clearableInput: typingsSlinky.antd.libInputClearableLabeledInputMod.default = js.native
  var resizableTextArea: typingsSlinky.antd.libInputResizableTextAreaMod.default = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def handleChange(e: ChangeEvent[HTMLTextAreaElement]): Unit = js.native
  def handleKeyDown(e: SyntheticKeyboardEvent[HTMLTextAreaElement]): Unit = js.native
  def handleReset(e: SyntheticMouseEvent[HTMLElement]): Unit = js.native
  def renderComponent(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def renderTextArea(prefixCls: String): Element = js.native
  def saveClearableInput(clearableInput: typingsSlinky.antd.libInputClearableLabeledInputMod.default): Unit = js.native
  def saveTextArea(resizableTextArea: typingsSlinky.antd.libInputResizableTextAreaMod.default): Unit = js.native
  def setValue(value: String): Unit = js.native
  def setValue(value: String, callback: js.Function0[Unit]): Unit = js.native
}

