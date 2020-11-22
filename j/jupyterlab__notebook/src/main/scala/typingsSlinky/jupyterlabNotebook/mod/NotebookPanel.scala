package typingsSlinky.jupyterlabNotebook.mod

import typingsSlinky.jupyterlabDocregistry.defaultMod.DocumentWidget.IOptions
import typingsSlinky.jupyterlabNotebook.modelMod.INotebookModel
import typingsSlinky.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/notebook", "NotebookPanel")
@js.native
class NotebookPanel protected ()
  extends typingsSlinky.jupyterlabNotebook.panelMod.NotebookPanel {
  /**
    * Construct a new notebook panel.
    */
  def this(options: IOptions[typingsSlinky.jupyterlabNotebook.widgetMod.Notebook, INotebookModel]) = this()
}
@JSImport("@jupyterlab/notebook", "NotebookPanel")
@js.native
object NotebookPanel extends js.Object {
  
  /**
    * The notebook renderer token.
    */
  val IContentFactory: Token[typingsSlinky.jupyterlabNotebook.panelMod.NotebookPanel.IContentFactory] = js.native
  
  /**
    * Default content factory for the notebook panel.
    */
  val defaultContentFactory: typingsSlinky.jupyterlabNotebook.panelMod.NotebookPanel.ContentFactory = js.native
  
  /**
    * The default implementation of an `IContentFactory`.
    */
  @js.native
  class ContentFactory ()
    extends typingsSlinky.jupyterlabNotebook.panelMod.NotebookPanel.ContentFactory
}
