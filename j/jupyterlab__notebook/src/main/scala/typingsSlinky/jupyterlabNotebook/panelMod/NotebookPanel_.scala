package typingsSlinky.jupyterlabNotebook.panelMod

import typingsSlinky.jupyterlabApputils.sessioncontextMod.ISessionContext
import typingsSlinky.jupyterlabDocregistry.defaultMod.DocumentWidget.IOptions
import typingsSlinky.jupyterlabDocregistry.mod.DocumentWidget
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.Context
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.SaveState
import typingsSlinky.jupyterlabNotebook.modelMod.INotebookModel
import typingsSlinky.jupyterlabNotebook.panelMod.NotebookPanel.IConfig
import typingsSlinky.jupyterlabNotebook.widgetMod.Notebook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/notebook/lib/panel", "NotebookPanel")
@js.native
class NotebookPanel_ protected () extends DocumentWidget[Notebook, INotebookModel] {
  /**
    * Construct a new notebook panel.
    */
  def this(options: IOptions[Notebook, INotebookModel]) = this()
  
  /**
    * Whether we are currently in a series of autorestarts we have already
    * notified the user about.
    */
  var _autorestarting: js.Any = js.native
  
  /**
    * Handle a change in the kernel by updating the document metadata.
    */
  var _onKernelChanged: js.Any = js.native
  
  def _onSave(sender: Context, state: SaveState): Unit = js.native
  
  var _onSessionStatusChanged: js.Any = js.native
  
  /**
    * Update the kernel language.
    */
  var _updateLanguage: js.Any = js.native
  
  /**
    * Update the kernel spec.
    */
  var _updateSpec: js.Any = js.native
  
  /**
    * The notebook used by the widget.
    */
  @JSName("content")
  val content_FNotebookPanel_ : Notebook = js.native
  
  /**
    * The model for the widget.
    */
  def model: INotebookModel | Null = js.native
  
  /**
    * The session context used by the panel.
    */
  def sessionContext: ISessionContext = js.native
  
  /**
    * Update the options for the current notebook panel.
    *
    * @param config new options to set
    */
  def setConfig(config: IConfig): Unit = js.native
}
