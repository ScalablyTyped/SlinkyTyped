package typingsSlinky.awsSdkClientS3Browser.typesEncryptionMod

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.AES256
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.awsColonkms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Encryption extends js.Object {
  /**
    * <p>The server-side encryption algorithm used when storing job results in Amazon S3 (e.g., AES256, aws:kms).</p>
    */
  var EncryptionType: AES256 | awsColonkms | String = js.native
  /**
    * <p>If the encryption type is aws:kms, this optional value can be used to specify the encryption context for the restore results.</p>
    */
  var KMSContext: js.UndefOr[String] = js.native
  /**
    * <p>If the encryption type is aws:kms, this optional value specifies the AWS KMS key ID to use for encryption of job results.</p>
    */
  var KMSKeyId: js.UndefOr[String] = js.native
}

object Encryption {
  @scala.inline
  def apply(EncryptionType: AES256 | awsColonkms | String): Encryption = {
    val __obj = js.Dynamic.literal(EncryptionType = EncryptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encryption]
  }
  @scala.inline
  implicit class EncryptionOps[Self <: Encryption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncryptionType(value: AES256 | awsColonkms | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKMSContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KMSContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKMSContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KMSContext")(js.undefined)
        ret
    }
    @scala.inline
    def withKMSKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KMSKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKMSKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KMSKeyId")(js.undefined)
        ret
    }
  }
  
}

