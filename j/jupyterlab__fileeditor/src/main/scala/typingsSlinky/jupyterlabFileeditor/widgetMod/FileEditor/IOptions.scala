package typingsSlinky.jupyterlabFileeditor.widgetMod.FileEditor

import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsSlinky.jupyterlabCodeeditor.mimetypeMod.IEditorMimeTypeService
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.CodeContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create an editor widget.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The document context associated with the editor.
    */
  var context: CodeContext = js.native
  /**
    * A code editor factory.
    */
  var factory: Factory = js.native
  /**
    * The mime type service for the editor.
    */
  var mimeTypeService: IEditorMimeTypeService = js.native
}

object IOptions {
  @scala.inline
  def apply(
    context: CodeContext,
    factory: /* options */ typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor,
    mimeTypeService: IEditorMimeTypeService
  ): IOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], factory = js.Any.fromFunction1(factory), mimeTypeService = mimeTypeService.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: CodeContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFactory(value: /* options */ typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMimeTypeService(value: IEditorMimeTypeService): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeTypeService")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

