package typingsSlinky.nodeForge

import typingsSlinky.nodeForge.mod.pki.ed25519.BinaryBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPrivateKeyBinaryBuffer extends js.Object {
  var privateKey: BinaryBuffer = js.native
}

object AnonPrivateKeyBinaryBuffer {
  @scala.inline
  def apply(privateKey: BinaryBuffer): AnonPrivateKeyBinaryBuffer = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrivateKeyBinaryBuffer]
  }
  @scala.inline
  implicit class AnonPrivateKeyBinaryBufferOps[Self <: AnonPrivateKeyBinaryBuffer] (val x: Self) extends AnyVal {
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
    def withPrivateKey(value: BinaryBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

