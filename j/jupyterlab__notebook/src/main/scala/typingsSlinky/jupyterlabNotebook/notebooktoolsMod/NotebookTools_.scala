package typingsSlinky.jupyterlabNotebook.notebooktoolsMod

import typingsSlinky.jupyterlabCells.mod.Cell
import typingsSlinky.jupyterlabNotebook.notebooktoolsMod.NotebookTools.IOptions
import typingsSlinky.jupyterlabNotebook.panelMod.NotebookPanel
import typingsSlinky.jupyterlabNotebook.tokensMod.INotebookTools
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/notebook/lib/notebooktools", "NotebookTools")
@js.native
class NotebookTools_ protected () extends INotebookTools {
  /**
    * Construct a new NotebookTools object.
    */
  def this(options: IOptions) = this()
  
  var _advancedTools: js.Any = js.native
  
  var _commonTools: js.Any = js.native
  
  /**
    * Handle a change to the active cell.
    */
  var _onActiveCellChanged: js.Any = js.native
  
  /**
    * Handle a change in the notebook model metadata.
    */
  var _onActiveCellMetadataChanged: js.Any = js.native
  
  /**
    * Handle a change to the notebook panel.
    */
  var _onActiveNotebookPanelChanged: js.Any = js.native
  
  /**
    * Handle a change in the active cell metadata.
    */
  var _onActiveNotebookPanelMetadataChanged: js.Any = js.native
  
  /**
    * Handle a change in the selection.
    */
  var _onSelectionChanged: js.Any = js.native
  
  var _prevActiveCell: js.Any = js.native
  
  var _prevActiveNotebookModel: js.Any = js.native
  
  var _toolChildren: js.Any = js.native
  
  var _tracker: js.Any = js.native
  
  /**
    * The active cell widget.
    */
  @JSName("activeCell")
  def activeCell_MNotebookTools_ : Cell | Null = js.native
  
  /**
    * The current notebook.
    */
  @JSName("activeNotebookPanel")
  def activeNotebookPanel_MNotebookTools_ : NotebookPanel | Null = js.native
  
  /**
    * The currently selected cells.
    */
  @JSName("selectedCells")
  def selectedCells_MNotebookTools_ : js.Array[Cell] = js.native
}
