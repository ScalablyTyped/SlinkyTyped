package typingsSlinky.jupyterlabFileeditor.widgetMod

import typingsSlinky.jupyterlabDocregistry.mod.ABCWidgetFactory
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.ICodeModel
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsSlinky.jupyterlabDocregistry.registryMod.IDocumentWidget
import typingsSlinky.jupyterlabFileeditor.widgetMod.FileEditorFactory.IOptions
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

