package typingsSlinky.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsContentProtection extends js.Object {
  /**
    * If Elastic Transcoder is generating your key for you, you must leave this field blank. The series of random bits created by a random bit generator, unique for every encryption operation, that you want Elastic Transcoder to use to encrypt your output files. The initialization vector must be base64-encoded, and it must be exactly 16 bytes before being base64-encoded.
    */
  var InitializationVector: js.UndefOr[ZeroTo255String] = js.native
  /**
    * If you want Elastic Transcoder to generate a key for you, leave this field blank. If you choose to supply your own key, you must encrypt the key by using AWS KMS. The key must be base64-encoded, and it must be one of the following bit lengths before being base64-encoded:  128, 192, or 256. 
    */
  var Key: js.UndefOr[Base64EncodedString] = js.native
  /**
    * If Elastic Transcoder is generating your key for you, you must leave this field blank. The MD5 digest of the key that you want Elastic Transcoder to use to encrypt your output file, and that you want Elastic Transcoder to use as a checksum to make sure your key was not corrupted in transit. The key MD5 must be base64-encoded, and it must be exactly 16 bytes before being base64- encoded.
    */
  var KeyMd5: js.UndefOr[Base64EncodedString] = js.native
  /**
    * Specify whether you want Elastic Transcoder to write your HLS license key to an Amazon S3 bucket. If you choose WithVariantPlaylists, LicenseAcquisitionUrl must be left blank and Elastic Transcoder writes your data key into the same bucket as the associated playlist.
    */
  var KeyStoragePolicy: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.KeyStoragePolicy] = js.native
  /**
    * The location of the license key required to decrypt your HLS playlist. The URL must be an absolute path, and is referenced in the URI attribute of the EXT-X-KEY metadata tag in the playlist file.
    */
  var LicenseAcquisitionUrl: js.UndefOr[ZeroTo512String] = js.native
  /**
    * The content protection method for your output. The only valid value is: aes-128. This value is written into the method attribute of the EXT-X-KEY metadata tag in the output playlist.
    */
  var Method: js.UndefOr[HlsContentProtectionMethod] = js.native
}

object HlsContentProtection {
  @scala.inline
  def apply(): HlsContentProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsContentProtection]
  }
  @scala.inline
  implicit class HlsContentProtectionOps[Self <: HlsContentProtection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitializationVector(value: ZeroTo255String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitializationVector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitializationVector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitializationVector")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: Base64EncodedString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyMd5(value: Base64EncodedString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyMd5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyMd5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyMd5")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyStoragePolicy(value: KeyStoragePolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyStoragePolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyStoragePolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyStoragePolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseAcquisitionUrl(value: ZeroTo512String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseAcquisitionUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseAcquisitionUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseAcquisitionUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: HlsContentProtectionMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Method")(js.undefined)
        ret
    }
  }
  
}

