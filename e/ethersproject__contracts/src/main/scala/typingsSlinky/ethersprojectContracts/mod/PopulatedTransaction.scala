package typingsSlinky.ethersprojectContracts.mod

import typingsSlinky.ethersprojectBignumber.mod.BigNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopulatedTransaction extends js.Object {
  
  var chainId: js.UndefOr[Double] = js.native
  
  var data: js.UndefOr[String] = js.native
  
  var from: js.UndefOr[String] = js.native
  
  var gasLimit: js.UndefOr[BigNumber] = js.native
  
  var gasPrice: js.UndefOr[BigNumber] = js.native
  
  var nonce: js.UndefOr[Double] = js.native
  
  var to: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[BigNumber] = js.native
}
object PopulatedTransaction {
  
  @scala.inline
  def apply(): PopulatedTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopulatedTransaction]
  }
  
  @scala.inline
  implicit class PopulatedTransactionOps[Self <: PopulatedTransaction] (val x: Self) extends AnyVal {
    
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
    def setChainId(value: Double): Self = this.set("chainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChainId: Self = this.set("chainId", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setGasLimit(value: BigNumber): Self = this.set("gasLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGasLimit: Self = this.set("gasLimit", js.undefined)
    
    @scala.inline
    def setGasPrice(value: BigNumber): Self = this.set("gasPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGasPrice: Self = this.set("gasPrice", js.undefined)
    
    @scala.inline
    def setNonce(value: Double): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    
    @scala.inline
    def setValue(value: BigNumber): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
