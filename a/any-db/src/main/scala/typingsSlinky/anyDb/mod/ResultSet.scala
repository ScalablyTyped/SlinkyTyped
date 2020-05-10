package typingsSlinky.anyDb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultSet extends js.Object {
  /**
    * Not supported by all drivers.
    */
  var affectedRows: js.UndefOr[Double] = js.native
  /**
    * Not supported by all drivers.
    */
  var changedRows: js.UndefOr[Double] = js.native
  /**
    * Not supported by all drivers.
    */
  var fieldCount: js.UndefOr[Double] = js.native
  /**
    * Result field descriptions
    */
  var fields: js.Array[Field] = js.native
  /**
    * Not supported by all drivers.
    */
  var lastInsertId: js.UndefOr[js.Any] = js.native
  /**
    * Affected rows. Note e.g. for INSERT queries the rows property is not filled even
    * though rowCount is non-zero.
    */
  var rowCount: Double = js.native
  /**
    * Result rows
    */
  var rows: js.Array[_] = js.native
}

object ResultSet {
  @scala.inline
  def apply(fields: js.Array[Field], rowCount: Double, rows: js.Array[_]): ResultSet = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultSet]
  }
  @scala.inline
  implicit class ResultSetOps[Self <: ResultSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: js.Array[Field]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAffectedRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affectedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAffectedRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affectedRows")(js.undefined)
        ret
    }
    @scala.inline
    def withChangedRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangedRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedRows")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldCount")(js.undefined)
        ret
    }
    @scala.inline
    def withLastInsertId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastInsertId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastInsertId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastInsertId")(js.undefined)
        ret
    }
  }
  
}

