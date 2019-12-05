package typingsSlinky.atJupyterlabFileeditor.libWidgetMod

import typingsSlinky.atJupyterlabDocregistry.atJupyterlabDocregistryMod.ABCWidgetFactory
import typingsSlinky.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.ICodeModel
import typingsSlinky.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import typingsSlinky.atJupyterlabDocregistry.libRegistryMod.IDocumentWidget
import typingsSlinky.atJupyterlabFileeditor.libWidgetMod.FileEditorFactory.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/fileeditor/lib/widget", "FileEditorFactory")
@js.native
class FileEditorFactory_ protected () extends ABCWidgetFactory[IDocumentWidget[FileEditor, IModel], ICodeModel] {
  /**
    * Construct a new editor widget factory.
    */
  def this(options: IOptions) = this()
  var _services: js.Any = js.native
}

