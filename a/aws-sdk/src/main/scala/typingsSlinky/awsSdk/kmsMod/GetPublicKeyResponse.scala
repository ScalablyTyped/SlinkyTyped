package typingsSlinky.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPublicKeyResponse extends js.Object {
  /**
    * The type of the of the public key that was downloaded.
    */
  var CustomerMasterKeySpec: js.UndefOr[typingsSlinky.awsSdk.kmsMod.CustomerMasterKeySpec] = js.native
  /**
    * The encryption algorithms that AWS KMS supports for this key.  This information is critical. If a public key encrypts data outside of AWS KMS by using an unsupported encryption algorithm, the ciphertext cannot be decrypted.  This field appears in the response only when the KeyUsage of the public key is ENCRYPT_DECRYPT.
    */
  var EncryptionAlgorithms: js.UndefOr[EncryptionAlgorithmSpecList] = js.native
  /**
    * The identifier of the asymmetric CMK from which the public key was downloaded.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
  /**
    * The permitted use of the public key. Valid values are ENCRYPT_DECRYPT or SIGN_VERIFY.  This information is critical. If a public key with SIGN_VERIFY key usage encrypts data outside of AWS KMS, the ciphertext cannot be decrypted. 
    */
  var KeyUsage: js.UndefOr[KeyUsageType] = js.native
  /**
    * The exported public key.  The value is a DER-encoded X.509 public key, also known as SubjectPublicKeyInfo (SPKI), as defined in RFC 5280. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded. 
    */
  var PublicKey: js.UndefOr[PublicKeyType] = js.native
  /**
    * The signing algorithms that AWS KMS supports for this key. This field appears in the response only when the KeyUsage of the public key is SIGN_VERIFY.
    */
  var SigningAlgorithms: js.UndefOr[SigningAlgorithmSpecList] = js.native
}

object GetPublicKeyResponse {
  @scala.inline
  def apply(): GetPublicKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPublicKeyResponse]
  }
  @scala.inline
  implicit class GetPublicKeyResponseOps[Self <: GetPublicKeyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomerMasterKeySpec(value: CustomerMasterKeySpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomerMasterKeySpec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerMasterKeySpec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomerMasterKeySpec")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionAlgorithms(value: EncryptionAlgorithmSpecList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionAlgorithms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionAlgorithms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionAlgorithms")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyId(value: KeyIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyUsage(value: KeyUsageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyUsage")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicKeyUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicKey(value: PublicKeyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSigningAlgorithms(value: SigningAlgorithmSpecList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SigningAlgorithms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigningAlgorithms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SigningAlgorithms")(js.undefined)
        ret
    }
  }
  
}

