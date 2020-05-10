package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerSideEncryptionByDefault extends js.Object {
  /**
    * KMS master key ID to use for the default encryption. This parameter is allowed if and only if SSEAlgorithm is set to aws:kms.
    */
  var KMSMasterKeyID: js.UndefOr[SSEKMSKeyId] = js.native
  /**
    * Server-side encryption algorithm to use for the default encryption.
    */
  var SSEAlgorithm: ServerSideEncryption = js.native
}

object ServerSideEncryptionByDefault {
  @scala.inline
  def apply(SSEAlgorithm: ServerSideEncryption): ServerSideEncryptionByDefault = {
    val __obj = js.Dynamic.literal(SSEAlgorithm = SSEAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerSideEncryptionByDefault]
  }
  @scala.inline
  implicit class ServerSideEncryptionByDefaultOps[Self <: ServerSideEncryptionByDefault] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSSEAlgorithm(value: ServerSideEncryption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSEAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKMSMasterKeyID(value: SSEKMSKeyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KMSMasterKeyID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKMSMasterKeyID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KMSMasterKeyID")(js.undefined)
        ret
    }
  }
  
}

