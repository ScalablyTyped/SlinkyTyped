package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A PageElement kind representing a table.
  */
@js.native
trait SchemaTable extends js.Object {
  /**
    * Number of columns in the table.
    */
  var columns: js.UndefOr[Double] = js.native
  /**
    * Properties of horizontal cell borders.  A table&#39;s horizontal cell
    * borders are represented as a grid. The grid has one more row than the
    * number of rows in the table and the same number of columns as the table.
    * For example, if the table is 3 x 3, its horizontal borders will be
    * represented as a grid with 4 rows and 3 columns.
    */
  var horizontalBorderRows: js.UndefOr[js.Array[SchemaTableBorderRow]] = js.native
  /**
    * Number of rows in the table.
    */
  var rows: js.UndefOr[Double] = js.native
  /**
    * Properties of each column.
    */
  var tableColumns: js.UndefOr[js.Array[SchemaTableColumnProperties]] = js.native
  /**
    * Properties and contents of each row.  Cells that span multiple rows are
    * contained in only one of these rows and have a row_span greater than 1.
    */
  var tableRows: js.UndefOr[js.Array[SchemaTableRow]] = js.native
  /**
    * Properties of vertical cell borders.  A table&#39;s vertical cell borders
    * are represented as a grid. The grid has the same number of rows as the
    * table and one more column than the number of columns in the table. For
    * example, if the table is 3 x 3, its vertical borders will be represented
    * as a grid with 3 rows and 4 columns.
    */
  var verticalBorderRows: js.UndefOr[js.Array[SchemaTableBorderRow]] = js.native
}

object SchemaTable {
  @scala.inline
  def apply(): SchemaTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTable]
  }
  @scala.inline
  implicit class SchemaTableOps[Self <: SchemaTable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: Double): Self = {
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
    def withHorizontalBorderRows(value: js.Array[SchemaTableBorderRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalBorderRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalBorderRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalBorderRows")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: Double): Self = {
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
    def withTableColumns(value: js.Array[SchemaTableColumnProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withTableRows(value: js.Array[SchemaTableRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRows")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalBorderRows(value: js.Array[SchemaTableBorderRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalBorderRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalBorderRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalBorderRows")(js.undefined)
        ret
    }
  }
  
}

