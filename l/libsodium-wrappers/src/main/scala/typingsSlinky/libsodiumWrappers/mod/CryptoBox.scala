package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CryptoBox extends js.Object {
  
  var ciphertext: js.typedarray.Uint8Array = js.native
  
  var mac: js.typedarray.Uint8Array = js.native
}
object CryptoBox {
  
  @scala.inline
  def apply(ciphertext: js.typedarray.Uint8Array, mac: js.typedarray.Uint8Array): CryptoBox = {
    val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoBox]
  }
  
  @scala.inline
  implicit class CryptoBoxOps[Self <: CryptoBox] (val x: Self) extends AnyVal {
    
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
    def setCiphertext(value: js.typedarray.Uint8Array): Self = this.set("ciphertext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMac(value: js.typedarray.Uint8Array): Self = this.set("mac", value.asInstanceOf[js.Any])
  }
}
