package typingsSlinky.mendixmodelsdk.transactionManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/sdk/internal/deltas/TransactionManager", "Transaction")
@js.native
class Transaction protected () extends js.Object {
  def this(transactionType: TransactionType, transactionManager: TransactionManager) = this()
  
  var checkTransaction: js.Any = js.native
  
  def commit(): Unit = js.native
  
  def rollback(): Unit = js.native
  
  var transactionManager: js.Any = js.native
  
  val transactionType: TransactionType = js.native
}
