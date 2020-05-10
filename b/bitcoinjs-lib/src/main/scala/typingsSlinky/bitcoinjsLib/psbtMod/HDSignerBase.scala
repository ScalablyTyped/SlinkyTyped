package typingsSlinky.bitcoinjsLib.psbtMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HDSignerBase extends js.Object {
  /**
    * The first 4 bytes of the sha256-ripemd160 of the publicKey
    */
  var fingerprint: Buffer = js.native
  /**
    * DER format compressed publicKey buffer
    */
  var publicKey: Buffer = js.native
}

object HDSignerBase {
  @scala.inline
  def apply(fingerprint: Buffer, publicKey: Buffer): HDSignerBase = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HDSignerBase]
  }
  @scala.inline
  implicit class HDSignerBaseOps[Self <: HDSignerBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFingerprint(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicKey(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

