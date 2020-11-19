package typingsSlinky.libraCore.transactionInfoPbMod.TransactionInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsObject extends js.Object {
  
  var eventRootHash: js.typedarray.Uint8Array | String = js.native
  
  var gasUsed: String = js.native
  
  var signedTransactionHash: js.typedarray.Uint8Array | String = js.native
  
  var stateRootHash: js.typedarray.Uint8Array | String = js.native
}
object AsObject {
  
  @scala.inline
  def apply(
    eventRootHash: js.typedarray.Uint8Array | String,
    gasUsed: String,
    signedTransactionHash: js.typedarray.Uint8Array | String,
    stateRootHash: js.typedarray.Uint8Array | String
  ): AsObject = {
    val __obj = js.Dynamic.literal(eventRootHash = eventRootHash.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], signedTransactionHash = signedTransactionHash.asInstanceOf[js.Any], stateRootHash = stateRootHash.asInstanceOf[js.Any])
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
    def setEventRootHashUint8Array(value: js.typedarray.Uint8Array): Self = this.set("eventRootHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventRootHash(value: js.typedarray.Uint8Array | String): Self = this.set("eventRootHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGasUsed(value: String): Self = this.set("gasUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedTransactionHashUint8Array(value: js.typedarray.Uint8Array): Self = this.set("signedTransactionHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedTransactionHash(value: js.typedarray.Uint8Array | String): Self = this.set("signedTransactionHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateRootHashUint8Array(value: js.typedarray.Uint8Array): Self = this.set("stateRootHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateRootHash(value: js.typedarray.Uint8Array | String): Self = this.set("stateRootHash", value.asInstanceOf[js.Any])
  }
}
