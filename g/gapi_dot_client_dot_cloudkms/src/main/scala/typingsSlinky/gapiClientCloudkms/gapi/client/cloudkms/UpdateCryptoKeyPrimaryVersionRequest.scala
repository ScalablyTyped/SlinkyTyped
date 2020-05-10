package typingsSlinky.gapiClientCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCryptoKeyPrimaryVersionRequest extends js.Object {
  /** The id of the child CryptoKeyVersion to use as primary. */
  var cryptoKeyVersionId: js.UndefOr[String] = js.native
}

object UpdateCryptoKeyPrimaryVersionRequest {
  @scala.inline
  def apply(): UpdateCryptoKeyPrimaryVersionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCryptoKeyPrimaryVersionRequest]
  }
  @scala.inline
  implicit class UpdateCryptoKeyPrimaryVersionRequestOps[Self <: UpdateCryptoKeyPrimaryVersionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCryptoKeyVersionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cryptoKeyVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCryptoKeyVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cryptoKeyVersionId")(js.undefined)
        ret
    }
  }
  
}

