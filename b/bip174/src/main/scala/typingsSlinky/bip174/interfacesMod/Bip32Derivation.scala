package typingsSlinky.bip174.interfacesMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bip32Derivation extends js.Object {
  var masterFingerprint: Buffer = js.native
  var path: String = js.native
  var pubkey: Buffer = js.native
}

object Bip32Derivation {
  @scala.inline
  def apply(masterFingerprint: Buffer, path: String, pubkey: Buffer): Bip32Derivation = {
    val __obj = js.Dynamic.literal(masterFingerprint = masterFingerprint.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pubkey = pubkey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bip32Derivation]
  }
  @scala.inline
  implicit class Bip32DerivationOps[Self <: Bip32Derivation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMasterFingerprint(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterFingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPubkey(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubkey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

