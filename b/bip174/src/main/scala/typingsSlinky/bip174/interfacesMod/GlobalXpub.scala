package typingsSlinky.bip174.interfacesMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalXpub extends js.Object {
  var extendedPubkey: Buffer = js.native
  var masterFingerprint: Buffer = js.native
  var path: String = js.native
}

object GlobalXpub {
  @scala.inline
  def apply(extendedPubkey: Buffer, masterFingerprint: Buffer, path: String): GlobalXpub = {
    val __obj = js.Dynamic.literal(extendedPubkey = extendedPubkey.asInstanceOf[js.Any], masterFingerprint = masterFingerprint.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalXpub]
  }
  @scala.inline
  implicit class GlobalXpubOps[Self <: GlobalXpub] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtendedPubkey(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedPubkey")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

