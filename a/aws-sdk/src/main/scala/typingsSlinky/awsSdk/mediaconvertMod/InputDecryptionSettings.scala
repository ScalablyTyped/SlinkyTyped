package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputDecryptionSettings extends js.Object {
  /**
    * Specify the encryption mode that you used to encrypt your input files.
    */
  var DecryptionMode: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.DecryptionMode] = js.native
  /**
    * Warning! Don't provide your encryption key in plaintext. Your job settings could be intercepted, making your encrypted content vulnerable. Specify the encrypted version of the data key that you used to encrypt your content. The data key must be encrypted by AWS Key Management Service (KMS). The key can be 128, 192, or 256 bits.
    */
  var EncryptedDecryptionKey: js.UndefOr[stringMin24Max512PatternAZaZ0902] = js.native
  /**
    * Specify the initialization vector that you used when you encrypted your content before uploading it to Amazon S3. You can use a 16-byte initialization vector with any encryption mode. Or, you can use a 12-byte initialization vector with GCM or CTR. MediaConvert accepts only initialization vectors that are base64-encoded.
    */
  var InitializationVector: js.UndefOr[stringMin16Max24PatternAZaZ0922AZaZ0916] = js.native
  /**
    * Specify the AWS Region for AWS Key Management Service (KMS) that you used to encrypt your data key, if that Region is different from the one you are using for AWS Elemental MediaConvert.
    */
  var KmsKeyRegion: js.UndefOr[stringMin9Max19PatternAZ26EastWestCentralNorthSouthEastWest1912] = js.native
}

object InputDecryptionSettings {
  @scala.inline
  def apply(): InputDecryptionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputDecryptionSettings]
  }
  @scala.inline
  implicit class InputDecryptionSettingsOps[Self <: InputDecryptionSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecryptionMode(value: DecryptionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DecryptionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecryptionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DecryptionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptedDecryptionKey(value: stringMin24Max512PatternAZaZ0902): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptedDecryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptedDecryptionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptedDecryptionKey")(js.undefined)
        ret
    }
    @scala.inline
    def withInitializationVector(value: stringMin16Max24PatternAZaZ0922AZaZ0916): Self = {
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
    def withKmsKeyRegion(value: stringMin9Max19PatternAZ26EastWestCentralNorthSouthEastWest1912): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyRegion")(js.undefined)
        ret
    }
  }
  
}

