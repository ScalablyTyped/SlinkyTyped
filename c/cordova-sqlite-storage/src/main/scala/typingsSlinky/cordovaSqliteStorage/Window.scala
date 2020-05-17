package typingsSlinky.cordovaSqliteStorage

import typingsSlinky.cordovaSqliteStorage.SQLitePlugin.SQLite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var sqlitePlugin: SQLite = js.native
}

object Window {
  @scala.inline
  def apply(sqlitePlugin: SQLite): Window = {
    val __obj = js.Dynamic.literal(sqlitePlugin = sqlitePlugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSqlitePlugin(value: SQLite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqlitePlugin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

