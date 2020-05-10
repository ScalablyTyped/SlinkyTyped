package typingsSlinky.reactNativeSqliteStorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultSet extends js.Object {
  var insertId: Double = js.native
  var rows: ResultSetRowList = js.native
  var rowsAffected: Double = js.native
}

object ResultSet {
  @scala.inline
  def apply(insertId: Double, rows: ResultSetRowList, rowsAffected: Double): ResultSet = {
    val __obj = js.Dynamic.literal(insertId = insertId.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], rowsAffected = rowsAffected.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultSet]
  }
  @scala.inline
  implicit class ResultSetOps[Self <: ResultSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsertId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: ResultSetRowList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowsAffected(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsAffected")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

