package typingsSlinky.reactBootstrapTable2Toolkit.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactBootstrapTableNext.mod.ColumnDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableToolkitProps[T /* <: js.Object */] extends js.Object {
  var bootstrap4: js.UndefOr[Boolean] = js.undefined
  var columns: js.Array[ColumnDescription[T, _]]
  var data: js.Array[T]
  var exportCSV: js.UndefOr[Boolean | CSVProps] = js.undefined
  var keyField: /* keyof T */ String
  var ref: js.UndefOr[js.Any] = js.undefined
  var search: js.UndefOr[TableSearchProps[T] | Boolean] = js.undefined
  def children(props: ToolkitContextType): ReactElement
}

object TableToolkitProps {
  @scala.inline
  def apply[T](
    children: ToolkitContextType => ReactElement,
    columns: js.Array[ColumnDescription[T, _]],
    data: js.Array[T],
    keyField: /* keyof T */ String,
    bootstrap4: js.UndefOr[Boolean] = js.undefined,
    exportCSV: Boolean | CSVProps = null,
    ref: js.Any = null,
    search: TableSearchProps[T] | Boolean = null
  ): TableToolkitProps[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], keyField = keyField.asInstanceOf[js.Any])
    if (!js.isUndefined(bootstrap4)) __obj.updateDynamic("bootstrap4")(bootstrap4.get.asInstanceOf[js.Any])
    if (exportCSV != null) __obj.updateDynamic("exportCSV")(exportCSV.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableToolkitProps[T]]
  }
}

