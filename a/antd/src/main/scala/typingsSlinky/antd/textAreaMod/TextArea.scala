package typingsSlinky.antd.textAreaMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.configProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextArea
  extends Component[TextAreaProps, TextAreaState, js.Any] {
  var clearableInput: typingsSlinky.antd.clearableLabeledInputMod.default = js.native
  var resizableTextArea: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizableTextArea */ js.Any = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def handleChange(e: ChangeEvent[HTMLTextAreaElement]): Unit = js.native
  def handleReset(e: SyntheticMouseEvent[HTMLElement]): Unit = js.native
  def renderComponent(hasGetPrefixClsDirection: ConfigConsumerProps): ReactElement = js.native
  def renderTextArea(prefixCls: String): ReactElement = js.native
  def saveClearableInput(clearableInput: typingsSlinky.antd.clearableLabeledInputMod.default): Unit = js.native
  def saveTextArea(
    textarea: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RcTextArea */ js.Any
  ): Unit = js.native
  def setValue(value: String): Unit = js.native
  def setValue(value: String, callback: js.Function0[Unit]): Unit = js.native
}

