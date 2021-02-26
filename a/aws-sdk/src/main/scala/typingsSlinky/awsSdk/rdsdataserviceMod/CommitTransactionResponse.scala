package typingsSlinky.awsSdk.rdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommitTransactionResponse extends StObject {
  
  /**
    * The status of the commit operation.
    */
  var transactionStatus: js.UndefOr[TransactionStatus] = js.native
}
object CommitTransactionResponse {
  
  @scala.inline
  def apply(): CommitTransactionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitTransactionResponse]
  }
  
  @scala.inline
  implicit class CommitTransactionResponseMutableBuilder[Self <: CommitTransactionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransactionStatus(value: TransactionStatus): Self = StObject.set(x, "transactionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionStatusUndefined: Self = StObject.set(x, "transactionStatus", js.undefined)
  }
}
