package typingsSlinky.reactDataGrid.AdazzleReactDataGrid

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a specific column to be rendered.
  */
@js.native
trait Column[T] extends StObject {
  
  /**
    * A class name to be applied to the cells in the column
    */
  var cellClass: js.UndefOr[String] = js.native
  
  /**
    * Whether this column can be dragged (re-arranged).
    * @default false
    */
  var draggable: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether this column can be edited.
    * @default false
    */
  var editable: js.UndefOr[Boolean] = js.native
  
  /**
    * The editor for this column. Several editors are available in "react-data-grid/addons".
    * @default A simple text editor
    */
  var editor: js.UndefOr[ReactElement | ReactComponentClass[EditorBaseProps]] = js.native
  
  /**
    * Events to be bound to the cells in this specific column.
    * Each event must respect this standard in order to work correctly:
    * @example
    * function onXxx(ev :SyntheticEvent, (rowIdx, idx, name): args)
    */
  var events: js.UndefOr[StringDictionary[ColumnEventCallback]] = js.native
  
  /**
    * A custom formatter for this column's filter.
    */
  var filterRenderer: js.UndefOr[ReactElement | ReactComponentClass[_]] = js.native
  
  /**
    * Whether the rows in the grid can be filtered by this column.
    * @default false
    */
  var filterable: js.UndefOr[Boolean] = js.native
  
  /**
    * A custom read-only formatter for this column. An image formatter is available in "react-data-grid/addons".
    */
  var formatter: js.UndefOr[ReactElement | ReactComponentClass[_]] = js.native
  
  /**
    * Retrieve meta data about the row, optionally provide column as a second argument
    */
  var getRowMetaData: js.UndefOr[js.Function2[/* rowdata */ T, /* column */ js.UndefOr[Column[T]], _]] = js.native
  
  /**
    * A custom formatter for this column's header.
    */
  var headerRenderer: js.UndefOr[ReactElement | ReactComponentClass[_]] = js.native
  
  /**
    * A unique key for this column. Required.
    * Each row should have a property with this name, which contains this column's value.
    */
  var key: String = js.native
  
  /**
    * Whether this column should stay fixed on the left as the user scrolls horizontally.
    * @default false
    */
  var locked: js.UndefOr[Boolean] = js.native
  
  /**
    * This column's display name. Required.
    */
  var name: String = js.native
  
  /**
    * Whether this column can be resized by the user.
    * @default false
    */
  var resizable: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the rows in the grid can be sorted by this column.
    * @default false
    */
  var sortable: js.UndefOr[Boolean] = js.native
  
  /**
    * A custom width for this specific column.
    * @default minColumnWidth from the ReactDataGrid
    */
  var width: js.UndefOr[Double] = js.native
}
object Column {
  
  @scala.inline
  def apply[T](key: String, name: String): Column[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column[T]]
  }
  
  @scala.inline
  implicit class ColumnMutableBuilder[Self <: Column[_], T] (val x: Self with Column[T]) extends AnyVal {
    
    @scala.inline
    def setCellClass(value: String): Self = StObject.set(x, "cellClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellClassUndefined: Self = StObject.set(x, "cellClass", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    @scala.inline
    def setEditor(value: ReactElement | ReactComponentClass[EditorBaseProps]): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorComponentClass(value: ReactComponentClass[EditorBaseProps]): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorFunctionComponent(value: ReactComponentClass[EditorBaseProps]): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorReactElement(value: ReactElement): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    @scala.inline
    def setEvents(value: StringDictionary[ColumnEventCallback]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setFilterRenderer(value: ReactElement | ReactComponentClass[_]): Self = StObject.set(x, "filterRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterRendererComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "filterRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterRendererFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "filterRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterRendererReactElement(value: ReactElement): Self = StObject.set(x, "filterRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterRendererUndefined: Self = StObject.set(x, "filterRenderer", js.undefined)
    
    @scala.inline
    def setFilterable(value: Boolean): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
    
    @scala.inline
    def setFormatter(value: ReactElement | ReactComponentClass[_]): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatterComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatterFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatterReactElement(value: ReactElement): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    @scala.inline
    def setGetRowMetaData(value: (/* rowdata */ T, /* column */ js.UndefOr[Column[T]]) => _): Self = StObject.set(x, "getRowMetaData", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetRowMetaDataUndefined: Self = StObject.set(x, "getRowMetaData", js.undefined)
    
    @scala.inline
    def setHeaderRenderer(value: ReactElement | ReactComponentClass[_]): Self = StObject.set(x, "headerRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderRendererComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "headerRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderRendererFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "headerRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderRendererReactElement(value: ReactElement): Self = StObject.set(x, "headerRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderRendererUndefined: Self = StObject.set(x, "headerRenderer", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
    
    @scala.inline
    def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
