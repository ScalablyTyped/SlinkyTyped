package typingsSlinky.reactToolbox.tableCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableCellTheme extends js.Object {
  /**
    * Modifier for the icon in case the order is ascendent.
    */
  var asc: js.UndefOr[String] = js.native
  /**
    * Added to each cell displayed in the head.
    */
  var headCell: js.UndefOr[String] = js.native
  /**
    * Modifier for cells that are numeric.
    */
  var numeric: js.UndefOr[String] = js.native
  /**
    * Added to each cell displayed in the table body.
    */
  var rowCell: js.UndefOr[String] = js.native
  /**
    * Used for the sort icon included in sorted cells.
    */
  var sortIcon: js.UndefOr[String] = js.native
  /**
    * Modifier for cells that are sorted asc or desc.
    */
  var sorted: js.UndefOr[String] = js.native
  /**
    * Applied to the root element of the cell.
    */
  var tableCell: js.UndefOr[String] = js.native
}

object TableCellTheme {
  @scala.inline
  def apply(): TableCellTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellTheme]
  }
  @scala.inline
  implicit class TableCellThemeOps[Self <: TableCellTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asc")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadCell(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headCell")(js.undefined)
        ret
    }
    @scala.inline
    def withNumeric(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumeric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeric")(js.undefined)
        ret
    }
    @scala.inline
    def withRowCell(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCell")(js.undefined)
        ret
    }
    @scala.inline
    def withSortIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withSorted(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSorted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorted")(js.undefined)
        ret
    }
    @scala.inline
    def withTableCell(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCell")(js.undefined)
        ret
    }
  }
  
}

