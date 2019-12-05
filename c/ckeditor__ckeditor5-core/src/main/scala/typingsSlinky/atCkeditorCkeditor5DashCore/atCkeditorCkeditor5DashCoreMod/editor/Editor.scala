package typingsSlinky.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreMod.editor

import typingsSlinky.atCkeditorCkeditor5DashCore.Anon_Priority
import typingsSlinky.atCkeditorCkeditor5DashCore.Anon_PriorityNumber
import typingsSlinky.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreMod.CommandCollection
import typingsSlinky.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreMod.EditingKeystrokeHandler
import typingsSlinky.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreMod.Plugin
import typingsSlinky.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreMod.PluginCollection
import typingsSlinky.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreStrings.destroyed
import typingsSlinky.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreStrings.initializing
import typingsSlinky.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreStrings.ready
import typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.controller.DataController
import typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.controller.EditingController
import typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.conversion.Conversion
import typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Model
import typingsSlinky.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.Config
import typingsSlinky.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.Emitter
import typingsSlinky.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.Locale
import typingsSlinky.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.Observable
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
  def listenTo(emitter: Emitter, event: String, callback: js.Function, options: Anon_Priority): Unit = js.native
  def on(event: String, callback: js.Function, options: Anon_PriorityNumber): Unit = js.native
  def once(event: String, callback: js.Function, options: Anon_PriorityNumber): Unit = js.native
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

