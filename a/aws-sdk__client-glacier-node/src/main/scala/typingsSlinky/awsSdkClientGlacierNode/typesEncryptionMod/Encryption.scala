package typingsSlinky.awsSdkClientGlacierNode.typesEncryptionMod

import typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.AES256
import typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.awsColonkms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Encryption extends js.Object {
  /**
    * <p>The server-side encryption algorithm used when storing job results in Amazon S3, for example <code>AES256</code> or <code>aws:kms</code>.</p>
    */
  var EncryptionType: js.UndefOr[awsColonkms | AES256 | String] = js.native
  /**
    * <p>Optional. If the encryption type is <code>aws:kms</code>, you can use this value to specify the encryption context for the job results.</p>
    */
  var KMSContext: js.UndefOr[String] = js.native
  /**
    * <p>The AWS KMS key ID to use for object encryption. All GET and PUT requests for an object protected by AWS KMS fail if not made by using Secure Sockets Layer (SSL) or Signature Version 4. </p>
    */
  var KMSKeyId: js.UndefOr[String] = js.native
}

object Encryption {
  @scala.inline
  def apply(): Encryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Encryption]
  }
  @scala.inline
  implicit class EncryptionOps[Self <: Encryption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncryptionType(value: awsColonkms | AES256 | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionType")(js.undefined)
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

