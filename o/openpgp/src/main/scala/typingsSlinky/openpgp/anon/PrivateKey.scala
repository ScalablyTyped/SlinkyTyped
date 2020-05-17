package typingsSlinky.openpgp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivateKey extends js.Object {
  var privateKey: typingsSlinky.openpgp.mod.key.Key = js.native
  var privateKeyArmored: String = js.native
  var publicKey: typingsSlinky.openpgp.mod.key.Key = js.native
  var publicKeyArmored: String = js.native
}

object PrivateKey {
  @scala.inline
  def apply(
    privateKey: typingsSlinky.openpgp.mod.key.Key,
    privateKeyArmored: String,
    publicKey: typingsSlinky.openpgp.mod.key.Key,
    publicKeyArmored: String
  ): PrivateKey = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], privateKeyArmored = privateKeyArmored.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], publicKeyArmored = publicKeyArmored.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKey]
  }
  @scala.inline
  implicit class PrivateKeyOps[Self <: PrivateKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrivateKey(value: typingsSlinky.openpgp.mod.key.Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateKeyArmored(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKeyArmored")(value.asInstanceOf[js.Any])
        ret
    }
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

