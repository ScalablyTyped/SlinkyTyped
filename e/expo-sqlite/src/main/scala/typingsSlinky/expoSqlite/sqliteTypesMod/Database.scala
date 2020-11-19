package typingsSlinky.expoSqlite.sqliteTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Database extends js.Object {
  
  def readTransaction(callback: SQLTransactionCallback): Unit = js.native
  def readTransaction(
    callback: SQLTransactionCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    successCallback: SQLVoidCallback
  ): Unit = js.native
  def readTransaction(callback: SQLTransactionCallback, errorCallback: SQLTransactionErrorCallback): Unit = js.native
  def readTransaction(
    callback: SQLTransactionCallback,
    errorCallback: SQLTransactionErrorCallback,
    successCallback: SQLVoidCallback
  ): Unit = js.native
  
  def transaction(callback: SQLTransactionCallback): Unit = js.native
  def transaction(
    callback: SQLTransactionCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    successCallback: SQLVoidCallback
  ): Unit = js.native
  def transaction(callback: SQLTransactionCallback, errorCallback: SQLTransactionErrorCallback): Unit = js.native
  def transaction(
    callback: SQLTransactionCallback,
    errorCallback: SQLTransactionErrorCallback,
    successCallback: SQLVoidCallback
  ): Unit = js.native
  
  var version: String = js.native
}
