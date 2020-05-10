package typingsSlinky.azureKustoData.mod.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KustoResponseDataSetV2[T] extends KustoResponseDataSet[T] {
  var version: String = js.native
  def getCridColumn(): String = js.native
  def getErrorColumn(): String = js.native
  def getStatusColumn(): String = js.native
}

object KustoResponseDataSetV2 {
  @scala.inline
  def apply[T](
    getCridColumn: () => String,
    getErrorColumn: () => String,
    getStatusColumn: () => String,
    primaryResults: js.Array[KustoResultTable[T]],
    statusTable: KustoResultTable[T],
    tableNames: js.Array[String],
    tables: js.Array[KustoResultTable[T]],
    version: String
  ): KustoResponseDataSetV2[T] = {
    val __obj = js.Dynamic.literal(getCridColumn = js.Any.fromFunction0(getCridColumn), getErrorColumn = js.Any.fromFunction0(getErrorColumn), getStatusColumn = js.Any.fromFunction0(getStatusColumn), primaryResults = primaryResults.asInstanceOf[js.Any], statusTable = statusTable.asInstanceOf[js.Any], tableNames = tableNames.asInstanceOf[js.Any], tables = tables.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[KustoResponseDataSetV2[T]]
  }
  @scala.inline
  implicit class KustoResponseDataSetV2Ops[Self[t] <: KustoResponseDataSetV2[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGetCridColumn(value: () => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCridColumn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetErrorColumn(value: () => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getErrorColumn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStatusColumn(value: () => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStatusColumn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVersion(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

