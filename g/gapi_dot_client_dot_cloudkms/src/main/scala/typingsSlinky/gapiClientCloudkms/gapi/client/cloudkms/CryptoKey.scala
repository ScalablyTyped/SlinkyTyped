package typingsSlinky.gapiClientCloudkms.gapi.client.cloudkms

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CryptoKey extends js.Object {
  /** Output only. The time at which this CryptoKey was created. */
  var createTime: js.UndefOr[String] = js.native
  /** Labels with user defined metadata. */
  var labels: js.UndefOr[Record[String, String]] = js.native
  /**
    * Output only. The resource name for this CryptoKey in the format
    * `projects/&#42;/locations/&#42;/keyRings/&#42;/cryptoKeys/&#42;`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * At next_rotation_time, the Key Management Service will automatically:
    *
    * 1. Create a new version of this CryptoKey.
    * 2. Mark the new version as primary.
    *
    * Key rotations performed manually via
    * CreateCryptoKeyVersion and
    * UpdateCryptoKeyPrimaryVersion
    * do not affect next_rotation_time.
    */
  var nextRotationTime: js.UndefOr[String] = js.native
  /**
    * Output only. A copy of the "primary" CryptoKeyVersion that will be used
    * by Encrypt when this CryptoKey is given
    * in EncryptRequest.name.
    *
    * The CryptoKey's primary version can be updated via
    * UpdateCryptoKeyPrimaryVersion.
    */
  var primary: js.UndefOr[CryptoKeyVersion] = js.native
  /**
    * The immutable purpose of this CryptoKey. Currently, the only acceptable
    * purpose is ENCRYPT_DECRYPT.
    */
  var purpose: js.UndefOr[String] = js.native
  /**
    * next_rotation_time will be advanced by this period when the service
    * automatically rotates a key. Must be at least one day.
    *
    * If rotation_period is set, next_rotation_time must also be set.
    */
  var rotationPeriod: js.UndefOr[String] = js.native
}

object CryptoKey {
  @scala.inline
  def apply(): CryptoKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CryptoKey]
  }
  @scala.inline
  implicit class CryptoKeyOps[Self <: CryptoKey] (val x: Self) extends AnyVal {
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
    def withLabels(value: Record[String, String]): Self = {
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
    def withPrimary(value: CryptoKeyVersion): Self = {
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
  }
  
}

