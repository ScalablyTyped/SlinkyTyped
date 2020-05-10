package typingsSlinky.googleapis.cloudkmsV1Mod.cloudkmsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for KeyManagementService.Encrypt.
  */
@js.native
trait SchemaEncryptRequest extends js.Object {
  /**
    * Optional data that, if specified, must also be provided during decryption
    * through DecryptRequest.additional_authenticated_data.  The maximum size
    * depends on the key version&#39;s protection_level. For SOFTWARE keys, the
    * AAD must be no larger than 64KiB. For HSM keys, the combined length of
    * the plaintext and additional_authenticated_data fields must be no larger
    * than 8KiB.
    */
  var additionalAuthenticatedData: js.UndefOr[String] = js.native
  /**
    * Required. The data to encrypt. Must be no larger than 64KiB.  The maximum
    * size depends on the key version&#39;s protection_level. For SOFTWARE
    * keys, the plaintext must be no larger than 64KiB. For HSM keys, the
    * combined length of the plaintext and additional_authenticated_data fields
    * must be no larger than 8KiB.
    */
  var plaintext: js.UndefOr[String] = js.native
}

object SchemaEncryptRequest {
  @scala.inline
  def apply(): SchemaEncryptRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEncryptRequest]
  }
  @scala.inline
  implicit class SchemaEncryptRequestOps[Self <: SchemaEncryptRequest] (val x: Self) extends AnyVal {
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
    def withPlaintext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plaintext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaintext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plaintext")(js.undefined)
        ret
    }
  }
  
}

