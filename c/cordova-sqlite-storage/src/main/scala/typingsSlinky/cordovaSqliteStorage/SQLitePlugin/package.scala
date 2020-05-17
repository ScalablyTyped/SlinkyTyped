package typingsSlinky.cordovaSqliteStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SQLitePlugin {
  type DatabaseSuccessCallback = js.Function1[/* db */ typingsSlinky.cordovaSqliteStorage.SQLitePlugin.Database, scala.Unit]
  type ErrorCallback = js.Function1[/* err */ js.Error, scala.Unit]
  type StatementSuccessCallback = js.Function1[/* results */ typingsSlinky.cordovaSqliteStorage.SQLitePlugin.Results, scala.Unit]
  type SuccessCallback = js.Function0[scala.Unit]
  type TransactionFunction = js.Function1[/* tx */ typingsSlinky.cordovaSqliteStorage.SQLitePlugin.Transaction, scala.Unit]
  type TransactionStatementErrorCallback = js.Function2[
    /* tx */ typingsSlinky.cordovaSqliteStorage.SQLitePlugin.Transaction, 
    /* err */ js.Error, 
    scala.Boolean | scala.Unit
  ]
  type TransactionStatementSuccessCallback = js.Function2[
    /* tx */ typingsSlinky.cordovaSqliteStorage.SQLitePlugin.Transaction, 
    /* results */ typingsSlinky.cordovaSqliteStorage.SQLitePlugin.Results, 
    scala.Unit
  ]
}
