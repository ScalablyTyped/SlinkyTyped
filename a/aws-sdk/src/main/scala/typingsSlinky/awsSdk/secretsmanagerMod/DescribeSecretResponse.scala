package typingsSlinky.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSecretResponse extends js.Object {
  /**
    * The ARN of the secret.
    */
  var ARN: js.UndefOr[SecretARNType] = js.native
  /**
    * This value exists if the secret is scheduled for deletion. Some time after the specified date and time, Secrets Manager deletes the secret and all of its versions. If a secret is scheduled for deletion, then its details, including the encrypted secret information, is not accessible. To cancel a scheduled deletion and restore access, use RestoreSecret.
    */
  var DeletedDate: js.UndefOr[js.Date] = js.native
  /**
    * The user-provided description of the secret.
    */
  var Description: js.UndefOr[DescriptionType] = js.native
  /**
    * The ARN or alias of the AWS KMS customer master key (CMK) that's used to encrypt the SecretString or SecretBinary fields in each version of the secret. If you don't provide a key, then Secrets Manager defaults to encrypting the secret fields with the default AWS KMS CMK (the one named awssecretsmanager) for this account.
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
    * The most recent date and time that the Secrets Manager rotation process was successfully completed. This value is null if the secret has never rotated.
    */
  var LastRotatedDate: js.UndefOr[js.Date] = js.native
  /**
    * The user-provided friendly name of the secret.
    */
  var Name: js.UndefOr[SecretNameType] = js.native
  /**
    * Returns the name of the service that created this secret.
    */
  var OwningService: js.UndefOr[OwningServiceType] = js.native
  /**
    * Specifies whether automatic rotation is enabled for this secret. To enable rotation, use RotateSecret with AutomaticallyRotateAfterDays set to a value greater than 0. To disable rotation, use CancelRotateSecret.
    */
  var RotationEnabled: js.UndefOr[RotationEnabledType] = js.native
  /**
    * The ARN of a Lambda function that's invoked by Secrets Manager to rotate the secret either automatically per the schedule or manually by a call to RotateSecret.
    */
  var RotationLambdaARN: js.UndefOr[RotationLambdaARNType] = js.native
  /**
    * A structure that contains the rotation configuration for this secret.
    */
  var RotationRules: js.UndefOr[RotationRulesType] = js.native
  /**
    * The list of user-defined tags that are associated with the secret. To add tags to a secret, use TagResource. To remove tags, use UntagResource.
    */
  var Tags: js.UndefOr[TagListType] = js.native
  /**
    * A list of all of the currently assigned VersionStage staging labels and the VersionId that each is attached to. Staging labels are used to keep track of the different versions during the rotation process.  A version that does not have any staging labels attached is considered deprecated and subject to deletion. Such versions are not included in this list. 
    */
  var VersionIdsToStages: js.UndefOr[SecretVersionsToStagesMapType] = js.native
}

object DescribeSecretResponse {
  @scala.inline
  def apply(): DescribeSecretResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSecretResponse]
  }
  @scala.inline
  implicit class DescribeSecretResponseOps[Self <: DescribeSecretResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withVersionIdsToStages(value: SecretVersionsToStagesMapType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionIdsToStages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionIdsToStages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionIdsToStages")(js.undefined)
        ret
    }
  }
  
}

