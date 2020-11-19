package typingsSlinky.libraCore.accountStateBlobPbMod.AccountStateBlob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsObject extends js.Object {
  
  var blob: js.typedarray.Uint8Array | String = js.native
}
object AsObject {
  
  @scala.inline
  def apply(blob: js.typedarray.Uint8Array | String): AsObject = {
    val __obj = js.Dynamic.literal(blob = blob.asInstanceOf[js.Any])
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
    def setBlobUint8Array(value: js.typedarray.Uint8Array): Self = this.set("blob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlob(value: js.typedarray.Uint8Array | String): Self = this.set("blob", value.asInstanceOf[js.Any])
  }
}
