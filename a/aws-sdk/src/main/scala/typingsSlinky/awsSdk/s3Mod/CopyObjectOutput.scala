package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyObjectOutput extends js.Object {
  /**
    * Container for all response elements.
    */
  var CopyObjectResult: js.UndefOr[typingsSlinky.awsSdk.s3Mod.CopyObjectResult] = js.native
  /**
    * Version of the copied object in the destination bucket.
    */
  var CopySourceVersionId: js.UndefOr[typingsSlinky.awsSdk.s3Mod.CopySourceVersionId] = js.native
  /**
    * If the object expiration is configured, the response includes this header.
    */
  var Expiration: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Expiration] = js.native
  var RequestCharged: js.UndefOr[typingsSlinky.awsSdk.s3Mod.RequestCharged] = js.native
  /**
    * If server-side encryption with a customer-provided encryption key was requested, the response will include this header confirming the encryption algorithm used.
    */
  var SSECustomerAlgorithm: js.UndefOr[typingsSlinky.awsSdk.s3Mod.SSECustomerAlgorithm] = js.native
  /**
    * If server-side encryption with a customer-provided encryption key was requested, the response will include this header to provide round-trip message integrity verification of the customer-provided encryption key.
    */
  var SSECustomerKeyMD5: js.UndefOr[typingsSlinky.awsSdk.s3Mod.SSECustomerKeyMD5] = js.native
  /**
    * If present, specifies the AWS KMS Encryption Context to use for object encryption. The value of this header is a base64-encoded UTF-8 string holding JSON with the encryption context key-value pairs.
    */
  var SSEKMSEncryptionContext: js.UndefOr[typingsSlinky.awsSdk.s3Mod.SSEKMSEncryptionContext] = js.native
  /**
    * If present, specifies the ID of the AWS Key Management Service (AWS KMS) symmetric customer managed customer master key (CMK) that was used for the object.
    */
  var SSEKMSKeyId: js.UndefOr[typingsSlinky.awsSdk.s3Mod.SSEKMSKeyId] = js.native
  /**
    * The server-side encryption algorithm used when storing this object in Amazon S3 (for example, AES256, aws:kms).
    */
  var ServerSideEncryption: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ServerSideEncryption] = js.native
  /**
    * Version ID of the newly created copy.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}

object CopyObjectOutput {
  @scala.inline
  def apply(): CopyObjectOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyObjectOutput]
  }
  @scala.inline
  implicit class CopyObjectOutputOps[Self <: CopyObjectOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopyObjectResult(value: CopyObjectResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyObjectResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyObjectResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyObjectResult")(js.undefined)
        ret
    }
    @scala.inline
    def withCopySourceVersionId(value: CopySourceVersionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopySourceVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopySourceVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopySourceVersionId")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiration(value: Expiration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expiration")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestCharged(value: RequestCharged): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestCharged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestCharged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestCharged")(js.undefined)
        ret
    }
    @scala.inline
    def withSSECustomerAlgorithm(value: SSECustomerAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSECustomerAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSECustomerAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSECustomerAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withSSECustomerKeyMD5(value: SSECustomerKeyMD5): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSECustomerKeyMD5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSECustomerKeyMD5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSECustomerKeyMD5")(js.undefined)
        ret
    }
    @scala.inline
    def withSSEKMSEncryptionContext(value: SSEKMSEncryptionContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSEKMSEncryptionContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSEKMSEncryptionContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSEKMSEncryptionContext")(js.undefined)
        ret
    }
    @scala.inline
    def withSSEKMSKeyId(value: SSEKMSKeyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSEKMSKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSEKMSKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSEKMSKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withServerSideEncryption(value: ServerSideEncryption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerSideEncryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerSideEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerSideEncryption")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionId(value: ObjectVersionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionId")(js.undefined)
        ret
    }
  }
  
}

