package typingsSlinky.gapiClientCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptResponse extends js.Object {
  /** The encrypted data. */
  var ciphertext: js.UndefOr[String] = js.native
  /** The resource name of the CryptoKeyVersion used in encryption. */
  var name: js.UndefOr[String] = js.native
}

object EncryptResponse {
  @scala.inline
  def apply(): EncryptResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptResponse]
  }
  @scala.inline
  implicit class EncryptResponseOps[Self <: EncryptResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCiphertext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ciphertext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCiphertext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ciphertext")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

