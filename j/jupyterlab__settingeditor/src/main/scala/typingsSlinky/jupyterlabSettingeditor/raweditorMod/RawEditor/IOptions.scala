package typingsSlinky.jupyterlabSettingeditor.raweditorMod.RawEditor

import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsSlinky.jupyterlabCoreutils.tokensMod.ISettingRegistry
import typingsSlinky.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The instantiation options for a raw editor.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The toolbar commands and registry for the setting editor toolbar.
    */
  var commands: ICommandBundle = js.native
  /**
    * The editor factory used by the raw editor.
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
  /**
    * A function the raw editor calls on save errors.
    */
  def onSaveError(reason: js.Any): Unit = js.native
}

object IOptions {
  @scala.inline
  def apply(
    commands: ICommandBundle,
    editorFactory: /* options */ typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor,
    onSaveError: js.Any => Unit,
    registry: ISettingRegistry
  ): IOptions = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], editorFactory = js.Any.fromFunction1(editorFactory), onSaveError = js.Any.fromFunction1(onSaveError), registry = registry.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommands(value: ICommandBundle): Self = {
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
    def withOnSaveError(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSaveError")(js.Any.fromFunction1(value))
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

