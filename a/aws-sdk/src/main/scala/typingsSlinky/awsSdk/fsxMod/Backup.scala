package typingsSlinky.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Backup extends js.Object {
  /**
    * The ID of the backup.
    */
  var BackupId: typingsSlinky.awsSdk.fsxMod.BackupId = js.native
  /**
    * The time when a particular backup was created.
    */
  var CreationTime: js.Date = js.native
  /**
    * The configuration of the self-managed Microsoft Active Directory (AD) to which the Windows File Server instance is joined.
    */
  var DirectoryInformation: js.UndefOr[ActiveDirectoryBackupAttributes] = js.native
  /**
    * Details explaining any failures that occur when creating a backup.
    */
  var FailureDetails: js.UndefOr[BackupFailureDetails] = js.native
  /**
    * Metadata of the file system associated with the backup. This metadata is persisted even if the file system is deleted.
    */
  var FileSystem: typingsSlinky.awsSdk.fsxMod.FileSystem = js.native
  /**
    * The ID of the AWS Key Management Service (AWS KMS) key used to encrypt this backup of the Amazon FSx for Windows file system's data at rest. Amazon FSx for Lustre does not support KMS encryption.
    */
  var KmsKeyId: js.UndefOr[typingsSlinky.awsSdk.fsxMod.KmsKeyId] = js.native
  /**
    * The lifecycle status of the backup.
    */
  var Lifecycle: BackupLifecycle = js.native
  var ProgressPercent: js.UndefOr[typingsSlinky.awsSdk.fsxMod.ProgressPercent] = js.native
  /**
    * The Amazon Resource Name (ARN) for the backup resource.
    */
  var ResourceARN: js.UndefOr[typingsSlinky.awsSdk.fsxMod.ResourceARN] = js.native
  /**
    * Tags associated with a particular file system.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.fsxMod.Tags] = js.native
  /**
    * The type of the backup.
    */
  var Type: BackupType = js.native
}

object Backup {
  @scala.inline
  def apply(
    BackupId: BackupId,
    CreationTime: js.Date,
    FileSystem: FileSystem,
    Lifecycle: BackupLifecycle,
    Type: BackupType
  ): Backup = {
    val __obj = js.Dynamic.literal(BackupId = BackupId.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], FileSystem = FileSystem.asInstanceOf[js.Any], Lifecycle = Lifecycle.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backup]
  }
  @scala.inline
  implicit class BackupOps[Self <: Backup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupId(value: BackupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileSystem(value: FileSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLifecycle(value: BackupLifecycle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lifecycle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: BackupType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectoryInformation(value: ActiveDirectoryBackupAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryInformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryInformation")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureDetails(value: BackupFailureDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyId(value: KmsKeyId): Self = {
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
    def withProgressPercent(value: ProgressPercent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressPercent")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceARN(value: ResourceARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceARN")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
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

