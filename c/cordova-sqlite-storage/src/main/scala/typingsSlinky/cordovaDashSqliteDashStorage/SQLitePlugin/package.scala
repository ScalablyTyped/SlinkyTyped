package typingsSlinky.cordovaDashSqliteDashStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SQLitePlugin {
  type DatabaseSuccessCallback = js.Function1[/* db */ Database, Unit]
  type ErrorCallback = js.Function1[/* err */ js.Error, Unit]
  type StatementSuccessCallback = js.Function1[/* results */ Results, Unit]
  type SuccessCallback = js.Function0[Unit]
  type TransactionFunction = js.Function1[/* tx */ Transaction, Unit]
  type TransactionStatementErrorCallback = js.Function2[/* tx */ Transaction, /* err */ js.Error, Boolean | Unit]
  type TransactionStatementSuccessCallback = js.Function2[/* tx */ Transaction, /* results */ Results, Unit]
}
