package typingsSlinky.ipfsCore.anon

import typingsSlinky.libp2pCrypto.mod.aes.Cipher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofaes extends js.Object {
  
  /**
    * Create a new AES Cipher.
    * @param key The key, if length 16 then AES 128 is used. For length 32, AES 256 is used.
    * @param iv Must have length 16.
    */
  def create(key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array): js.Promise[Cipher] = js.native
}
object Typeofaes {
  
  @scala.inline
  def apply(create: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.Promise[Cipher]): Typeofaes = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create))
    __obj.asInstanceOf[Typeofaes]
  }
  
  @scala.inline
  implicit class TypeofaesOps[Self <: Typeofaes] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.Promise[Cipher]): Self = this.set("create", js.Any.fromFunction2(value))
  }
}
