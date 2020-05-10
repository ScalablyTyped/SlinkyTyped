package typingsSlinky.lovefield.mod.schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database extends js.Object {
  def name(): String = js.native
  def pragma(): DatabasePragma = js.native
  def table(tableName: String): Table = js.native
  def tables(): js.Array[Table] = js.native
  def version(): Double = js.native
}

object Database {
  @scala.inline
  def apply(
    name: () => String,
    pragma: () => DatabasePragma,
    table: String => Table,
    tables: () => js.Array[Table],
    version: () => Double
  ): Database = {
    val __obj = js.Dynamic.literal(name = js.Any.fromFunction0(name), pragma = js.Any.fromFunction0(pragma), table = js.Any.fromFunction1(table), tables = js.Any.fromFunction0(tables), version = js.Any.fromFunction0(version))
    __obj.asInstanceOf[Database]
  }
  @scala.inline
  implicit class DatabaseOps[Self <: Database] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPragma(value: () => DatabasePragma): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pragma")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTable(value: String => Table): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTables(value: () => js.Array[Table]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVersion(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

