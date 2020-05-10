package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Encryption extends js.Object {
  /**
    * The server-side encryption algorithm used when storing job results in Amazon S3 (for example, AES256, aws:kms).
    */
  var EncryptionType: ServerSideEncryption = js.native
  /**
    * If the encryption type is aws:kms, this optional value can be used to specify the encryption context for the restore results.
    */
  var KMSContext: js.UndefOr[typingsSlinky.awsSdk.s3Mod.KMSContext] = js.native
  /**
    * If the encryption type is aws:kms, this optional value specifies the ID of the symmetric customer managed AWS KMS CMK to use for encryption of job results. Amazon S3 only supports symmetric CMKs. For more information, see Using Symmetric and Asymmetric Keys in the AWS Key Management Service Developer Guide.
    */
  var KMSKeyId: js.UndefOr[SSEKMSKeyId] = js.native
}

object Encryption {
  @scala.inline
  def apply(EncryptionType: ServerSideEncryption): Encryption = {
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
    def withEncryptionType(value: ServerSideEncryption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKMSContext(value: KMSContext): Self = {
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
    def withKMSKeyId(value: SSEKMSKeyId): Self = {
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

