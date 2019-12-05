package typingsSlinky.atJupyterlabSettingeditor.libPlugineditorMod.PluginEditor

import typingsSlinky.atJupyterlabCodeeditor.libEditorMod.CodeEditor.Factory
import typingsSlinky.atJupyterlabCodeeditor.libEditorMod.CodeEditor.IEditor
import typingsSlinky.atJupyterlabCoreutils.libTokensMod.ISettingRegistry
import typingsSlinky.atJupyterlabRendermime.libTokensMod.IRenderMimeRegistry
import typingsSlinky.atJupyterlabSettingeditor.Anon_Registry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The instantiation options for a plugin editor.
  */
trait IOptions extends js.Object {
  /**
    * The toolbar commands and registry for the setting editor toolbar.
    */
  var commands: Anon_Registry
  /**
    * The editor factory used by the plugin editor.
    */
  var editorFactory: Factory
  /**
    * The setting registry used by the editor.
    */
  var registry: ISettingRegistry
  /**
    * The optional MIME renderer to use for rendering debug messages.
    */
  var rendermime: js.UndefOr[IRenderMimeRegistry] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    commands: Anon_Registry,
    editorFactory: /* options */ typingsSlinky.atJupyterlabCodeeditor.libEditorMod.CodeEditor.IOptions => IEditor,
    registry: ISettingRegistry,
    rendermime: IRenderMimeRegistry = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], editorFactory = js.Any.fromFunction1(editorFactory), registry = registry.asInstanceOf[js.Any])
    if (rendermime != null) __obj.updateDynamic("rendermime")(rendermime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

