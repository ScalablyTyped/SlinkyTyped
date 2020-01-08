package typingsSlinky.atJupyterlabNotebook.atJupyterlabNotebookMod

import typingsSlinky.atJupyterlabDocregistry.libDefaultMod.DocumentWidget.IOptions
import typingsSlinky.atJupyterlabNotebook.libModelMod.INotebookModel
import typingsSlinky.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook", "NotebookPanel")
@js.native
class NotebookPanel protected ()
  extends typingsSlinky.atJupyterlabNotebook.libPanelMod.NotebookPanel {
  /**
    * Construct a new notebook panel.
    */
  def this(options: IOptions[typingsSlinky.atJupyterlabNotebook.libWidgetMod.Notebook, INotebookModel]) = this()
}

@JSImport("@jupyterlab/notebook", "NotebookPanel")
@js.native
object NotebookPanel extends js.Object {
  /**
    * The default implementation of an `IContentFactory`.
    */
  @js.native
  class ContentFactory ()
    extends typingsSlinky.atJupyterlabNotebook.libPanelMod.NotebookPanel.ContentFactory
  
  /**
    * The notebook renderer token.
    */
  val IContentFactory: Token[typingsSlinky.atJupyterlabNotebook.libPanelMod.NotebookPanel.IContentFactory] = js.native
  /**
    * Default content factory for the notebook panel.
    */
  val defaultContentFactory: typingsSlinky.atJupyterlabNotebook.libPanelMod.NotebookPanel.ContentFactory = js.native
}

