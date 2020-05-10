package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFBackupType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBackupJob extends js.Object {
  var BackupType: MFBackupType = js.native
  var FileSizeLimitInMB: Double = js.native
  var Impersonation: IImpersonation = js.native
  var OverwriteExistingFiles: Boolean = js.native
  var TargetFile: String = js.native
  var VaultGUID: String = js.native
  def Clone(): IBackupJob = js.native
}

object IBackupJob {
  @scala.inline
  def apply(
    BackupType: MFBackupType,
    Clone: () => IBackupJob,
    FileSizeLimitInMB: Double,
    Impersonation: IImpersonation,
    OverwriteExistingFiles: Boolean,
    TargetFile: String,
    VaultGUID: String
  ): IBackupJob = {
    val __obj = js.Dynamic.literal(BackupType = BackupType.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), FileSizeLimitInMB = FileSizeLimitInMB.asInstanceOf[js.Any], Impersonation = Impersonation.asInstanceOf[js.Any], OverwriteExistingFiles = OverwriteExistingFiles.asInstanceOf[js.Any], TargetFile = TargetFile.asInstanceOf[js.Any], VaultGUID = VaultGUID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBackupJob]
  }
  @scala.inline
  implicit class IBackupJobOps[Self <: IBackupJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupType(value: MFBackupType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => IBackupJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFileSizeLimitInMB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSizeLimitInMB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImpersonation(value: IImpersonation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Impersonation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverwriteExistingFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OverwriteExistingFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVaultGUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VaultGUID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

