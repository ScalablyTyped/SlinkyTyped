package typingsSlinky.awsSdk.qldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartTransactionResult extends js.Object {
  
  /**
    * The transaction ID of the started transaction.
    */
  var TransactionId: js.UndefOr[typingsSlinky.awsSdk.qldbsessionMod.TransactionId] = js.native
}
object StartTransactionResult {
  
  @scala.inline
  def apply(): StartTransactionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTransactionResult]
  }
  
  @scala.inline
  implicit class StartTransactionResultOps[Self <: StartTransactionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTransactionId(value: TransactionId): Self = this.set("TransactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionId: Self = this.set("TransactionId", js.undefined)
  }
}
