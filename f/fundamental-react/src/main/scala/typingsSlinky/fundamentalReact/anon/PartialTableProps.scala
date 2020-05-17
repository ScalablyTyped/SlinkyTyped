package typingsSlinky.fundamentalReact.anon

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/Table/Table.TableProps> */
@js.native
trait PartialTableProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var disableStyles: js.UndefOr[Boolean] = js.native
  var headers: js.UndefOr[js.Array[String | TagMod[Any]]] = js.native
  var tableBodyClassName: js.UndefOr[String] = js.native
  var tableBodyProps: js.UndefOr[js.Any] = js.native
  var tableBodyRowProps: js.UndefOr[
    StringDictionary[js.Any] | (js.Function2[/* rowData */ js.Array[String], /* index */ Double, Unit])
  ] = js.native
  var tableCellClassName: js.UndefOr[String] = js.native
  var tableData: js.UndefOr[js.Array[RowData]] = js.native
  var tableHeaderClassName: js.UndefOr[String] = js.native
  var tableHeaderProps: js.UndefOr[js.Any] = js.native
  var tableHeaderRowClassName: js.UndefOr[String] = js.native
  var tableHeaderRowProps: js.UndefOr[js.Any] = js.native
  var tableRowClassName: js.UndefOr[String] = js.native
}

object PartialTableProps {
  @scala.inline
  def apply(): PartialTableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTableProps]
  }
  @scala.inline
  implicit class PartialTablePropsOps[Self <: PartialTableProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableStyles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Array[String | TagMod[Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withTableBodyClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableBodyClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableBodyClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableBodyClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withTableBodyProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableBodyProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableBodyProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableBodyProps")(js.undefined)
        ret
    }
    @scala.inline
    def withTableBodyRowPropsFunction2(value: (/* rowData */ js.Array[String], /* index */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableBodyRowProps")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTableBodyRowProps(
      value: StringDictionary[js.Any] | (js.Function2[/* rowData */ js.Array[String], /* index */ Double, Unit])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableBodyRowProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableBodyRowProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableBodyRowProps")(js.undefined)
        ret
    }
    @scala.inline
    def withTableCellClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCellClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableCellClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCellClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withTableData(value: js.Array[RowData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableData")(js.undefined)
        ret
    }
    @scala.inline
    def withTableHeaderClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeaderClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableHeaderClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeaderClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withTableHeaderProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeaderProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableHeaderProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeaderProps")(js.undefined)
        ret
    }
    @scala.inline
    def withTableHeaderRowClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeaderRowClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableHeaderRowClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeaderRowClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withTableHeaderRowProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeaderRowProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableHeaderRowProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeaderRowProps")(js.undefined)
        ret
    }
    @scala.inline
    def withTableRowClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRowClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableRowClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRowClassName")(js.undefined)
        ret
    }
  }
  
}

