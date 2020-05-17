package typingsSlinky.nodeForge.anon

import typingsSlinky.nodeForge.mod.pki.ed25519.NativeBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivateKey extends js.Object {
  var privateKey: NativeBuffer = js.native
  var publicKey: NativeBuffer = js.native
}

object PrivateKey {
  @scala.inline
  def apply(privateKey: NativeBuffer, publicKey: NativeBuffer): PrivateKey = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKey]
  }
  @scala.inline
  implicit class PrivateKeyOps[Self <: PrivateKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrivateKeyUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateKey(value: NativeBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicKeyUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicKey(value: NativeBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

