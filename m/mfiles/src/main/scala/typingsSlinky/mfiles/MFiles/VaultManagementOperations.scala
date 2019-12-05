package typingsSlinky.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.mfiles.IArchiveOldVersionsJob
import typingsSlinky.mfiles.IEventHandlers
import typingsSlinky.mfiles.IExportContentJob
import typingsSlinky.mfiles.IImportContentJob
import typingsSlinky.mfiles.IVaultManagementOperations
import typingsSlinky.mfiles.IVaultProperties
import typingsSlinky.mfiles.IVerifyVaultJob
import typingsSlinky.mfiles.IVerifyVaultJobOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultManagementOperations")
@js.native
class VaultManagementOperations () extends IVaultManagementOperations {
  /* CompleteClass */
  override def ArchiveOldVersions(ArchiveOldVersionsJob: IArchiveOldVersionsJob): Unit = js.native
  /* CompleteClass */
  override def ExportContent(ExportContentJob: IExportContentJob): Unit = js.native
  /* CompleteClass */
  override def GetEventHandlers(): IEventHandlers = js.native
  /* CompleteClass */
  override def GetVaultProperties(): IVaultProperties = js.native
  /* CompleteClass */
  override def ImportContent(ImportContentJob: IImportContentJob): Unit = js.native
  /* CompleteClass */
  override def ImportContentAsync(ImportContentJob: IImportContentJob): Double = js.native
  /* CompleteClass */
  override def IsAsyncJobRunning(JobID: Double): Boolean = js.native
  /* CompleteClass */
  override def PreviewImportContent(ImportContentJob: IImportContentJob, SummaryFile: String): Unit = js.native
  /* CompleteClass */
  override def RebuildFullTextSearchIndex(Metadata: Boolean, FileContents: Boolean): Unit = js.native
  /* CompleteClass */
  override def SetEventHandlers(EventHandlers: IEventHandlers): Unit = js.native
  /* CompleteClass */
  override def UpdateVaultProperties(VaultProperties: IVaultProperties, RegistrationDataOnly: Boolean): Unit = js.native
  /* CompleteClass */
  override def VerifyVault(VerifyVaultJob: IVerifyVaultJob): IVerifyVaultJobOutput = js.native
  /* CompleteClass */
  override def WaitAsyncJob(JobID: Double): Unit = js.native
}

@JSGlobal("MFiles.VaultManagementOperations")
@js.native
object VaultManagementOperations extends Instantiable0[IVaultManagementOperations]

