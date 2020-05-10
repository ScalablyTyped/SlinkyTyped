package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadDefaultKeyPairResult extends js.Object {
  /**
    * A base64-encoded RSA private key.
    */
  var privateKeyBase64: js.UndefOr[Base64] = js.native
  /**
    * A base64-encoded public key of the ssh-rsa type.
    */
  var publicKeyBase64: js.UndefOr[Base64] = js.native
}

object DownloadDefaultKeyPairResult {
  @scala.inline
  def apply(): DownloadDefaultKeyPairResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadDefaultKeyPairResult]
  }
  @scala.inline
  implicit class DownloadDefaultKeyPairResultOps[Self <: DownloadDefaultKeyPairResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrivateKeyBase64(value: Base64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKeyBase64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateKeyBase64: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKeyBase64")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicKeyBase64(value: Base64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKeyBase64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicKeyBase64: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKeyBase64")(js.undefined)
        ret
    }
  }
  
}

