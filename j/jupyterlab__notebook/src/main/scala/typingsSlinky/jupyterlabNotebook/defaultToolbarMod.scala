package typingsSlinky.jupyterlabNotebook

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLSelectElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.jupyterlabApputils.mod.ReactWidget
import typingsSlinky.jupyterlabApputils.sessioncontextMod.ISessionContext.IDialogs
import typingsSlinky.jupyterlabApputils.tokensMod.ISessionContextDialogs
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IToolbarItem
import typingsSlinky.jupyterlabNotebook.panelMod.NotebookPanel
import typingsSlinky.jupyterlabNotebook.widgetMod.Notebook
import typingsSlinky.luminoWidgets.mod.Widget
import typingsSlinky.react.mod.ChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultToolbarMod {
  
  @JSImport("@jupyterlab/notebook/lib/default-toolbar", "CellTypeSwitcher")
  @js.native
  class CellTypeSwitcher protected () extends ReactWidget {
    /**
      * Construct a new cell type switcher.
      */
    def this(widget: Notebook) = this()
    
    var _notebook: js.Any = js.native
    
    /**
      * Handle `change` events for the HTMLSelect component.
      */
    def handleChange(event: ChangeEvent[HTMLSelectElement]): Unit = js.native
    
    /**
      * Handle `keydown` events for the HTMLSelect component.
      */
    def handleKeyDown(event: SyntheticKeyboardEvent[Element]): Unit = js.native
  }
  
  object ToolbarItems {
    
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
    @JSImport("@jupyterlab/notebook/lib/default-toolbar", "ToolbarItems.createCellTypeItem")
    @js.native
    def createCellTypeItem(panel: NotebookPanel): Widget = js.native
    
    /**
      * Create a copy toolbar item.
      */
    @JSImport("@jupyterlab/notebook/lib/default-toolbar", "ToolbarItems.createCopyButton")
    @js.native
    def createCopyButton(panel: NotebookPanel): Widget = js.native
    
    /**
      * Create a cut toolbar item.
      */
    @JSImport("@jupyterlab/notebook/lib/default-toolbar", "ToolbarItems.createCutButton")
    @js.native
    def createCutButton(panel: NotebookPanel): Widget = js.native
    
    /**
      * Create an insert toolbar item.
      */
    @JSImport("@jupyterlab/notebook/lib/default-toolbar", "ToolbarItems.createInsertButton")
    @js.native
    def createInsertButton(panel: NotebookPanel): Widget = js.native
    
    /**
      * Create a paste toolbar item.
      */
    @JSImport("@jupyterlab/notebook/lib/default-toolbar", "ToolbarItems.createPasteButton")
    @js.native
    def createPasteButton(panel: NotebookPanel): Widget = js.native
    
    /**
      * Create a restart run all toolbar item
      */
    @JSImport("@jupyterlab/notebook/lib/default-toolbar", "ToolbarItems.createRestartRunAllButton")
    @js.native
    def createRestartRunAllButton(panel: NotebookPanel): Widget = js.native
    @JSImport("@jupyterlab/notebook/lib/default-toolbar", "ToolbarItems.createRestartRunAllButton")
    @js.native
    def createRestartRunAllButton(panel: NotebookPanel, dialogs: IDialogs): Widget = js.native
    
    /**
      * Create a run toolbar item.
      */
    @JSImport("@jupyterlab/notebook/lib/default-toolbar", "ToolbarItems.createRunButton")
    @js.native
    def createRunButton(panel: NotebookPanel): Widget = js.native
    
    /**
      * Create save button toolbar item.
      */
    @JSImport("@jupyterlab/notebook/lib/default-toolbar", "ToolbarItems.createSaveButton")
    @js.native
    def createSaveButton(panel: NotebookPanel): Widget = js.native
    
    /**
      * Get the default toolbar items for panel
      */
    @JSImport("@jupyterlab/notebook/lib/default-toolbar", "ToolbarItems.getDefaultItems")
    @js.native
    def getDefaultItems(panel: NotebookPanel): js.Array[IToolbarItem] = js.native
    @JSImport("@jupyterlab/notebook/lib/default-toolbar", "ToolbarItems.getDefaultItems")
    @js.native
    def getDefaultItems(panel: NotebookPanel, sessionDialogs: ISessionContextDialogs): js.Array[IToolbarItem] = js.native
  }
}
