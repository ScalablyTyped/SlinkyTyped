package typingsSlinky.openpgp

import typingsSlinky.openpgp.mod.key.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKey extends js.Object {
  var key: Key = js.native
  var privateKeyArmored: String = js.native
  var publicKeyArmored: String = js.native
  var revocationCertificate: String = js.native
}

object AnonKey {
  @scala.inline
  def apply(key: Key, privateKeyArmored: String, publicKeyArmored: String, revocationCertificate: String): AnonKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], privateKeyArmored = privateKeyArmored.asInstanceOf[js.Any], publicKeyArmored = publicKeyArmored.asInstanceOf[js.Any], revocationCertificate = revocationCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey]
  }
  @scala.inline
  implicit class AnonKeyOps[Self <: AnonKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateKeyArmored(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKeyArmored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicKeyArmored(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKeyArmored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevocationCertificate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revocationCertificate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

