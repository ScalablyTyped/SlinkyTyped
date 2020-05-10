package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon22[K, D] extends js.Object {
  var datasource: (DataProvider[K, D]) | Null = js.native
}

object Anon22 {
  @scala.inline
  def apply[K, D](): Anon22[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Anon22[K, D]]
  }
  @scala.inline
  implicit class Anon22Ops[Self[k, d] <: Anon22[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
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

