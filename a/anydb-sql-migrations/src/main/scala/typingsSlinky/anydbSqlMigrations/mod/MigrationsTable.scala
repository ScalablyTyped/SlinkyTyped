package typingsSlinky.anydbSqlMigrations.mod

import typingsSlinky.anydbSql.mod.Column
import typingsSlinky.anydbSql.mod.Table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MigrationsTable extends Table[Migration] {
  
  var version: Column[String] = js.native
}
