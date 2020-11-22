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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/notebook/lib/default-toolbar", JSImport.Namespace)
@js.native
object defaultToolbarMod extends js.Object {
  
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
    def createCellTypeItem(panel: NotebookPanel): Widget = js.native
    
    /**
      * Create a copy toolbar item.
      */
    def createCopyButton(panel: NotebookPanel): Widget = js.native
    
    /**
      * Create a cut toolbar item.
      */
    def createCutButton(panel: NotebookPanel): Widget = js.native
    
    /**
      * Create an insert toolbar item.
      */
    def createInsertButton(panel: NotebookPanel): Widget = js.native
    
    /**
      * Create a paste toolbar item.
      */
    def createPasteButton(panel: NotebookPanel): Widget = js.native
    
    /**
      * Create a restart run all toolbar item
      */
    def createRestartRunAllButton(panel: NotebookPanel): Widget = js.native
    def createRestartRunAllButton(panel: NotebookPanel, dialogs: IDialogs): Widget = js.native
    
    /**
      * Create a run toolbar item.
      */
    def createRunButton(panel: NotebookPanel): Widget = js.native
    
    /**
      * Create save button toolbar item.
      */
    def createSaveButton(panel: NotebookPanel): Widget = js.native
    
    /**
      * Get the default toolbar items for panel
      */
    def getDefaultItems(panel: NotebookPanel): js.Array[IToolbarItem] = js.native
    def getDefaultItems(panel: NotebookPanel, sessionDialogs: ISessionContextDialogs): js.Array[IToolbarItem] = js.native
  }
}
