package typingsSlinky.azureKustoData.mod.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KustoResponseDataSet[T] extends js.Object {
  var primaryResults: js.Array[KustoResultTable[T]] = js.native
  var statusTable: KustoResultTable[T] = js.native
  var tableNames: js.Array[String] = js.native
  var tables: js.Array[KustoResultTable[T]] = js.native
}

object KustoResponseDataSet {
  @scala.inline
  def apply[T](
    primaryResults: js.Array[KustoResultTable[T]],
    statusTable: KustoResultTable[T],
    tableNames: js.Array[String],
    tables: js.Array[KustoResultTable[T]]
  ): KustoResponseDataSet[T] = {
    val __obj = js.Dynamic.literal(primaryResults = primaryResults.asInstanceOf[js.Any], statusTable = statusTable.asInstanceOf[js.Any], tableNames = tableNames.asInstanceOf[js.Any], tables = tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[KustoResponseDataSet[T]]
  }
  @scala.inline
  implicit class KustoResponseDataSetOps[Self[t] <: KustoResponseDataSet[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withPrimaryResults(value: js.Array[KustoResultTable[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusTable(value: KustoResultTable[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableNames(value: js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTables(value: js.Array[KustoResultTable[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

