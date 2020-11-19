package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CryptoKX extends js.Object {
  
  var sharedRx: js.typedarray.Uint8Array = js.native
  
  var sharedTx: js.typedarray.Uint8Array = js.native
}
object CryptoKX {
  
  @scala.inline
  def apply(sharedRx: js.typedarray.Uint8Array, sharedTx: js.typedarray.Uint8Array): CryptoKX = {
    val __obj = js.Dynamic.literal(sharedRx = sharedRx.asInstanceOf[js.Any], sharedTx = sharedTx.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKX]
  }
  
  @scala.inline
  implicit class CryptoKXOps[Self <: CryptoKX] (val x: Self) extends AnyVal {
    
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
    def setSharedRx(value: js.typedarray.Uint8Array): Self = this.set("sharedRx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedTx(value: js.typedarray.Uint8Array): Self = this.set("sharedTx", value.asInstanceOf[js.Any])
  }
}
