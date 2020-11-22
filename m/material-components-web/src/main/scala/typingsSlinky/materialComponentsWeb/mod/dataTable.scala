package typingsSlinky.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materialDataTable.adapterMod.MDCDataTableAdapter
import typingsSlinky.materialDataTable.anon.PartialMDCDataTableAdapte
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("material-components-web", "dataTable")
@js.native
object dataTable extends js.Object {
  
  @js.native
  class MDCDataTable ()
    extends typingsSlinky.materialDataTable.mod.MDCDataTable
  /* static members */
  @js.native
  object MDCDataTable extends js.Object {
    
    def attachTo(root: Element): typingsSlinky.materialDataTable.componentMod.MDCDataTable = js.native
  }
  
  @js.native
  class MDCDataTableFoundation ()
    extends typingsSlinky.materialDataTable.mod.MDCDataTableFoundation {
    def this(adapter: PartialMDCDataTableAdapte) = this()
  }
  /* static members */
  @js.native
  object MDCDataTableFoundation extends js.Object {
    
    def defaultAdapter: MDCDataTableAdapter = js.native
  }
  
  @js.native
  object SortValue extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.materialDataTable.constantsMod.SortValue with String] = js.native
    
    /* "ascending" */ val ASCENDING: typingsSlinky.materialDataTable.constantsMod.SortValue.ASCENDING with String = js.native
    
    /* "descending" */ val DESCENDING: typingsSlinky.materialDataTable.constantsMod.SortValue.DESCENDING with String = js.native
    
    /* "none" */ val NONE: typingsSlinky.materialDataTable.constantsMod.SortValue.NONE with String = js.native
    
    /* "other" */ val OTHER: typingsSlinky.materialDataTable.constantsMod.SortValue.OTHER with String = js.native
  }
  
  @js.native
  object attributes extends js.Object {
    
    var ARIA_SELECTED: String = js.native
    
    var ARIA_SORT: String = js.native
  }
  
  @js.native
  object cssClasses extends js.Object {
    
    var CELL: String = js.native
    
    var CELL_NUMERIC: String = js.native
    
    var CONTENT: String = js.native
    
    var HEADER_CELL: String = js.native
    
    var HEADER_CELL_LABEL: String = js.native
    
    var HEADER_CELL_SORTED: String = js.native
    
    var HEADER_CELL_SORTED_DESCENDING: String = js.native
    
    var HEADER_CELL_WITH_SORT: String = js.native
    
    var HEADER_CELL_WRAPPER: String = js.native
    
    var HEADER_ROW: String = js.native
    
    var HEADER_ROW_CHECKBOX: String = js.native
    
    var IN_PROGRESS: String = js.native
    
    var LINEAR_PROGRESS: String = js.native
    
    var PAGINATION_ROWS_PER_PAGE_LABEL: String = js.native
    
    var PAGINATION_ROWS_PER_PAGE_SELECT: String = js.native
    
    var PROGRESS_INDICATOR: String = js.native
    
    var ROOT: String = js.native
    
    var ROW: String = js.native
    
    var ROW_CHECKBOX: String = js.native
    
    var ROW_SELECTED: String = js.native
    
    var SORT_ICON_BUTTON: String = js.native
    
    var SORT_STATUS_LABEL: String = js.native
    
    var TABLE_CONTAINER: String = js.native
  }
  
  @js.native
  object dataAttributes extends js.Object {
    
    var COLUMN_ID: String = js.native
    
    var ROW_ID: String = js.native
  }
  
  @js.native
  object events extends js.Object {
    
    var ROW_SELECTION_CHANGED: String = js.native
    
    var SELECTED_ALL: String = js.native
    
    var SORTED: String = js.native
    
    var UNSELECTED_ALL: String = js.native
  }
  
  @js.native
  object messages extends js.Object {
    
    var SORTED_IN_ASCENDING: String = js.native
    
    var SORTED_IN_DESCENDING: String = js.native
  }
  
  @js.native
  object selectors extends js.Object {
    
    var CONTENT: String = js.native
    
    var HEADER_CELL: String = js.native
    
    var HEADER_CELL_WITH_SORT: String = js.native
    
    var HEADER_ROW: String = js.native
    
    var HEADER_ROW_CHECKBOX: String = js.native
    
    var PROGRESS_INDICATOR: String = js.native
    
    var ROW: String = js.native
    
    var ROW_CHECKBOX: String = js.native
    
    var ROW_SELECTED: String = js.native
    
    var SORT_ICON_BUTTON: String = js.native
    
    var SORT_STATUS_LABEL: String = js.native
  }
  
  @js.native
  object strings extends js.Object {
    
    var ARIA_SELECTED: String = js.native
    
    var ARIA_SORT: String = js.native
    
    var DATA_ROW_ID_ATTR: String = js.native
    
    var HEADER_ROW_CHECKBOX_SELECTOR: String = js.native
    
    var ROW_CHECKBOX_SELECTOR: String = js.native
    
    var ROW_SELECTED_SELECTOR: String = js.native
    
    var ROW_SELECTOR: String = js.native
  }
}
