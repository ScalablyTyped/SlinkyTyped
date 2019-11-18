package typingsSlinky.antd.libInputTextAreaMod

import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.antd.Anon_Resizing
import typingsSlinky.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.reactMod.ChangeEvent
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextArea
  extends Component[TextAreaProps, TextAreaState, js.Any] {
  var nextFrameActionId: Double = js.native
  var resizeFrameId: Double = js.native
  @JSName("state")
  var state_TextArea: Anon_Resizing = js.native
  var textAreaRef: js.Any = js.native
  def blur(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MTextArea(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTextArea(prevProps: TextAreaProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MTextArea(): Unit = js.native
  def focus(): Unit = js.native
  def handleKeyDown(e: SyntheticKeyboardEvent[HTMLTextAreaElement]): Unit = js.native
  def handleTextareaChange(e: ChangeEvent[HTMLTextAreaElement]): Unit = js.native
  def renderTextArea(hasGetPrefixCls: ConfigConsumerProps): ReactElement = js.native
  def resizeOnNextFrame(): Unit = js.native
  def resizeTextarea(): Unit = js.native
  def saveTextAreaRef(textArea: HTMLTextAreaElement): Unit = js.native
}

