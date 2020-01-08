package typingsSlinky.atJupyterlabNotebook.libWidgetfactoryMod

import typingsSlinky.atJupyterlabCodeeditor.libMimetypeMod.IEditorMimeTypeService
import typingsSlinky.atJupyterlabDocregistry.atJupyterlabDocregistryMod.ABCWidgetFactory
import typingsSlinky.atJupyterlabNotebook.libModelMod.INotebookModel
import typingsSlinky.atJupyterlabNotebook.libPanelMod.NotebookPanel
import typingsSlinky.atJupyterlabNotebook.libPanelMod.NotebookPanel.IContentFactory
import typingsSlinky.atJupyterlabNotebook.libWidgetMod.StaticNotebook.IEditorConfig
import typingsSlinky.atJupyterlabNotebook.libWidgetMod.StaticNotebook.INotebookConfig
import typingsSlinky.atJupyterlabNotebook.libWidgetfactoryMod.NotebookWidgetFactory.IOptions
import typingsSlinky.atJupyterlabRendermime.libTokensMod.IRenderMimeRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook/lib/widgetfactory", "NotebookWidgetFactory")
@js.native
class NotebookWidgetFactory_ protected () extends ABCWidgetFactory[NotebookPanel, INotebookModel] {
  /**
    * Construct a new notebook widget factory.
    *
    * @param options - The options used to construct the factory.
    */
  def this(options: IOptions[NotebookPanel]) = this()
  var _editorConfig: js.Any = js.native
  var _notebookConfig: js.Any = js.native
  /**
    * The content factory used by the widget factory.
    */
  val contentFactory: IContentFactory = js.native
  /**
    * A configuration object for cell editor settings.
    */
  var editorConfig: IEditorConfig = js.native
  /**
    * The service used to look up mime types.
    */
  val mimeTypeService: IEditorMimeTypeService = js.native
  /**
    * A configuration object for notebook settings.
    */
  var notebookConfig: INotebookConfig = js.native
  val rendermime: IRenderMimeRegistry = js.native
}

