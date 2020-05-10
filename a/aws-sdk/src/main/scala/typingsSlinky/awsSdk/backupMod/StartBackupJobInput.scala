package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartBackupJobInput extends js.Object {
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: typingsSlinky.awsSdk.backupMod.BackupVaultName = js.native
  /**
    * The amount of time AWS Backup attempts a backup before canceling the job and returning an error.
    */
  var CompleteWindowMinutes: js.UndefOr[WindowMinutes] = js.native
  /**
    * Specifies the IAM role ARN used to create the target recovery point; for example, arn:aws:iam::123456789012:role/S3Access.
    */
  var IamRoleArn: IAMRoleArn = js.native
  /**
    * A customer chosen string that can be used to distinguish between calls to StartBackupJob.
    */
  var IdempotencyToken: js.UndefOr[String] = js.native
  /**
    * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup will transition and expire backups automatically according to the lifecycle that you define.  Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. 
    */
  var Lifecycle: js.UndefOr[typingsSlinky.awsSdk.backupMod.Lifecycle] = js.native
  /**
    * To help organize your resources, you can assign your own metadata to the resources that you create. Each tag is a key-value pair.
    */
  var RecoveryPointTags: js.UndefOr[Tags] = js.native
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource type.
    */
  var ResourceArn: ARN = js.native
  /**
    * The amount of time in minutes before beginning a backup.
    */
  var StartWindowMinutes: js.UndefOr[WindowMinutes] = js.native
}

object StartBackupJobInput {
  @scala.inline
  def apply(BackupVaultName: BackupVaultName, IamRoleArn: IAMRoleArn, ResourceArn: ARN): StartBackupJobInput = {
    val __obj = js.Dynamic.literal(BackupVaultName = BackupVaultName.asInstanceOf[js.Any], IamRoleArn = IamRoleArn.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartBackupJobInput]
  }
  @scala.inline
  implicit class StartBackupJobInputOps[Self <: StartBackupJobInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupVaultName(value: BackupVaultName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupVaultName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIamRoleArn(value: IAMRoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceArn(value: ARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompleteWindowMinutes(value: WindowMinutes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompleteWindowMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompleteWindowMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompleteWindowMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withIdempotencyToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdempotencyToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdempotencyToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdempotencyToken")(js.undefined)
        ret
    }
    @scala.inline
    def withLifecycle(value: Lifecycle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lifecycle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifecycle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lifecycle")(js.undefined)
        ret
    }
    @scala.inline
    def withRecoveryPointTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecoveryPointTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecoveryPointTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecoveryPointTags")(js.undefined)
        ret
    }
    @scala.inline
    def withStartWindowMinutes(value: WindowMinutes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartWindowMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartWindowMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartWindowMinutes")(js.undefined)
        ret
    }
  }
  
}

