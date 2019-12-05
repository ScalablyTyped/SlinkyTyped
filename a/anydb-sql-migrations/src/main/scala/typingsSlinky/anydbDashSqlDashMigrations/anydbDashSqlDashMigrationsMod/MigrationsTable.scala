package typingsSlinky.anydbDashSqlDashMigrations.anydbDashSqlDashMigrationsMod

import typingsSlinky.anydbDashSql.anydbDashSqlMod.Column
import typingsSlinky.anydbDashSql.anydbDashSqlMod.Table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationsTable extends Table[Migration] {
  var version: Column[String] = js.native
}

