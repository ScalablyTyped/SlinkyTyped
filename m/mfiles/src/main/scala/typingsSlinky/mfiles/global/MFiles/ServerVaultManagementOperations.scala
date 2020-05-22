package typingsSlinky.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.mfiles.IAttachVaultOptions
import typingsSlinky.mfiles.IBackupJob
import typingsSlinky.mfiles.ICopyVaultJob
import typingsSlinky.mfiles.ICopyVaultJobOutputInfo
import typingsSlinky.mfiles.IImpersonation
import typingsSlinky.mfiles.IOptimizeVaultJob
import typingsSlinky.mfiles.IRestoreJob
import typingsSlinky.mfiles.IServerVaultManagementOperations
import typingsSlinky.mfiles.IVaultProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ServerVaultManagementOperations")
@js.native
class ServerVaultManagementOperations () extends IServerVaultManagementOperations {
  /* CompleteClass */
  override def AttachVault(VaultProperties: IVaultProperties, UpdateAttachmentGUID: Boolean): IVaultProperties = js.native
  /* CompleteClass */
  override def AttachVaultWithOptions(VaultProperties: IVaultProperties, Options: IAttachVaultOptions): IVaultProperties = js.native
  /* CompleteClass */
  override def BackupVault(BackupJob: IBackupJob): Unit = js.native
  /* CompleteClass */
  override def BringVaultOnline(VaultGUID: String): Unit = js.native
  /* CompleteClass */
  override def CopyVault(CopyVaultJob: ICopyVaultJob): ICopyVaultJobOutputInfo = js.native
  /* CompleteClass */
  override def CreateNewVault(VaultProperties: IVaultProperties): String = js.native
  /* CompleteClass */
  override def DestroyVault(VaultGUID: String): Unit = js.native
  /* CompleteClass */
  override def DetachVault(VaultGUID: String): Unit = js.native
  /* CompleteClass */
  override def GetBackupFileContents(BackupFileFull: String, BackupFileDifferential: String, Impersonation: IImpersonation): IVaultProperties = js.native
  /* CompleteClass */
  override def GetVaultProperties(VaultGUID: String): IVaultProperties = js.native
  /* CompleteClass */
  override def OptimizeVault(OptimizeVaultJob: IOptimizeVaultJob): Unit = js.native
  /* CompleteClass */
  override def RestoreVault(RestoreJob: IRestoreJob): Unit = js.native
  /* CompleteClass */
  override def TakeVaultOffline(VaultGUID: String, DisconnectUsers: Boolean): Unit = js.native
}

@JSGlobal("MFiles.ServerVaultManagementOperations")
@js.native
object ServerVaultManagementOperations extends Instantiable0[IServerVaultManagementOperations]

