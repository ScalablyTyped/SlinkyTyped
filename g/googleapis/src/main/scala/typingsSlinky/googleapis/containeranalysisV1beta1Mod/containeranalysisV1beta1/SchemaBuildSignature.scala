package typingsSlinky.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message encapsulating the signature of the verified build.
  */
@js.native
trait SchemaBuildSignature extends js.Object {
  /**
    * An ID for the key used to sign. This could be either an ID for the key
    * stored in `public_key` (such as the ID or fingerprint for a PGP key, or
    * the CN for a cert), or a reference to an external key (such as a
    * reference to a key in Cloud Key Management Service).
    */
  var keyId: js.UndefOr[String] = js.native
  /**
    * The type of the key, either stored in `public_key` or referenced in
    * `key_id`.
    */
  var keyType: js.UndefOr[String] = js.native
  /**
    * Public key of the builder which can be used to verify that the related
    * findings are valid and unchanged. If `key_type` is empty, this defaults
    * to PEM encoded public keys.  This field may be empty if `key_id`
    * references an external key.  For Cloud Build based signatures, this is a
    * PEM encoded public key. To verify the Cloud Build signature, place the
    * contents of this field into a file (public.pem). The signature field is
    * base64-decoded into its binary representation in signature.bin, and the
    * provenance bytes from `BuildDetails` are base64-decoded into a binary
    * representation in signed.bin. OpenSSL can then verify the signature:
    * `openssl sha256 -verify public.pem -signature signature.bin signed.bin`
    */
  var publicKey: js.UndefOr[String] = js.native
  /**
    * Required. Signature of the related `BuildProvenance`. In JSON, this is
    * base-64 encoded.
    */
  var signature: js.UndefOr[String] = js.native
}

object SchemaBuildSignature {
  @scala.inline
  def apply(): SchemaBuildSignature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildSignature]
  }
  @scala.inline
  implicit class SchemaBuildSignatureOps[Self <: SchemaBuildSignature] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyId")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyType")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSignature(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(js.undefined)
        ret
    }
  }
  
}

