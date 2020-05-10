package typingsSlinky.pouchdbAdapterWebsql.PouchDB.Core

import typingsSlinky.pouchdbAdapterWebsql.pouchdbAdapterWebsqlStrings.`UTF-16`
import typingsSlinky.pouchdbAdapterWebsql.pouchdbAdapterWebsqlStrings.`UTF-8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseInfo extends js.Object {
  var sqlite_plugin: js.UndefOr[Boolean] = js.native
  var websql_encoding: js.UndefOr[`UTF-8` | `UTF-16`] = js.native
}

object DatabaseInfo {
  @scala.inline
  def apply(): DatabaseInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseInfo]
  }
  @scala.inline
  implicit class DatabaseInfoOps[Self <: DatabaseInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSqlite_plugin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqlite_plugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSqlite_plugin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqlite_plugin")(js.undefined)
        ret
    }
    @scala.inline
    def withWebsql_encoding(value: `UTF-8` | `UTF-16`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websql_encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsql_encoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websql_encoding")(js.undefined)
        ret
    }
  }
  
}

