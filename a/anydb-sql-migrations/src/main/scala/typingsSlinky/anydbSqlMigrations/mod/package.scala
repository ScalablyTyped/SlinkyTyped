package typingsSlinky.anydbSqlMigrations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type MigFn = js.Function1[
    /* tx */ typingsSlinky.anydbSql.mod.Transaction, 
    typingsSlinky.bluebird.mod.^[js.Any]
  ]
}
