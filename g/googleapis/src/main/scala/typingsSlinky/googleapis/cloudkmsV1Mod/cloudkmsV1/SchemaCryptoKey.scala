package typingsSlinky.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A CryptoKey represents a logical key that can be used for cryptographic
  * operations.  A CryptoKey is made up of one or more versions, which
  * represent the actual key material used in cryptographic operations.
  */
@js.native
trait SchemaCryptoKey extends js.Object {
  /**
    * Output only. The time at which this CryptoKey was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Labels with user-defined metadata. For more information, see [Labeling
    * Keys](/kms/docs/labeling-keys).
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Output only. The resource name for this CryptoKey in the format
    * `projects/x/locations/x/keyRings/x/cryptoKeys/x.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * At next_rotation_time, the Key Management Service will automatically:  1.
    * Create a new version of this CryptoKey. 2. Mark the new version as
    * primary.  Key rotations performed manually via CreateCryptoKeyVersion and
    * UpdateCryptoKeyPrimaryVersion do not affect next_rotation_time.  Keys
    * with purpose ENCRYPT_DECRYPT support automatic rotation. For other keys,
    * this field must be omitted.
    */
  var nextRotationTime: js.UndefOr[String] = js.native
  /**
    * Output only. A copy of the &quot;primary&quot; CryptoKeyVersion that will
    * be used by Encrypt when this CryptoKey is given in EncryptRequest.name.
    * The CryptoKey&#39;s primary version can be updated via
    * UpdateCryptoKeyPrimaryVersion.  All keys with purpose ENCRYPT_DECRYPT
    * have a primary. For other keys, this field will be omitted.
    */
  var primary: js.UndefOr[SchemaCryptoKeyVersion] = js.native
  /**
    * The immutable purpose of this CryptoKey.
    */
  var purpose: js.UndefOr[String] = js.native
  /**
    * next_rotation_time will be advanced by this period when the service
    * automatically rotates a key. Must be at least one day.  If
    * rotation_period is set, next_rotation_time must also be set.  Keys with
    * purpose ENCRYPT_DECRYPT support automatic rotation. For other keys, this
    * field must be omitted.
    */
  var rotationPeriod: js.UndefOr[String] = js.native
  /**
    * A template describing settings for new CryptoKeyVersion instances. The
    * properties of new CryptoKeyVersion instances created by either
    * CreateCryptoKeyVersion or auto-rotation are controlled by this template.
    */
  var versionTemplate: js.UndefOr[SchemaCryptoKeyVersionTemplate] = js.native
}

object SchemaCryptoKey {
  @scala.inline
  def apply(): SchemaCryptoKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCryptoKey]
  }
  @scala.inline
  implicit class SchemaCryptoKeyOps[Self <: SchemaCryptoKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
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
    def withNextRotationTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextRotationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextRotationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextRotationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimary(value: SchemaCryptoKeyVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(js.undefined)
        ret
    }
    @scala.inline
    def withPurpose(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purpose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurpose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purpose")(js.undefined)
        ret
    }
    @scala.inline
    def withRotationPeriod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotationPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionTemplate(value: SchemaCryptoKeyVersionTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionTemplate")(js.undefined)
        ret
    }
  }
  
}

