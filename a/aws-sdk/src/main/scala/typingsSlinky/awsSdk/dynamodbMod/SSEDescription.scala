package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSEDescription extends js.Object {
  /**
    * Indicates the time, in UNIX epoch date format, when DynamoDB detected that the table's AWS KMS key was inaccessible. This attribute will automatically be cleared when DynamoDB detects that the table's AWS KMS key is accessible again. DynamoDB will initiate the table archival process when table's AWS KMS key remains inaccessible for more than seven days from this date.
    */
  var InaccessibleEncryptionDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The AWS KMS customer master key (CMK) ARN used for the AWS KMS encryption.
    */
  var KMSMasterKeyArn: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.KMSMasterKeyArn] = js.native
  /**
    * Server-side encryption type. The only supported value is:    KMS - Server-side encryption that uses AWS Key Management Service. The key is stored in your account and is managed by AWS KMS (AWS KMS charges apply).  
    */
  var SSEType: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.SSEType] = js.native
  /**
    * Represents the current state of server-side encryption. The only supported values are:    ENABLED - Server-side encryption is enabled.    UPDATING - Server-side encryption is being updated.  
    */
  var Status: js.UndefOr[SSEStatus] = js.native
}

object SSEDescription {
  @scala.inline
  def apply(): SSEDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SSEDescription]
  }
  @scala.inline
  implicit class SSEDescriptionOps[Self <: SSEDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInaccessibleEncryptionDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InaccessibleEncryptionDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInaccessibleEncryptionDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InaccessibleEncryptionDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withKMSMasterKeyArn(value: KMSMasterKeyArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KMSMasterKeyArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKMSMasterKeyArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KMSMasterKeyArn")(js.undefined)
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
    @scala.inline
    def withStatus(value: SSEStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

