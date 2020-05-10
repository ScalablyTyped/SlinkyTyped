package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportKeyPairRequest extends js.Object {
  /**
    * The name of the key pair for which you want to import the public key.
    */
  var keyPairName: ResourceName = js.native
  /**
    * A base64-encoded public key of the ssh-rsa type.
    */
  var publicKeyBase64: Base64 = js.native
}

object ImportKeyPairRequest {
  @scala.inline
  def apply(keyPairName: ResourceName, publicKeyBase64: Base64): ImportKeyPairRequest = {
    val __obj = js.Dynamic.literal(keyPairName = keyPairName.asInstanceOf[js.Any], publicKeyBase64 = publicKeyBase64.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportKeyPairRequest]
  }
  @scala.inline
  implicit class ImportKeyPairRequestOps[Self <: ImportKeyPairRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyPairName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPairName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicKeyBase64(value: Base64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKeyBase64")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

