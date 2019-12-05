package typingsSlinky.atJupyterlabFileeditor.libWidgetMod.FileEditor

import typingsSlinky.atJupyterlabCodeeditor.libEditorMod.CodeEditor.Factory
import typingsSlinky.atJupyterlabCodeeditor.libEditorMod.CodeEditor.IEditor
import typingsSlinky.atJupyterlabCodeeditor.libMimetypeMod.IEditorMimeTypeService
import typingsSlinky.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.CodeContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create an editor widget.
  */
trait IOptions extends js.Object {
  /**
    * The document context associated with the editor.
    */
  var context: CodeContext
  /**
    * A code editor factory.
    */
  var factory: Factory
  /**
    * The mime type service for the editor.
    */
  var mimeTypeService: IEditorMimeTypeService
}

object IOptions {
  @scala.inline
  def apply(
    context: CodeContext,
    factory: /* options */ typingsSlinky.atJupyterlabCodeeditor.libEditorMod.CodeEditor.IOptions => IEditor,
    mimeTypeService: IEditorMimeTypeService
  ): IOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], factory = js.Any.fromFunction1(factory), mimeTypeService = mimeTypeService.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

