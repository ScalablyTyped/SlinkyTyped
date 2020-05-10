package typingsSlinky.jupyterlabNotebook.modelfactoryMod

import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModelFactory
import typingsSlinky.jupyterlabNotebook.modelMod.INotebookModel
import typingsSlinky.jupyterlabNotebook.modelMod.NotebookModel.IContentFactory
import typingsSlinky.jupyterlabNotebook.modelfactoryMod.NotebookModelFactory.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook/lib/modelfactory", "NotebookModelFactory")
@js.native
class NotebookModelFactory_ protected () extends IModelFactory[INotebookModel] {
  /**
    * Construct a new notebook model factory.
    */
  def this(options: IOptions) = this()
  var _disposed: js.Any = js.native
  /**
    * The content model factory used by the NotebookModelFactory.
    */
  val contentFactory: IContentFactory = js.native
}

