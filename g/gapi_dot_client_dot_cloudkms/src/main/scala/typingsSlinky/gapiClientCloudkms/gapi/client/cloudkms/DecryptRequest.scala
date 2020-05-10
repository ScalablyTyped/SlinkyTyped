package typingsSlinky.gapiClientCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecryptRequest extends js.Object {
  /**
    * Optional data that must match the data originally supplied in
    * EncryptRequest.additional_authenticated_data.
    */
  var additionalAuthenticatedData: js.UndefOr[String] = js.native
  /**
    * Required. The encrypted data originally returned in
    * EncryptResponse.ciphertext.
    */
  var ciphertext: js.UndefOr[String] = js.native
}

object DecryptRequest {
  @scala.inline
  def apply(): DecryptRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecryptRequest]
  }
  @scala.inline
  implicit class DecryptRequestOps[Self <: DecryptRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalAuthenticatedData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalAuthenticatedData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalAuthenticatedData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalAuthenticatedData")(js.undefined)
        ret
    }
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
  }
  
}

