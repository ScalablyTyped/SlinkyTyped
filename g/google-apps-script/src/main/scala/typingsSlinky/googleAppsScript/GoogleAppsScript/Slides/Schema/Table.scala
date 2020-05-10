package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table extends js.Object {
  var columns: js.UndefOr[Double] = js.native
  var horizontalBorderRows: js.UndefOr[js.Array[TableBorderRow]] = js.native
  var rows: js.UndefOr[Double] = js.native
  var tableColumns: js.UndefOr[js.Array[TableColumnProperties]] = js.native
  var tableRows: js.UndefOr[js.Array[TableRow]] = js.native
  var verticalBorderRows: js.UndefOr[js.Array[TableBorderRow]] = js.native
}

object Table {
  @scala.inline
  def apply(): Table = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Table]
  }
  @scala.inline
  implicit class TableOps[Self <: Table] (val x: Self) extends AnyVal {
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
    def withHorizontalBorderRows(value: js.Array[TableBorderRow]): Self = {
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
    def withTableColumns(value: js.Array[TableColumnProperties]): Self = {
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
    def withTableRows(value: js.Array[TableRow]): Self = {
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
    def withVerticalBorderRows(value: js.Array[TableBorderRow]): Self = {
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

