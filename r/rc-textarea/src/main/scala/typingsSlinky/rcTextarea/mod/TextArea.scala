package typingsSlinky.rcTextarea.mod

import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextArea
  extends Component[TextAreaProps, TextAreaState, js.Any] {
  
  def blur(): Unit = js.native
  
  def focus(): Unit = js.native
  
  def handleChange(e: ChangeEvent[HTMLTextAreaElement]): Unit = js.native
  
  def handleKeyDown(e: SyntheticKeyboardEvent[HTMLTextAreaElement]): Unit = js.native
  
  var resizableTextArea: typingsSlinky.rcTextarea.resizableTextAreaMod.default = js.native
  
  def saveTextArea(resizableTextArea: typingsSlinky.rcTextarea.resizableTextAreaMod.default): Unit = js.native
  
  def setValue(value: String): Unit = js.native
  def setValue(value: String, callback: js.Function0[Unit]): Unit = js.native
}
