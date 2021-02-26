package typingsSlinky.sawtoothSdk.protobufMod

import typingsSlinky.sawtoothSdk.protobufMod.ClientBatchStatus.IInvalidTransaction
import typingsSlinky.sawtoothSdk.protobufMod.ClientBatchStatus.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientBatchStatus extends StObject {
  
  /** ClientBatchStatus batchId */
  var batchId: js.UndefOr[String | Null] = js.native
  
  /** ClientBatchStatus invalidTransactions */
  var invalidTransactions: js.UndefOr[js.Array[IInvalidTransaction] | Null] = js.native
  
  /** ClientBatchStatus status */
  var status: js.UndefOr[Status | Null] = js.native
}
object IClientBatchStatus {
  
  @scala.inline
  def apply(): IClientBatchStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBatchStatus]
  }
  
  @scala.inline
  implicit class IClientBatchStatusMutableBuilder[Self <: IClientBatchStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchId(value: String): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIdNull: Self = StObject.set(x, "batchId", null)
    
    @scala.inline
    def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    @scala.inline
    def setInvalidTransactions(value: js.Array[IInvalidTransaction]): Self = StObject.set(x, "invalidTransactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidTransactionsNull: Self = StObject.set(x, "invalidTransactions", null)
    
    @scala.inline
    def setInvalidTransactionsUndefined: Self = StObject.set(x, "invalidTransactions", js.undefined)
    
    @scala.inline
    def setInvalidTransactionsVarargs(value: IInvalidTransaction*): Self = StObject.set(x, "invalidTransactions", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
