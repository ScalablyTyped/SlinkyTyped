package typingsSlinky.googleapis.cloudkmsV1Mod.cloudkmsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A CryptoKeyVersion represents an individual cryptographic key, and the
  * associated key material.  An ENABLED version can be used for cryptographic
  * operations.  For security reasons, the raw cryptographic key material
  * represented by a CryptoKeyVersion can never be viewed or exported. It can
  * only be used to encrypt, decrypt, or sign data when an authorized user or
  * application invokes Cloud KMS.
  */
@js.native
trait SchemaCryptoKeyVersion extends js.Object {
  /**
    * Output only. The CryptoKeyVersionAlgorithm that this CryptoKeyVersion
    * supports.
    */
  var algorithm: js.UndefOr[String] = js.native
  /**
    * Output only. Statement that was generated and signed by the HSM at key
    * creation time. Use this statement to verify attributes of the key as
    * stored on the HSM, independently of Google. Only provided for key
    * versions with protection_level HSM.
    */
  var attestation: js.UndefOr[SchemaKeyOperationAttestation] = js.native
  /**
    * Output only. The time at which this CryptoKeyVersion was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. The time this CryptoKeyVersion&#39;s key material was
    * destroyed. Only present if state is DESTROYED.
    */
  var destroyEventTime: js.UndefOr[String] = js.native
  /**
    * Output only. The time this CryptoKeyVersion&#39;s key material is
    * scheduled for destruction. Only present if state is DESTROY_SCHEDULED.
    */
  var destroyTime: js.UndefOr[String] = js.native
  /**
    * Output only. The time this CryptoKeyVersion&#39;s key material was
    * generated.
    */
  var generateTime: js.UndefOr[String] = js.native
  /**
    * Output only. The resource name for this CryptoKeyVersion in the format
    * `projects/x/locations/x/keyRings/x/cryptoKeys/x/cryptoKeyVersions/x.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. The ProtectionLevel describing how crypto operations are
    * performed with this CryptoKeyVersion.
    */
  var protectionLevel: js.UndefOr[String] = js.native
  /**
    * The current state of the CryptoKeyVersion.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaCryptoKeyVersion {
  @scala.inline
  def apply(): SchemaCryptoKeyVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCryptoKeyVersion]
  }
  @scala.inline
  implicit class SchemaCryptoKeyVersionOps[Self <: SchemaCryptoKeyVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withAttestation(value: SchemaKeyOperationAttestation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attestation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttestation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attestation")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroyEventTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyEventTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestroyEventTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyEventTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroyTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestroyTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyTime")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateTime")(js.undefined)
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
    @scala.inline
    def withProtectionLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectionLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtectionLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectionLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

