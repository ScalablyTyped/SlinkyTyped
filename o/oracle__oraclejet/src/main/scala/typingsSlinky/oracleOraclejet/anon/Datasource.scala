package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojtableMod.ojTable.ContextStatus
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.edit
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.navigation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Datasource[K, D] extends js.Object {
  var datasource: (DataProvider[K, D]) | Null = js.native
  var mode: edit | navigation = js.native
  var status: ContextStatus[K] = js.native
}

object Datasource {
  @scala.inline
  def apply[K, D](mode: edit | navigation, status: ContextStatus[K]): Datasource[K, D] = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datasource[K, D]]
  }
  @scala.inline
  implicit class DatasourceOps[Self[k, d] <: Datasource[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withMode(value: edit | navigation): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: ContextStatus[K]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatasource(value: DataProvider[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatasourceNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasource")(null)
        ret
    }
  }
  
}

