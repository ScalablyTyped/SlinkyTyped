package typingsSlinky.rcTextarea.resizableTextAreaMod

import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.core.facade.ReactElement
import typingsSlinky.rcTextarea.anon.Height
import typingsSlinky.rcTextarea.mod.TextAreaProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizableTextArea
  extends Component[TextAreaProps, TextAreaState, js.Any] {
  
  @JSName("componentDidMount")
  def componentDidMount_MResizableTextArea(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MResizableTextArea(prevProps: TextAreaProps): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MResizableTextArea(): Unit = js.native
  
  def fixFirefoxAutoScroll(): Unit = js.native
  
  def handleResize(size: Height): Unit = js.native
  
  var nextFrameActionId: Double = js.native
  
  def renderTextArea(): ReactElement = js.native
  
  var resizeFrameId: Double = js.native
  
  def resizeOnNextFrame(): Unit = js.native
  
  def resizeTextarea(): Unit = js.native
  
  def saveTextArea(textArea: HTMLTextAreaElement): Unit = js.native
  
  var textArea: HTMLTextAreaElement = js.native
}
