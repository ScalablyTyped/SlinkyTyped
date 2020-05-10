package typingsSlinky.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayReadyDrm extends js.Object {
  /**
    * The type of DRM, if any, that you want Elastic Transcoder to apply to the output files associated with this playlist.
    */
  var Format: js.UndefOr[PlayReadyDrmFormatString] = js.native
  /**
    * The series of random bits created by a random bit generator, unique for every encryption operation, that you want Elastic Transcoder to use to encrypt your files. The initialization vector must be base64-encoded, and it must be exactly 8 bytes long before being base64-encoded. If no initialization vector is provided, Elastic Transcoder generates one for you.
    */
  var InitializationVector: js.UndefOr[ZeroTo255String] = js.native
  /**
    * The DRM key for your file, provided by your DRM license provider. The key must be base64-encoded, and it must be one of the following bit lengths before being base64-encoded:  128, 192, or 256.  The key must also be encrypted by using AWS KMS.
    */
  var Key: js.UndefOr[NonEmptyBase64EncodedString] = js.native
  /**
    * The ID for your DRM key, so that your DRM license provider knows which key to provide. The key ID must be provided in big endian, and Elastic Transcoder converts it to little endian before inserting it into the PlayReady DRM headers. If you are unsure whether your license server provides your key ID in big or little endian, check with your DRM provider.
    */
  var KeyId: js.UndefOr[KeyIdGuid] = js.native
  /**
    * The MD5 digest of the key used for DRM on your file, and that you want Elastic Transcoder to use as a checksum to make sure your key was not corrupted in transit. The key MD5 must be base64-encoded, and it must be exactly 16 bytes before being base64-encoded.
    */
  var KeyMd5: js.UndefOr[NonEmptyBase64EncodedString] = js.native
  /**
    * The location of the license key required to play DRM content. The URL must be an absolute path, and is referenced by the PlayReady header. The PlayReady header is referenced in the protection header of the client manifest for Smooth Streaming outputs, and in the EXT-X-DXDRM and EXT-XDXDRMINFO metadata tags for HLS playlist outputs. An example URL looks like this: https://www.example.com/exampleKey/ 
    */
  var LicenseAcquisitionUrl: js.UndefOr[OneTo512String] = js.native
}

object PlayReadyDrm {
  @scala.inline
  def apply(): PlayReadyDrm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayReadyDrm]
  }
  @scala.inline
  implicit class PlayReadyDrmOps[Self <: PlayReadyDrm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: PlayReadyDrmFormatString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(js.undefined)
        ret
    }
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
    def withKey(value: NonEmptyBase64EncodedString): Self = {
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
    def withKeyId(value: KeyIdGuid): Self = {
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
    def withKeyMd5(value: NonEmptyBase64EncodedString): Self = {
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
    def withLicenseAcquisitionUrl(value: OneTo512String): Self = {
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
  }
  
}

