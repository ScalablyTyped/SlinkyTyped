package typingsSlinky.anydbSqlMigrations.mod

import typingsSlinky.anydbSql.mod.AnydbSql
import typingsSlinky.anydbSqlMigrations.anon.Check
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("anydb-sql-migrations", "create")
@js.native
object create extends js.Object {
  def apply(db: AnydbSql, tasks: String): Check = js.native
  def apply(db: AnydbSql, tasks: js.Array[MigrationTask]): Check = js.native
}

