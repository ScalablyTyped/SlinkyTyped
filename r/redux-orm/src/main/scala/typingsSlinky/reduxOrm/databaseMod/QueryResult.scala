package typingsSlinky.reduxOrm.databaseMod

import typingsSlinky.reduxOrm.modelMod.Serializable
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryResult[Row /* <: Record[String, Serializable] */] extends js.Object {
  var rows: js.Array[Row] = js.native
}

object QueryResult {
  @scala.inline
  def apply[Row](rows: js.Array[Row]): QueryResult[Row] = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult[Row]]
  }
  @scala.inline
  implicit class QueryResultOps[Self[row] <: QueryResult[row], Row] (val x: Self[Row]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Row] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Row]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Row] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Row] with Other]
    @scala.inline
    def withRows(value: js.Array[Row]): Self[Row] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

