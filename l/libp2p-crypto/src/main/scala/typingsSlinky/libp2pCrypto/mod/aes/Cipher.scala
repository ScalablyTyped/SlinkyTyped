package typingsSlinky.libp2pCrypto.mod.aes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AES Cipher in CTR mode.
  */
@js.native
trait Cipher extends js.Object {
  
  def decrypt(data: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = js.native
  
  def encrypt(data: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = js.native
}
object Cipher {
  
  @scala.inline
  def apply(
    decrypt: js.typedarray.Uint8Array => js.Promise[js.typedarray.Uint8Array],
    encrypt: js.typedarray.Uint8Array => js.Promise[js.typedarray.Uint8Array]
  ): Cipher = {
    val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction1(decrypt), encrypt = js.Any.fromFunction1(encrypt))
    __obj.asInstanceOf[Cipher]
  }
  
  @scala.inline
  implicit class CipherOps[Self <: Cipher] (val x: Self) extends AnyVal {
    
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
    def setDecrypt(value: js.typedarray.Uint8Array => js.Promise[js.typedarray.Uint8Array]): Self = this.set("decrypt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncrypt(value: js.typedarray.Uint8Array => js.Promise[js.typedarray.Uint8Array]): Self = this.set("encrypt", js.Any.fromFunction1(value))
  }
}
