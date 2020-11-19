package typingsSlinky.libraCore.proofPbMod.AccountStateProof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsObject extends js.Object {
  
  var ledgerInfoToTransactionInfoProof: js.UndefOr[typingsSlinky.libraCore.proofPbMod.AccumulatorProof.AsObject] = js.native
  
  var transactionInfo: js.UndefOr[typingsSlinky.libraCore.transactionInfoPbMod.TransactionInfo.AsObject] = js.native
  
  var transactionInfoToAccountProof: js.UndefOr[typingsSlinky.libraCore.proofPbMod.SparseMerkleProof.AsObject] = js.native
}
object AsObject {
  
  @scala.inline
  def apply(): AsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsObject]
  }
  
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    
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
    def setLedgerInfoToTransactionInfoProof(value: typingsSlinky.libraCore.proofPbMod.AccumulatorProof.AsObject): Self = this.set("ledgerInfoToTransactionInfoProof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLedgerInfoToTransactionInfoProof: Self = this.set("ledgerInfoToTransactionInfoProof", js.undefined)
    
    @scala.inline
    def setTransactionInfo(value: typingsSlinky.libraCore.transactionInfoPbMod.TransactionInfo.AsObject): Self = this.set("transactionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionInfo: Self = this.set("transactionInfo", js.undefined)
    
    @scala.inline
    def setTransactionInfoToAccountProof(value: typingsSlinky.libraCore.proofPbMod.SparseMerkleProof.AsObject): Self = this.set("transactionInfoToAccountProof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionInfoToAccountProof: Self = this.set("transactionInfoToAccountProof", js.undefined)
  }
}
