package typingsSlinky.parquetjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Columns extends js.Object {
  var columns: js.Any = js.native
  var num_rows: Double = js.native
  var sorting_columns: Null | js.Array[String] = js.native
  var total_byte_size: Double = js.native
}

object Columns {
  @scala.inline
  def apply(columns: js.Any, num_rows: Double, total_byte_size: Double): Columns = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], num_rows = num_rows.asInstanceOf[js.Any], total_byte_size = total_byte_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
  @scala.inline
  implicit class ColumnsOps[Self <: Columns] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNum_rows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_byte_size(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_byte_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSorting_columns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorting_columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSorting_columnsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorting_columns")(null)
        ret
    }
  }
  
}

