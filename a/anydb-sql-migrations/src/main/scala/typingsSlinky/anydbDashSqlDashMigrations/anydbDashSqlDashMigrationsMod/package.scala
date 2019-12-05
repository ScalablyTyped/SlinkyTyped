package typingsSlinky.anydbDashSqlDashMigrations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object anydbDashSqlDashMigrationsMod {
  import typingsSlinky.anydbDashSql.anydbDashSqlMod.Transaction
  import typingsSlinky.bluebird.bluebirdMod.^

  type MigFn = js.Function1[/* tx */ Transaction, ^[js.Any]]
}
