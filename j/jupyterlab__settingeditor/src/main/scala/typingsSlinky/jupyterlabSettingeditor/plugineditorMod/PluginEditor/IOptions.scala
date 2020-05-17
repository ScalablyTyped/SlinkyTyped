package typingsSlinky.jupyterlabSettingeditor.plugineditorMod.PluginEditor

import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsSlinky.jupyterlabCoreutils.tokensMod.ISettingRegistry
import typingsSlinky.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typingsSlinky.jupyterlabSettingeditor.anon.Registry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The instantiation options for a plugin editor.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The toolbar commands and registry for the setting editor toolbar.
    */
  var commands: Registry = js.native
  /**
    * The editor factory used by the plugin editor.
    */
  var editorFactory: Factory = js.native
  /**
    * The setting registry used by the editor.
    */
  var registry: ISettingRegistry = js.native
  /**
    * The optional MIME renderer to use for rendering debug messages.
    */
  var rendermime: js.UndefOr[IRenderMimeRegistry] = js.native
}

object IOptions {
  @scala.inline
  def apply(
    commands: Registry,
    editorFactory: /* options */ typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor,
    registry: ISettingRegistry
  ): IOptions = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], editorFactory = js.Any.fromFunction1(editorFactory), registry = registry.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommands(value: Registry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditorFactory(value: /* options */ typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorFactory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegistry(value: ISettingRegistry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRendermime(value: IRenderMimeRegistry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendermime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRendermime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendermime")(js.undefined)
        ret
    }
  }
  
}

