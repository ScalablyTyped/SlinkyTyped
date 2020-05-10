package typingsSlinky.jupyterlabNotebook.notebooktoolsMod.NotebookTools.MetadataEditorTool

import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a metadata editor tool.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * Initial collapse state, defaults to true.
    */
  var collapsed: js.UndefOr[Boolean] = js.native
  /**
    * The editor factory used by the tool.
    */
  var editorFactory: Factory = js.native
  /**
    * The label for the JSON editor
    */
  var label: js.UndefOr[String] = js.native
}

object IOptions {
  @scala.inline
  def apply(
    editorFactory: /* options */ typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor
  ): IOptions = {
    val __obj = js.Dynamic.literal(editorFactory = js.Any.fromFunction1(editorFactory))
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEditorFactory(value: /* options */ typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorFactory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
  }
  
}

