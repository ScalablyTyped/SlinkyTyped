package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridResultSet extends js.Object {
  var columns: js.Array[IDbColumn] = js.native
  var numberOfRows: Double = js.native
  var rowsUri: String = js.native
}

object IGridResultSet {
  @scala.inline
  def apply(columns: js.Array[IDbColumn], numberOfRows: Double, rowsUri: String): IGridResultSet = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], numberOfRows = numberOfRows.asInstanceOf[js.Any], rowsUri = rowsUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridResultSet]
  }
  @scala.inline
  implicit class IGridResultSetOps[Self <: IGridResultSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[IDbColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowsUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsUri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

