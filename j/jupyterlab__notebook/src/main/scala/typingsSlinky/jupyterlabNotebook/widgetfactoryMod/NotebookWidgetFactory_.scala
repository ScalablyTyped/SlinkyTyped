package typingsSlinky.jupyterlabNotebook.widgetfactoryMod

import typingsSlinky.jupyterlabCodeeditor.mimetypeMod.IEditorMimeTypeService
import typingsSlinky.jupyterlabDocregistry.mod.ABCWidgetFactory
import typingsSlinky.jupyterlabNotebook.modelMod.INotebookModel
import typingsSlinky.jupyterlabNotebook.panelMod.NotebookPanel
import typingsSlinky.jupyterlabNotebook.panelMod.NotebookPanel.IContentFactory
import typingsSlinky.jupyterlabNotebook.widgetMod.StaticNotebook.IEditorConfig
import typingsSlinky.jupyterlabNotebook.widgetMod.StaticNotebook.INotebookConfig
import typingsSlinky.jupyterlabNotebook.widgetfactoryMod.NotebookWidgetFactory.IOptions
import typingsSlinky.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  var _sessionDialogs: js.Any = js.native
  
  /**
    * The content factory used by the widget factory.
    */
  val contentFactory: IContentFactory = js.native
  
  /**
    * A configuration object for cell editor settings.
    */
  def editorConfig: IEditorConfig = js.native
  def editorConfig_=(value: IEditorConfig): Unit = js.native
  
  /**
    * The service used to look up mime types.
    */
  val mimeTypeService: IEditorMimeTypeService = js.native
  
  /**
    * A configuration object for notebook settings.
    */
  def notebookConfig: INotebookConfig = js.native
  def notebookConfig_=(value: INotebookConfig): Unit = js.native
  
  val rendermime: IRenderMimeRegistry = js.native
}
