package typingsSlinky.rcPicker.anon

import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLInputElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.react.mod.FocusEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlurToCancel extends js.Object {
  
  var blurToCancel: js.UndefOr[Boolean] = js.native
  
  def forwardKeyDown(e: SyntheticKeyboardEvent[HTMLInputElement]): Boolean = js.native
  
  def isClickOutside(): Boolean = js.native
  def isClickOutside(clickElement: EventTarget): Boolean = js.native
  
  var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  
  def onCancel(): Unit = js.native
  
  var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  
  def onSubmit(): Unit | Boolean = js.native
  
  var open: Boolean = js.native
  
  def triggerOpen(open: Boolean): Unit = js.native
  
  var value: String = js.native
}
