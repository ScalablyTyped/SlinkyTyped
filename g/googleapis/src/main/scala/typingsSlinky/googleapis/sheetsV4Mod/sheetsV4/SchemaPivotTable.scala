package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A pivot table.
  */
@js.native
trait SchemaPivotTable extends js.Object {
  /**
    * Each column grouping in the pivot table.
    */
  var columns: js.UndefOr[js.Array[SchemaPivotGroup]] = js.native
  /**
    * An optional mapping of filters per source column offset.  The filters are
    * applied before aggregating data into the pivot table. The map&#39;s key
    * is the column offset of the source range that you want to filter, and the
    * value is the criteria for that column.  For example, if the source was
    * `C10:E15`, a key of `0` will have the filter for column `C`, whereas the
    * key `1` is for column `D`.
    */
  var criteria: js.UndefOr[StringDictionary[SchemaPivotFilterCriteria]] = js.native
  /**
    * Each row grouping in the pivot table.
    */
  var rows: js.UndefOr[js.Array[SchemaPivotGroup]] = js.native
  /**
    * The range the pivot table is reading data from.
    */
  var source: js.UndefOr[SchemaGridRange] = js.native
  /**
    * Whether values should be listed horizontally (as columns) or vertically
    * (as rows).
    */
  var valueLayout: js.UndefOr[String] = js.native
  /**
    * A list of values to include in the pivot table.
    */
  var values: js.UndefOr[js.Array[SchemaPivotValue]] = js.native
}

object SchemaPivotTable {
  @scala.inline
  def apply(): SchemaPivotTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPivotTable]
  }
  @scala.inline
  implicit class SchemaPivotTableOps[Self <: SchemaPivotTable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[SchemaPivotGroup]): Self = {
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
    def withCriteria(value: StringDictionary[SchemaPivotFilterCriteria]): Self = {
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
    def withRows(value: js.Array[SchemaPivotGroup]): Self = {
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
    def withSource(value: SchemaGridRange): Self = {
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
    def withValues(value: js.Array[SchemaPivotValue]): Self = {
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

