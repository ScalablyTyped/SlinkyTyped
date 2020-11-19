package typingsSlinky.ckeditorCkeditor5Core.mod

import typingsSlinky.ckeditorCkeditor5Core.anon.`0`
import typingsSlinky.ckeditorCkeditor5Core.mod.editor.Editor
import typingsSlinky.ckeditorCkeditor5Engine.mod.view.observer.KeyEventData
import typingsSlinky.ckeditorCkeditor5Utils.mod.KeystrokeHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ckeditor/ckeditor5-core", "EditingKeystrokeHandler")
@js.native
class EditingKeystrokeHandler protected () extends KeystrokeHandler {
  def this(editor: Editor) = this()
  
  val editor: Editor = js.native
  
  def set(keystroke: String, callback: String): Unit = js.native
  def set(keystroke: String, callback: String, options: `0`): Unit = js.native
  def set(
    keystroke: String,
    callback: js.Function2[/* keyEvtData */ KeyEventData, /* cancel */ js.Function0[Unit], Unit],
    options: `0`
  ): Unit = js.native
  def set(keystroke: js.Array[String | Double], callback: String): Unit = js.native
  def set(keystroke: js.Array[String | Double], callback: String, options: `0`): Unit = js.native
  def set(
    keystroke: js.Array[String | Double],
    callback: js.Function2[/* keyEvtData */ KeyEventData, /* cancel */ js.Function0[Unit], Unit],
    options: `0`
  ): Unit = js.native
}
