package typingsSlinky.gapiClientSheets.gapi.client.sheets

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotTable extends js.Object {
  /** Each column grouping in the pivot table. */
  var columns: js.UndefOr[js.Array[PivotGroup]] = js.native
  /**
    * An optional mapping of filters per source column offset.
    *
    * The filters are applied before aggregating data into the pivot table.
    * The map's key is the column offset of the source range that you want to
    * filter, and the value is the criteria for that column.
    *
    * For example, if the source was `C10:E15`, a key of `0` will have the filter
    * for column `C`, whereas the key `1` is for column `D`.
    */
  var criteria: js.UndefOr[Record[String, PivotFilterCriteria]] = js.native
  /** Each row grouping in the pivot table. */
  var rows: js.UndefOr[js.Array[PivotGroup]] = js.native
  /** The range the pivot table is reading data from. */
  var source: js.UndefOr[GridRange] = js.native
  /**
    * Whether values should be listed horizontally (as columns)
    * or vertically (as rows).
    */
  var valueLayout: js.UndefOr[String] = js.native
  /** A list of values to include in the pivot table. */
  var values: js.UndefOr[js.Array[PivotValue]] = js.native
}

object PivotTable {
  @scala.inline
  def apply(): PivotTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTable]
  }
  @scala.inline
  implicit class PivotTableOps[Self <: PivotTable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[PivotGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withCriteria(value: Record[String, PivotFilterCriteria]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCriteria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criteria")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: js.Array[PivotGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: GridRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withValueLayout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Array[PivotValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

