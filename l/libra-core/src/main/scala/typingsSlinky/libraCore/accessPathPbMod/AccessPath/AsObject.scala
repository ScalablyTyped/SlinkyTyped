package typingsSlinky.libraCore.accessPathPbMod.AccessPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsObject extends js.Object {
  
  var address: js.typedarray.Uint8Array | String = js.native
  
  var path: js.typedarray.Uint8Array | String = js.native
}
object AsObject {
  
  @scala.inline
  def apply(address: js.typedarray.Uint8Array | String, path: js.typedarray.Uint8Array | String): AsObject = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
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
    def setPathUint8Array(value: js.typedarray.Uint8Array): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: js.typedarray.Uint8Array | String): Self = this.set("path", value.asInstanceOf[js.Any])
  }
}
