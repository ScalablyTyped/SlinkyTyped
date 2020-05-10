package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSESpecification extends js.Object {
  /**
    * Indicates whether server-side encryption is done using an AWS managed CMK or an AWS owned CMK. If enabled (true), server-side encryption type is set to KMS and an AWS managed CMK is used (AWS KMS charges apply). If disabled (false) or not specified, server-side encryption is set to AWS owned CMK.
    */
  var Enabled: js.UndefOr[SSEEnabled] = js.native
  /**
    * The AWS KMS customer master key (CMK) that should be used for the AWS KMS encryption. To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this parameter if the key is different from the default DynamoDB customer master key alias/aws/dynamodb.
    */
  var KMSMasterKeyId: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.KMSMasterKeyId] = js.native
  /**
    * Server-side encryption type. The only supported value is:    KMS - Server-side encryption that uses AWS Key Management Service. The key is stored in your account and is managed by AWS KMS (AWS KMS charges apply).  
    */
  var SSEType: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.SSEType] = js.native
}

object SSESpecification {
  @scala.inline
  def apply(): SSESpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SSESpecification]
  }
  @scala.inline
  implicit class SSESpecificationOps[Self <: SSESpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: SSEEnabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withKMSMasterKeyId(value: KMSMasterKeyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KMSMasterKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKMSMasterKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KMSMasterKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withSSEType(value: SSEType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSEType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSEType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSEType")(js.undefined)
        ret
    }
  }
  
}

