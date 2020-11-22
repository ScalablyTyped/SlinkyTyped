package typingsSlinky.jupyterlabSettingeditor.plugineditorMod

import typingsSlinky.jupyterlabSettingeditor.plugineditorMod.PluginEditor.IOptions
import typingsSlinky.jupyterlabSettingeditor.raweditorMod.RawEditor
import typingsSlinky.jupyterlabSettingeditor.settingeditorMod.SettingEditor.IPluginLayout
import typingsSlinky.jupyterlabSettingregistry.tokensMod.ISettingRegistry.ISettings
import typingsSlinky.luminoSignaling.mod.ISignal
import typingsSlinky.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/settingeditor/lib/plugineditor", "PluginEditor")
@js.native
class PluginEditor_ protected () extends Widget {
  /**
    * Create a new plugin editor.
    *
    * @param options - The plugin editor instantiation options.
    */
  def this(options: IOptions) = this()
  
  /**
    * Handle layout state changes that need to be saved.
    */
  var _onStateChanged: js.Any = js.native
  
  var _rawEditor: js.Any = js.native
  
  var _settings: js.Any = js.native
  
  var _stateChanged: js.Any = js.native
  
  /**
    * If the editor is in a dirty state, confirm that the user wants to leave.
    */
  def confirm(): js.Promise[Unit] = js.native
  
  /**
    * Tests whether the settings have been modified and need saving.
    */
  def isDirty: Boolean = js.native
  
  /**
    * The plugin editor's raw editor.
    */
  val raw: RawEditor = js.native
  
  /**
    * The plugin settings being edited.
    */
  def settings: ISettings | Null = js.native
  def settings_=(settings: ISettings | Null): Unit = js.native
  
  /**
    * The plugin editor layout state.
    */
  def state: IPluginLayout = js.native
  
  /**
    * A signal that emits when editor layout state changes and needs to be saved.
    */
  def stateChanged: ISignal[this.type, Unit] = js.native
  
  def state_=(state: IPluginLayout): Unit = js.native
}
