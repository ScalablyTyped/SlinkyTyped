package typingsSlinky.libp2pCrypto.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicKey extends js.Object {
  
  val bytes: js.typedarray.Uint8Array = js.native
  
  def equals(key: PublicKey): Boolean = js.native
  
  def hash(): js.Promise[js.typedarray.Uint8Array] = js.native
  
  def marshal(): js.typedarray.Uint8Array = js.native
  
  def verify(data: js.typedarray.Uint8Array, sig: js.typedarray.Uint8Array): js.Promise[Boolean] = js.native
}
object PublicKey {
  
  @scala.inline
  def apply(
    bytes: js.typedarray.Uint8Array,
    equals: PublicKey => Boolean,
    hash: () => js.Promise[js.typedarray.Uint8Array],
    marshal: () => js.typedarray.Uint8Array,
    verify: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.Promise[Boolean]
  ): PublicKey = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], equals = js.Any.fromFunction1(equals), hash = js.Any.fromFunction0(hash), marshal = js.Any.fromFunction0(marshal), verify = js.Any.fromFunction2(verify))
    __obj.asInstanceOf[PublicKey]
  }
  
  @scala.inline
  implicit class PublicKeyOps[Self <: PublicKey] (val x: Self) extends AnyVal {
    
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
    def setBytes(value: js.typedarray.Uint8Array): Self = this.set("bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEquals(value: PublicKey => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHash(value: () => js.Promise[js.typedarray.Uint8Array]): Self = this.set("hash", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMarshal(value: () => js.typedarray.Uint8Array): Self = this.set("marshal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVerify(value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.Promise[Boolean]): Self = this.set("verify", js.Any.fromFunction2(value))
  }
}
