package typingsSlinky.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecretListEntry extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the secret. For more information about ARNs in Secrets Manager, see Policy Resources in the AWS Secrets Manager User Guide.
    */
  var ARN: js.UndefOr[SecretARNType] = js.native
  /**
    * The date and time on which this secret was deleted. Not present on active secrets. The secret can be recovered until the number of days in the recovery window has passed, as specified in the RecoveryWindowInDays parameter of the DeleteSecret operation.
    */
  var DeletedDate: js.UndefOr[js.Date] = js.native
  /**
    * The user-provided description of the secret.
    */
  var Description: js.UndefOr[DescriptionType] = js.native
  /**
    * The ARN or alias of the AWS KMS customer master key (CMK) that's used to encrypt the SecretString and SecretBinary fields in each version of the secret. If you don't provide a key, then Secrets Manager defaults to encrypting the secret fields with the default KMS CMK (the one named awssecretsmanager) for this account.
    */
  var KmsKeyId: js.UndefOr[KmsKeyIdType] = js.native
  /**
    * The last date that this secret was accessed. This value is truncated to midnight of the date and therefore shows only the date, not the time.
    */
  var LastAccessedDate: js.UndefOr[js.Date] = js.native
  /**
    * The last date and time that this secret was modified in any way.
    */
  var LastChangedDate: js.UndefOr[js.Date] = js.native
  /**
    * The last date and time that the rotation process for this secret was invoked.
    */
  var LastRotatedDate: js.UndefOr[js.Date] = js.native
  /**
    * The friendly name of the secret. You can use forward slashes in the name to represent a path hierarchy. For example, /prod/databases/dbserver1 could represent the secret for a server named dbserver1 in the folder databases in the folder prod. 
    */
  var Name: js.UndefOr[SecretNameType] = js.native
  /**
    * Returns the name of the service that created the secret.
    */
  var OwningService: js.UndefOr[OwningServiceType] = js.native
  /**
    * Indicates whether automatic, scheduled rotation is enabled for this secret.
    */
  var RotationEnabled: js.UndefOr[RotationEnabledType] = js.native
  /**
    * The ARN of an AWS Lambda function that's invoked by Secrets Manager to rotate and expire the secret either automatically per the schedule or manually by a call to RotateSecret.
    */
  var RotationLambdaARN: js.UndefOr[RotationLambdaARNType] = js.native
  /**
    * A structure that defines the rotation configuration for the secret.
    */
  var RotationRules: js.UndefOr[RotationRulesType] = js.native
  /**
    * A list of all of the currently assigned SecretVersionStage staging labels and the SecretVersionId that each is attached to. Staging labels are used to keep track of the different versions during the rotation process.  A version that does not have any SecretVersionStage is considered deprecated and subject to deletion. Such versions are not included in this list. 
    */
  var SecretVersionsToStages: js.UndefOr[SecretVersionsToStagesMapType] = js.native
  /**
    * The list of user-defined tags that are associated with the secret. To add tags to a secret, use TagResource. To remove tags, use UntagResource.
    */
  var Tags: js.UndefOr[TagListType] = js.native
}

object SecretListEntry {
  @scala.inline
  def apply(): SecretListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretListEntry]
  }
  @scala.inline
  implicit class SecretListEntryOps[Self <: SecretListEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withARN(value: SecretARNType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARN")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: DescriptionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyId(value: KmsKeyIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withLastAccessedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastAccessedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastAccessedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastAccessedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLastChangedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastChangedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastChangedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastChangedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLastRotatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastRotatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastRotatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastRotatedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: SecretNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withOwningService(value: OwningServiceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwningService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwningService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwningService")(js.undefined)
        ret
    }
    @scala.inline
    def withRotationEnabled(value: RotationEnabledType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RotationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RotationEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withRotationLambdaARN(value: RotationLambdaARNType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RotationLambdaARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotationLambdaARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RotationLambdaARN")(js.undefined)
        ret
    }
    @scala.inline
    def withRotationRules(value: RotationRulesType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RotationRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotationRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RotationRules")(js.undefined)
        ret
    }
    @scala.inline
    def withSecretVersionsToStages(value: SecretVersionsToStagesMapType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecretVersionsToStages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretVersionsToStages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecretVersionsToStages")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

