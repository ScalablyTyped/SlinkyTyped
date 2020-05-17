package typingsSlinky.ckeditorCkeditor5Core.mod.editor

import typingsSlinky.ckeditorCkeditor5Core.anon.Priority
import typingsSlinky.ckeditorCkeditor5Core.anon.`0`
import typingsSlinky.ckeditorCkeditor5Core.ckeditorCkeditor5CoreStrings.destroyed
import typingsSlinky.ckeditorCkeditor5Core.ckeditorCkeditor5CoreStrings.initializing
import typingsSlinky.ckeditorCkeditor5Core.ckeditorCkeditor5CoreStrings.ready
import typingsSlinky.ckeditorCkeditor5Core.mod.CommandCollection
import typingsSlinky.ckeditorCkeditor5Core.mod.EditingKeystrokeHandler
import typingsSlinky.ckeditorCkeditor5Core.mod.Plugin
import typingsSlinky.ckeditorCkeditor5Core.mod.PluginCollection
import typingsSlinky.ckeditorCkeditor5Engine.mod.controller.DataController
import typingsSlinky.ckeditorCkeditor5Engine.mod.controller.EditingController
import typingsSlinky.ckeditorCkeditor5Engine.mod.conversion.Conversion
import typingsSlinky.ckeditorCkeditor5Engine.mod.model.Model
import typingsSlinky.ckeditorCkeditor5Utils.mod.Config
import typingsSlinky.ckeditorCkeditor5Utils.mod.Emitter
import typingsSlinky.ckeditorCkeditor5Utils.mod.Locale
import typingsSlinky.ckeditorCkeditor5Utils.mod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// core/editor/editor
@JSImport("@ckeditor/ckeditor5-core", "editor.Editor")
@js.native
class Editor () extends Observable {
  def this(config: js.Object) = this()
  val commands: CommandCollection = js.native
  val config: Config = js.native
  val conversion: Conversion = js.native
  val data: DataController = js.native
  val editing: EditingController = js.native
  var isReadOnly: Boolean = js.native
  val keystrokes: EditingKeystrokeHandler = js.native
  val locale: Locale = js.native
  val model: Model = js.native
  val plugins: PluginCollection[Plugin[_]] = js.native
  var state: initializing | ready | destroyed = js.native
  def destroy(): js.Promise[Unit] = js.native
  def execute(commandName: String, commandParams: js.Any*): Unit = js.native
  def initPlugins(): js.Promise[Unit] = js.native
  def listenTo(emitter: Emitter, event: String, callback: js.Function, options: Priority): Unit = js.native
  def on(event: String, callback: js.Function, options: `0`): Unit = js.native
  def once(event: String, callback: js.Function, options: `0`): Unit = js.native
  def t(str: String): String = js.native
  def t(str: String, values: js.Array[String]): String = js.native
}

/* static members */
@JSImport("@ckeditor/ckeditor5-core", "editor.Editor")
@js.native
object Editor extends js.Object {
  var builtinPlugins: js.Array[Plugin[_]] = js.native
  var defaultConfig: js.Object = js.native
  def create(config: js.Object): js.Promise[_] = js.native
}

