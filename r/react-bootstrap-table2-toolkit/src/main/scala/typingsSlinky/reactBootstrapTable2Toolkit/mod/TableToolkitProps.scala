package typingsSlinky.reactBootstrapTable2Toolkit.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactBootstrapTableNext.mod.ColumnDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableToolkitProps[T /* <: js.Object */] extends js.Object {
  var bootstrap4: js.UndefOr[Boolean] = js.native
  var columns: js.Array[ColumnDescription[T, _]] = js.native
  var data: js.Array[T] = js.native
  var exportCSV: js.UndefOr[Boolean | CSVProps] = js.native
  var keyField: /* keyof T */ String = js.native
  var ref: js.UndefOr[js.Any] = js.native
  var search: js.UndefOr[TableSearchProps[T] | Boolean] = js.native
  def children(props: ToolkitContextType): ReactElement = js.native
}

object TableToolkitProps {
  @scala.inline
  def apply[T](
    children: ToolkitContextType => ReactElement,
    columns: js.Array[ColumnDescription[T, _]],
    data: js.Array[T],
    keyField: /* keyof T */ String
  ): TableToolkitProps[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], keyField = keyField.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableToolkitProps[T]]
  }
  @scala.inline
  implicit class TableToolkitPropsOps[Self[t] <: TableToolkitProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withChildren(value: ToolkitContextType => ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[ColumnDescription[T, _]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyField(value: /* keyof T */ String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBootstrap4(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrap4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBootstrap4: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrap4")(js.undefined)
        ret
    }
    @scala.inline
    def withExportCSV(value: Boolean | CSVProps): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportCSV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportCSV: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportCSV")(js.undefined)
        ret
    }
    @scala.inline
    def withRef(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRef: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch(value: TableSearchProps[T] | Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
        ret
    }
  }
  
}

