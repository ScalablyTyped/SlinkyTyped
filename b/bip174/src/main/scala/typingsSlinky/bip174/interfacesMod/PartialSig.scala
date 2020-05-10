package typingsSlinky.bip174.interfacesMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartialSig extends js.Object {
  var pubkey: Buffer = js.native
  var signature: Buffer = js.native
}

object PartialSig {
  @scala.inline
  def apply(pubkey: Buffer, signature: Buffer): PartialSig = {
    val __obj = js.Dynamic.literal(pubkey = pubkey.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSig]
  }
  @scala.inline
  implicit class PartialSigOps[Self <: PartialSig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPubkey(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubkey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignature(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

