package typingsSlinky.antd.textAreaMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.configProviderContextMod.ConfigConsumerProps
import typingsSlinky.rcTextarea.mod.ResizableTextArea
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextArea
  extends Component[TextAreaProps, TextAreaState, js.Any] {
  
  def blur(): Unit = js.native
  
  var clearableInput: typingsSlinky.antd.clearableLabeledInputMod.default = js.native
  
  def focus(): Unit = js.native
  
  def handleChange(e: ChangeEvent[HTMLTextAreaElement]): Unit = js.native
  
  def handleReset(e: SyntheticMouseEvent[HTMLElement]): Unit = js.native
  
  def renderComponent(hasGetPrefixClsDirection: ConfigConsumerProps): ReactElement = js.native
  
  def renderTextArea(prefixCls: String, bordered: Boolean): ReactElement = js.native
  
  var resizableTextArea: ResizableTextArea = js.native
  
  def saveClearableInput(clearableInput: typingsSlinky.antd.clearableLabeledInputMod.default): Unit = js.native
  
  def saveTextArea(textarea: typingsSlinky.rcTextarea.mod.default): Unit = js.native
  
  def setValue(value: String): Unit = js.native
  def setValue(value: String, callback: js.Function0[Unit]): Unit = js.native
}
