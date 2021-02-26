package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.deferred
import typingsSlinky.electron.electronStrings.failed
import typingsSlinky.electron.electronStrings.purchased
import typingsSlinky.electron.electronStrings.purchasing
import typingsSlinky.electron.electronStrings.restored
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transaction extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/transaction
  /**
    * The error code if an error occurred while processing the transaction.
    */
  var errorCode: Double = js.native
  
  /**
    * The error message if an error occurred while processing the transaction.
    */
  var errorMessage: String = js.native
  
  /**
    * The identifier of the restored transaction by the App Store.
    */
  var originalTransactionIdentifier: String = js.native
  
  var payment: Payment = js.native
  
  /**
    * The date the transaction was added to the App Store’s payment queue.
    */
  var transactionDate: String = js.native
  
  /**
    * A string that uniquely identifies a successful payment transaction.
    */
  var transactionIdentifier: String = js.native
  
  /**
    * The transaction state, can be `purchasing`, `purchased`, `failed`, `restored` or
    * `deferred`.
    */
  var transactionState: purchasing | purchased | failed | restored | deferred = js.native
}
object Transaction {
  
  @scala.inline
  def apply(
    errorCode: Double,
    errorMessage: String,
    originalTransactionIdentifier: String,
    payment: Payment,
    transactionDate: String,
    transactionIdentifier: String,
    transactionState: purchasing | purchased | failed | restored | deferred
  ): Transaction = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], originalTransactionIdentifier = originalTransactionIdentifier.asInstanceOf[js.Any], payment = payment.asInstanceOf[js.Any], transactionDate = transactionDate.asInstanceOf[js.Any], transactionIdentifier = transactionIdentifier.asInstanceOf[js.Any], transactionState = transactionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
  
  @scala.inline
  implicit class TransactionMutableBuilder[Self <: Transaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalTransactionIdentifier(value: String): Self = StObject.set(x, "originalTransactionIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment(value: Payment): Self = StObject.set(x, "payment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionDate(value: String): Self = StObject.set(x, "transactionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionIdentifier(value: String): Self = StObject.set(x, "transactionIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionState(value: purchasing | purchased | failed | restored | deferred): Self = StObject.set(x, "transactionState", value.asInstanceOf[js.Any])
  }
}
