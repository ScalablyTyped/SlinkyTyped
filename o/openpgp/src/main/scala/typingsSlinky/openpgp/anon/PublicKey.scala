package typingsSlinky.openpgp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicKey extends js.Object {
  var publicKey: typingsSlinky.openpgp.mod.key.Key = js.native
  var publicKeyArmored: String = js.native
}

object PublicKey {
  @scala.inline
  def apply(publicKey: typingsSlinky.openpgp.mod.key.Key, publicKeyArmored: String): PublicKey = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any], publicKeyArmored = publicKeyArmored.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKey]
  }
  @scala.inline
  implicit class PublicKeyOps[Self <: PublicKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPublicKey(value: typingsSlinky.openpgp.mod.key.Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicKeyArmored(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKeyArmored")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

