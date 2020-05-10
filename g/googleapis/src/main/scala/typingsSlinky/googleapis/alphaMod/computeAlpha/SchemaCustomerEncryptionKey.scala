package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a customer-supplied encryption key
  */
@js.native
trait SchemaCustomerEncryptionKey extends js.Object {
  /**
    * The name of the encryption key that is stored in Google Cloud KMS.
    */
  var kmsKeyName: js.UndefOr[String] = js.native
  var kmsKeyServiceAccount: js.UndefOr[String] = js.native
  /**
    * Specifies a 256-bit customer-supplied encryption key, encoded in RFC 4648
    * base64 to either encrypt or decrypt this resource.
    */
  var rawKey: js.UndefOr[String] = js.native
  /**
    * Specifies an RFC 4648 base64 encoded, RSA-wrapped 2048-bit
    * customer-supplied encryption key to either encrypt or decrypt this
    * resource.  The key must meet the following requirements before you can
    * provide it to Compute Engine:   - The key is wrapped using a RSA public
    * key certificate provided by Google.  - After being wrapped, the key must
    * be encoded in RFC 4648 base64 encoding.  Gets the RSA public key
    * certificate provided by Google at:
    * https://cloud-certs.storage.googleapis.com/google-cloud-csek-ingress.pem
    */
  var rsaEncryptedKey: js.UndefOr[String] = js.native
  /**
    * [Output only] The RFC 4648 base64 encoded SHA-256 hash of the
    * customer-supplied encryption key that protects this resource.
    */
  var sha256: js.UndefOr[String] = js.native
}

object SchemaCustomerEncryptionKey {
  @scala.inline
  def apply(): SchemaCustomerEncryptionKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerEncryptionKey]
  }
  @scala.inline
  implicit class SchemaCustomerEncryptionKeyOps[Self <: SchemaCustomerEncryptionKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKmsKeyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyName")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyServiceAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyServiceAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyServiceAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyServiceAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withRawKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawKey")(js.undefined)
        ret
    }
    @scala.inline
    def withRsaEncryptedKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rsaEncryptedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRsaEncryptedKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rsaEncryptedKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSha256(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha256")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSha256: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha256")(js.undefined)
        ret
    }
  }
  
}

