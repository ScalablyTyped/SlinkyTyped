package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.deferred
import typingsSlinky.electron.electronStrings.failed
import typingsSlinky.electron.electronStrings.purchased
import typingsSlinky.electron.electronStrings.purchasing
import typingsSlinky.electron.electronStrings.restored
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/transaction
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
    * The transaction state, can be purchasing, purchased, failed, restored or
    * deferred.
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
  implicit class TransactionOps[Self <: Transaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalTransactionIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalTransactionIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayment(value: Payment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactionDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactionIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactionState(value: purchasing | purchased | failed | restored | deferred): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

