package typingsSlinky.reactDataGrid.AdazzleReactDataGrid

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a specific column to be rendered.
  */
@js.native
trait Column[T] extends js.Object {
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
  implicit class ColumnOps[Self[t] <: Column[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withKey(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellClass(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellClass: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withEditable(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditable: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorReactElement(value: ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditorFunctionComponent(value: ReactComponentClass[EditorBaseProps]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditorComponentClass(value: ReactComponentClass[EditorBaseProps]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditor(value: ReactElement | ReactComponentClass[EditorBaseProps]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditor: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: StringDictionary[ColumnEventCallback]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterRendererReactElement(value: ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterRendererFunctionComponent(value: ReactComponentClass[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterRendererComponentClass(value: ReactComponentClass[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterRenderer(value: ReactElement | ReactComponentClass[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterRenderer: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterable(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterable: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterable")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatterReactElement(value: ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatterFunctionComponent(value: ReactComponentClass[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatterComponentClass(value: ReactComponentClass[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatter(value: ReactElement | ReactComponentClass[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRowMetaData(value: (/* rowdata */ T, /* column */ js.UndefOr[Column[T]]) => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowMetaData")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetRowMetaData: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowMetaData")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderRendererReactElement(value: ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderRendererFunctionComponent(value: ReactComponentClass[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderRendererComponentClass(value: ReactComponentClass[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderRenderer(value: ReactElement | ReactComponentClass[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderRenderer: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withLocked(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocked: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(js.undefined)
        ret
    }
    @scala.inline
    def withResizable(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizable: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(js.undefined)
        ret
    }
    @scala.inline
    def withSortable(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortable: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortable")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

