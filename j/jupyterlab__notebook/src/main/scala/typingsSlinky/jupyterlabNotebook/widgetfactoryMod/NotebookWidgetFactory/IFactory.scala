package typingsSlinky.jupyterlabNotebook.widgetfactoryMod.NotebookWidgetFactory

import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactory
import typingsSlinky.jupyterlabNotebook.modelMod.INotebookModel
import typingsSlinky.jupyterlabNotebook.panelMod.NotebookPanel
import typingsSlinky.jupyterlabNotebook.widgetMod.StaticNotebook.IEditorConfig
import typingsSlinky.jupyterlabNotebook.widgetMod.StaticNotebook.INotebookConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for a notebook widget factory.
  */
@js.native
trait IFactory extends IWidgetFactory[NotebookPanel, INotebookModel] {
  
  /**
    * A configuration object for cell editor settings.
    */
  var editorConfig: IEditorConfig = js.native
  
  /**
    * A configuration object for notebook settings.
    */
  var notebookConfig: INotebookConfig = js.native
  
  /**
    * Whether the kernel should be shutdown when the widget is closed.
    */
  @JSName("shutdownOnClose")
  var shutdownOnClose_IFactory: Boolean = js.native
}
