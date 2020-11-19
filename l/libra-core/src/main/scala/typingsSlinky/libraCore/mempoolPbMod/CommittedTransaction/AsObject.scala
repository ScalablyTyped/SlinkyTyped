package typingsSlinky.libraCore.mempoolPbMod.CommittedTransaction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsObject extends js.Object {
  
  var isRejected: Boolean = js.native
  
  var sender: js.typedarray.Uint8Array | String = js.native
  
  var sequenceNumber: String = js.native
}
object AsObject {
  
  @scala.inline
  def apply(isRejected: Boolean, sender: js.typedarray.Uint8Array | String, sequenceNumber: String): AsObject = {
    val __obj = js.Dynamic.literal(isRejected = isRejected.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any])
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
    def setIsRejected(value: Boolean): Self = this.set("isRejected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderUint8Array(value: js.typedarray.Uint8Array): Self = this.set("sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender(value: js.typedarray.Uint8Array | String): Self = this.set("sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceNumber(value: String): Self = this.set("sequenceNumber", value.asInstanceOf[js.Any])
  }
}
