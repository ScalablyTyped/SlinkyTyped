package typingsSlinky.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultSet extends js.Object {
  /**
    * The metadata that describes the column structure and data types of a table of query results.
    */
  var ResultSetMetadata: js.UndefOr[typingsSlinky.awsSdk.athenaMod.ResultSetMetadata] = js.native
  /**
    * The rows in the table.
    */
  var Rows: js.UndefOr[RowList] = js.native
}

object ResultSet {
  @scala.inline
  def apply(): ResultSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultSet]
  }
  @scala.inline
  implicit class ResultSetOps[Self <: ResultSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResultSetMetadata(value: ResultSetMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultSetMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultSetMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultSetMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: RowList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rows")(js.undefined)
        ret
    }
  }
  
}

