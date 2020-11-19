package typingsSlinky.libraCore.transactionPbMod.AccountState

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsObject extends js.Object {
  
  var address: js.typedarray.Uint8Array | String = js.native
  
  var blob: js.typedarray.Uint8Array | String = js.native
}
object AsObject {
  
  @scala.inline
  def apply(address: js.typedarray.Uint8Array | String, blob: js.typedarray.Uint8Array | String): AsObject = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], blob = blob.asInstanceOf[js.Any])
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
    def setAddressUint8Array(value: js.typedarray.Uint8Array): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress(value: js.typedarray.Uint8Array | String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlobUint8Array(value: js.typedarray.Uint8Array): Self = this.set("blob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlob(value: js.typedarray.Uint8Array | String): Self = this.set("blob", value.asInstanceOf[js.Any])
  }
}
