package typingsSlinky.reduxOrm.databaseMod

import typingsSlinky.reduxOrm.modelMod.Serializable
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResult[Row /* <: Record[String, Serializable] */] extends js.Object {
  var rows: js.Array[Row]
}

object QueryResult {
  @scala.inline
  def apply[Row](rows: js.Array[Row]): QueryResult[Row] = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult[Row]]
  }
}

