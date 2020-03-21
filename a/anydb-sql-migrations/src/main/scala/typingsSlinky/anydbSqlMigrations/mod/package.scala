package typingsSlinky.anydbSqlMigrations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type MigFn = js.Function1[
    /* tx */ typingsSlinky.anydbSql.mod.Transaction, 
    typingsSlinky.bluebird.mod.^[js.Any]
  ]
}
