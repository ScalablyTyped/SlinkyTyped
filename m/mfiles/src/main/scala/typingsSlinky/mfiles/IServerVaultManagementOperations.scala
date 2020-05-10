package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IServerVaultManagementOperations extends js.Object {
  def AttachVault(VaultProperties: IVaultProperties, UpdateAttachmentGUID: Boolean): IVaultProperties = js.native
  def AttachVaultWithOptions(VaultProperties: IVaultProperties, Options: IAttachVaultOptions): IVaultProperties = js.native
  def BackupVault(BackupJob: IBackupJob): Unit = js.native
  def BringVaultOnline(VaultGUID: String): Unit = js.native
  def CopyVault(CopyVaultJob: ICopyVaultJob): ICopyVaultJobOutputInfo = js.native
  def CreateNewVault(VaultProperties: IVaultProperties): String = js.native
  def DestroyVault(VaultGUID: String): Unit = js.native
  def DetachVault(VaultGUID: String): Unit = js.native
  def GetBackupFileContents(BackupFileFull: String, BackupFileDifferential: String, Impersonation: IImpersonation): IVaultProperties = js.native
  def GetVaultProperties(VaultGUID: String): IVaultProperties = js.native
  def OptimizeVault(OptimizeVaultJob: IOptimizeVaultJob): Unit = js.native
  def RestoreVault(RestoreJob: IRestoreJob): Unit = js.native
  def TakeVaultOffline(VaultGUID: String, DisconnectUsers: Boolean): Unit = js.native
}

object IServerVaultManagementOperations {
  @scala.inline
  def apply(
    AttachVault: (IVaultProperties, Boolean) => IVaultProperties,
    AttachVaultWithOptions: (IVaultProperties, IAttachVaultOptions) => IVaultProperties,
    BackupVault: IBackupJob => Unit,
    BringVaultOnline: String => Unit,
    CopyVault: ICopyVaultJob => ICopyVaultJobOutputInfo,
    CreateNewVault: IVaultProperties => String,
    DestroyVault: String => Unit,
    DetachVault: String => Unit,
    GetBackupFileContents: (String, String, IImpersonation) => IVaultProperties,
    GetVaultProperties: String => IVaultProperties,
    OptimizeVault: IOptimizeVaultJob => Unit,
    RestoreVault: IRestoreJob => Unit,
    TakeVaultOffline: (String, Boolean) => Unit
  ): IServerVaultManagementOperations = {
    val __obj = js.Dynamic.literal(AttachVault = js.Any.fromFunction2(AttachVault), AttachVaultWithOptions = js.Any.fromFunction2(AttachVaultWithOptions), BackupVault = js.Any.fromFunction1(BackupVault), BringVaultOnline = js.Any.fromFunction1(BringVaultOnline), CopyVault = js.Any.fromFunction1(CopyVault), CreateNewVault = js.Any.fromFunction1(CreateNewVault), DestroyVault = js.Any.fromFunction1(DestroyVault), DetachVault = js.Any.fromFunction1(DetachVault), GetBackupFileContents = js.Any.fromFunction3(GetBackupFileContents), GetVaultProperties = js.Any.fromFunction1(GetVaultProperties), OptimizeVault = js.Any.fromFunction1(OptimizeVault), RestoreVault = js.Any.fromFunction1(RestoreVault), TakeVaultOffline = js.Any.fromFunction2(TakeVaultOffline))
    __obj.asInstanceOf[IServerVaultManagementOperations]
  }
  @scala.inline
  implicit class IServerVaultManagementOperationsOps[Self <: IServerVaultManagementOperations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachVault(value: (IVaultProperties, Boolean) => IVaultProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachVault")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAttachVaultWithOptions(value: (IVaultProperties, IAttachVaultOptions) => IVaultProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachVaultWithOptions")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBackupVault(value: IBackupJob => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupVault")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBringVaultOnline(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BringVaultOnline")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCopyVault(value: ICopyVaultJob => ICopyVaultJobOutputInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyVault")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateNewVault(value: IVaultProperties => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateNewVault")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDestroyVault(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestroyVault")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDetachVault(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetachVault")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetBackupFileContents(value: (String, String, IImpersonation) => IVaultProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetBackupFileContents")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetVaultProperties(value: String => IVaultProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetVaultProperties")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOptimizeVault(value: IOptimizeVaultJob => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptimizeVault")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRestoreVault(value: IRestoreJob => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestoreVault")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTakeVaultOffline(value: (String, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TakeVaultOffline")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

