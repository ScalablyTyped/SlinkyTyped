package typingsSlinky.ckeditorCkeditor5Core.mod

import typingsSlinky.ckeditorCkeditor5Core.anon.Priority
import typingsSlinky.ckeditorCkeditor5Core.anon.`0`
import typingsSlinky.ckeditorCkeditor5Core.mod.editor.Editor
import typingsSlinky.ckeditorCkeditor5Utils.mod.Emitter
import typingsSlinky.ckeditorCkeditor5Utils.mod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ckeditor/ckeditor5-core", "Command")
@js.native
class Command[T] protected () extends Observable {
  def this(editor: Editor) = this()
  
  def destroy(): Unit = js.native
  
  val editor: Editor = js.native
  
  def execute(): Unit = js.native
  
  val isEnabled: Boolean = js.native
  
  def listenTo(emitter: Emitter, event: String, callback: js.Function, options: Priority): Unit = js.native
  
  def on(event: String, callback: js.Function, options: `0`): Unit = js.native
  
  def once(event: String, callback: js.Function, options: `0`): Unit = js.native
  
  def refresh(): Unit = js.native
  
  val value: js.UndefOr[T] = js.native
}
