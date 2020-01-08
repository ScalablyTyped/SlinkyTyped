package typingsSlinky.atJupyterlabNotebook.atJupyterlabNotebookMod

import typingsSlinky.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.IToolbarItem
import typingsSlinky.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook", "ToolbarItems")
@js.native
object ToolbarItems extends js.Object {
  /**
    * Create a cell type switcher item.
    *
    * #### Notes
    * It will display the type of the current active cell.
    * If more than one cell is selected but are of different types,
    * it will display `'-'`.
    * When the user changes the cell type, it will change the
    * cell types of the selected cells.
    * It can handle a change to the context.
    */
  def createCellTypeItem(panel: typingsSlinky.atJupyterlabNotebook.libPanelMod.NotebookPanel): Widget = js.native
  /**
    * Create a copy toolbar item.
    */
  def createCopyButton(panel: typingsSlinky.atJupyterlabNotebook.libPanelMod.NotebookPanel): Widget = js.native
  /**
    * Create a cut toolbar item.
    */
  def createCutButton(panel: typingsSlinky.atJupyterlabNotebook.libPanelMod.NotebookPanel): Widget = js.native
  /**
    * Create an insert toolbar item.
    */
  def createInsertButton(panel: typingsSlinky.atJupyterlabNotebook.libPanelMod.NotebookPanel): Widget = js.native
  /**
    * Create a paste toolbar item.
    */
  def createPasteButton(panel: typingsSlinky.atJupyterlabNotebook.libPanelMod.NotebookPanel): Widget = js.native
  /**
    * Create a run toolbar item.
    */
  def createRunButton(panel: typingsSlinky.atJupyterlabNotebook.libPanelMod.NotebookPanel): Widget = js.native
  /**
    * Create save button toolbar item.
    */
  def createSaveButton(panel: typingsSlinky.atJupyterlabNotebook.libPanelMod.NotebookPanel): Widget = js.native
  /**
    * Get the default toolbar items for panel
    */
  def getDefaultItems(panel: typingsSlinky.atJupyterlabNotebook.libPanelMod.NotebookPanel): js.Array[IToolbarItem] = js.native
}

