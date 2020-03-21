package typingsSlinky.expoSqlite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sqliteTypesMod {
  type DatabaseCallback = js.Function1[/* database */ typingsSlinky.expoSqlite.sqliteTypesMod.Database, scala.Unit]
  type SQLStatementCallback = js.Function2[
    /* transaction */ typingsSlinky.expoSqlite.sqliteTypesMod.SQLTransaction, 
    /* resultSet */ typingsSlinky.expoSqlite.sqliteTypesMod.SQLResultSet, 
    scala.Unit
  ]
  type SQLStatementErrorCallback = js.Function2[
    /* transaction */ typingsSlinky.expoSqlite.sqliteTypesMod.SQLTransaction, 
    /* error */ typingsSlinky.expoSqlite.sqliteTypesMod.SQLError, 
    scala.Boolean
  ]
  type SQLTransactionCallback = js.Function1[
    /* transaction */ typingsSlinky.expoSqlite.sqliteTypesMod.SQLTransaction, 
    scala.Unit
  ]
  type SQLTransactionErrorCallback = js.Function1[/* error */ typingsSlinky.expoSqlite.sqliteTypesMod.SQLError, scala.Unit]
  type SQLVoidCallback = js.Function0[scala.Unit]
  type SQLiteCallback = js.Function2[
    /* error */ js.UndefOr[js.Error | scala.Null], 
    /* resultSet */ js.UndefOr[
      js.Array[
        typingsSlinky.expoSqlite.sqliteTypesMod.ResultSetError | typingsSlinky.expoSqlite.sqliteTypesMod.ResultSet
      ]
    ], 
    scala.Unit
  ]
}
