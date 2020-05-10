package typingsSlinky.jupyterlabNotebook

import typingsSlinky.jupyterlabCells.modelMod.ICellModel
import typingsSlinky.jupyterlabNotebook.jupyterlabNotebookStrings.List
import typingsSlinky.jupyterlabNotebook.modelMod.NotebookModel.IContentFactory
import typingsSlinky.jupyterlabObservables.modeldbMod.IModelDB
import typingsSlinky.jupyterlabObservables.undoablelistMod.IObservableUndoableList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook/lib/celllist", JSImport.Namespace)
@js.native
object celllistMod extends js.Object {
  @js.native
  class CellList protected () extends IObservableUndoableList[ICellModel] {
    /**
      * Construct the cell list.
      */
    def this(modelDB: IModelDB, factory: IContentFactory) = this()
    var _cellMap: js.Any = js.native
    var _cellOrder: js.Any = js.native
    var _changed: js.Any = js.native
    var _factory: js.Any = js.native
    var _isDisposed: js.Any = js.native
    var _onOrderChanged: js.Any = js.native
    /**
      * Test whether the list is empty.
      *
      * @returns `true` if the cell list is empty, `false` otherwise.
      *
      * #### Notes
      * This is a read-only property.
      *
      * #### Complexity
      * Constant.
      *
      * #### Iterator Validity
      * No changes.
      */
    val isEmpty: Boolean = js.native
    @JSName("type")
    var type_CellList: List = js.native
  }
  
}

