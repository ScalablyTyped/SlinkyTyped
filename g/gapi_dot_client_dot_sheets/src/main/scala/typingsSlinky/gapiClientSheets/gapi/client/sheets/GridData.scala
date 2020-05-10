package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridData extends js.Object {
  /**
    * Metadata about the requested columns in the grid, starting with the column
    * in start_column.
    */
  var columnMetadata: js.UndefOr[js.Array[DimensionProperties]] = js.native
  /**
    * The data in the grid, one entry per row,
    * starting with the row in startRow.
    * The values in RowData will correspond to columns starting
    * at start_column.
    */
  var rowData: js.UndefOr[js.Array[RowData]] = js.native
  /**
    * Metadata about the requested rows in the grid, starting with the row
    * in start_row.
    */
  var rowMetadata: js.UndefOr[js.Array[DimensionProperties]] = js.native
  /** The first column this GridData refers to, zero-based. */
  var startColumn: js.UndefOr[Double] = js.native
  /** The first row this GridData refers to, zero-based. */
  var startRow: js.UndefOr[Double] = js.native
}

object GridData {
  @scala.inline
  def apply(): GridData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridData]
  }
  @scala.inline
  implicit class GridDataOps[Self <: GridData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnMetadata(value: js.Array[DimensionProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withRowData(value: js.Array[RowData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowData")(js.undefined)
        ret
    }
    @scala.inline
    def withRowMetadata(value: js.Array[DimensionProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withStartColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withStartRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRow")(js.undefined)
        ret
    }
  }
  
}

