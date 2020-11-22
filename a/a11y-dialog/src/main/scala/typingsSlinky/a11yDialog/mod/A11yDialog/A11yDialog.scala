package typingsSlinky.a11yDialog.mod.A11yDialog

import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait A11yDialog extends js.Object {
  
  /* private */ def _bindKeypress(event: Event): Unit = js.native
  
  /* private */ def _fire(`type`: EventType, event: Event): Unit = js.native
  
  /* private */ def _maintainFocus(event: Event): Unit = js.native
  
  def create(targets: Targets): typingsSlinky.a11yDialog.mod.A11yDialog.A11yDialog = js.native
  
  def destroy(): typingsSlinky.a11yDialog.mod.A11yDialog.A11yDialog = js.native
  
  def hide(): typingsSlinky.a11yDialog.mod.A11yDialog.A11yDialog = js.native
  def hide(event: Event): typingsSlinky.a11yDialog.mod.A11yDialog.A11yDialog = js.native
  
  def off(`type`: EventType, handler: EventHandler): typingsSlinky.a11yDialog.mod.A11yDialog.A11yDialog = js.native
  
  def on(`type`: EventType, handler: EventHandler): typingsSlinky.a11yDialog.mod.A11yDialog.A11yDialog = js.native
  
  def show(): typingsSlinky.a11yDialog.mod.A11yDialog.A11yDialog = js.native
  def show(event: Event): typingsSlinky.a11yDialog.mod.A11yDialog.A11yDialog = js.native
}
