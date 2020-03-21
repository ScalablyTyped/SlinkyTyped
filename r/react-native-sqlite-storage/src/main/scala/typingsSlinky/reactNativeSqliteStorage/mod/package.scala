package typingsSlinky.reactNativeSqliteStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type StatementCallback = js.Function2[
    /* transaction */ typingsSlinky.reactNativeSqliteStorage.mod.Transaction, 
    /* resultSet */ typingsSlinky.reactNativeSqliteStorage.mod.ResultSet, 
    scala.Unit
  ]
  type StatementErrorCallback = js.Function2[
    /* transaction */ typingsSlinky.reactNativeSqliteStorage.mod.Transaction, 
    /* error */ typingsSlinky.reactNativeSqliteStorage.mod.SQLError, 
    scala.Unit
  ]
  type TransactionCallback = js.Function1[
    /* transaction */ typingsSlinky.reactNativeSqliteStorage.mod.Transaction, 
    scala.Unit
  ]
  type TransactionErrorCallback = js.Function1[/* error */ typingsSlinky.reactNativeSqliteStorage.mod.SQLError, scala.Unit]
}
