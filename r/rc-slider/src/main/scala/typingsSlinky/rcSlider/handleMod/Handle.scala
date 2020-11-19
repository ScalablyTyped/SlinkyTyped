package typingsSlinky.rcSlider.handleMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.rcSlider.anon.ClickFocused
import typingsSlinky.rcSlider.anon.Remove
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Handle
  extends Component[HandleProps, js.Object, js.Any] {
  
  def blur(): Unit = js.native
  
  def clickFocus(): Unit = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MHandle(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MHandle(): Unit = js.native
  
  def focus(): Unit = js.native
  
  var handle: HTMLElement = js.native
  
  def handleBlur(): Unit = js.native
  
  def handleKeyDown(): Unit = js.native
  
  def handleMouseDown(e: js.Any): Unit = js.native
  
  def handleMouseUp(): Unit = js.native
  
  var onMouseUpListener: Remove = js.native
  
  def setClickFocus(focused: js.Any): Unit = js.native
  
  def setHandleRef(node: js.Any): Unit = js.native
  
  @JSName("state")
  var state_Handle: ClickFocused = js.native
}
