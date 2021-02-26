package typingsSlinky.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionStatusHistory extends StObject {
  
  var amount: String = js.native
  
  var status: TransactionStatus = js.native
  
  var timestamp: js.Date = js.native
  
  var transactionsource: TransactionSource = js.native
  
  var user: String = js.native
}
object TransactionStatusHistory {
  
  @scala.inline
  def apply(
    amount: String,
    status: TransactionStatus,
    timestamp: js.Date,
    transactionsource: TransactionSource,
    user: String
  ): TransactionStatusHistory = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], transactionsource = transactionsource.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionStatusHistory]
  }
  
  @scala.inline
  implicit class TransactionStatusHistoryMutableBuilder[Self <: TransactionStatusHistory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: TransactionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionsource(value: TransactionSource): Self = StObject.set(x, "transactionsource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
