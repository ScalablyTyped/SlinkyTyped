package typingsSlinky.cordovaSqliteStorage.SQLitePlugin

import typingsSlinky.cordovaSqliteStorage.anon.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Results extends js.Object {
  var insertId: js.UndefOr[Double] = js.native
  var rows: Item = js.native
  var rowsAffected: Double = js.native
}

object Results {
  @scala.inline
  def apply(rows: Item, rowsAffected: Double): Results = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any], rowsAffected = rowsAffected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results]
  }
  @scala.inline
  implicit class ResultsOps[Self <: Results] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRows(value: Item): Self = {
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
    @scala.inline
    def withInsertId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertId")(js.undefined)
        ret
    }
  }
  
}

