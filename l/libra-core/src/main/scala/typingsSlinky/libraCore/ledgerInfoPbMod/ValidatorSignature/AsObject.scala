package typingsSlinky.libraCore.ledgerInfoPbMod.ValidatorSignature

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsObject extends js.Object {
  
  var signature: js.typedarray.Uint8Array | String = js.native
  
  var validatorId: js.typedarray.Uint8Array | String = js.native
}
object AsObject {
  
  @scala.inline
  def apply(signature: js.typedarray.Uint8Array | String, validatorId: js.typedarray.Uint8Array | String): AsObject = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any], validatorId = validatorId.asInstanceOf[js.Any])
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
    def setSignatureUint8Array(value: js.typedarray.Uint8Array): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: js.typedarray.Uint8Array | String): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatorIdUint8Array(value: js.typedarray.Uint8Array): Self = this.set("validatorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatorId(value: js.typedarray.Uint8Array | String): Self = this.set("validatorId", value.asInstanceOf[js.Any])
  }
}
