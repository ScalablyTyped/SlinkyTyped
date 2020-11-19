package typingsSlinky.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RollbackTransactionResponse extends js.Object {
  
  /**
    * The status of the rollback operation.
    */
  var transactionStatus: js.UndefOr[TransactionStatus] = js.native
}
object RollbackTransactionResponse {
  
  @scala.inline
  def apply(): RollbackTransactionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollbackTransactionResponse]
  }
  
  @scala.inline
  implicit class RollbackTransactionResponseOps[Self <: RollbackTransactionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTransactionStatus(value: TransactionStatus): Self = this.set("transactionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionStatus: Self = this.set("transactionStatus", js.undefined)
  }
}
