package typingsSlinky.reduxOrm.databaseMod

import typingsSlinky.reduxOrm.modelMod.Serializable
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryResult[Row /* <: Record[String, Serializable] */] extends js.Object {
  
  var rows: js.Array[Row] = js.native
}
object QueryResult {
  
  @scala.inline
  def apply[Row /* <: Record[String, Serializable] */](rows: js.Array[Row]): QueryResult[Row] = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult[Row]]
  }
  
  @scala.inline
  implicit class QueryResultOps[Self <: QueryResult[_], Row /* <: Record[String, Serializable] */] (val x: Self with QueryResult[Row]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRowsVarargs(value: Row*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[Row]): Self = this.set("rows", value.asInstanceOf[js.Any])
  }
}
