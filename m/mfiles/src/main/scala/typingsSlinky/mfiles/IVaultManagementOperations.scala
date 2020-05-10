package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultManagementOperations extends js.Object {
  def ArchiveOldVersions(ArchiveOldVersionsJob: IArchiveOldVersionsJob): Unit = js.native
  def ExportContent(ExportContentJob: IExportContentJob): Unit = js.native
  def GetEventHandlers(): IEventHandlers = js.native
  def GetVaultProperties(): IVaultProperties = js.native
  def ImportContent(ImportContentJob: IImportContentJob): Unit = js.native
  def ImportContentAsync(ImportContentJob: IImportContentJob): Double = js.native
  def IsAsyncJobRunning(JobID: Double): Boolean = js.native
  def PreviewImportContent(ImportContentJob: IImportContentJob, SummaryFile: String): Unit = js.native
  def RebuildFullTextSearchIndex(Metadata: Boolean, FileContents: Boolean): Unit = js.native
  def SetEventHandlers(EventHandlers: IEventHandlers): Unit = js.native
  def UpdateVaultProperties(VaultProperties: IVaultProperties, RegistrationDataOnly: Boolean): Unit = js.native
  def VerifyVault(VerifyVaultJob: IVerifyVaultJob): IVerifyVaultJobOutput = js.native
  def WaitAsyncJob(JobID: Double): Unit = js.native
}

object IVaultManagementOperations {
  @scala.inline
  def apply(
    ArchiveOldVersions: IArchiveOldVersionsJob => Unit,
    ExportContent: IExportContentJob => Unit,
    GetEventHandlers: () => IEventHandlers,
    GetVaultProperties: () => IVaultProperties,
    ImportContent: IImportContentJob => Unit,
    ImportContentAsync: IImportContentJob => Double,
    IsAsyncJobRunning: Double => Boolean,
    PreviewImportContent: (IImportContentJob, String) => Unit,
    RebuildFullTextSearchIndex: (Boolean, Boolean) => Unit,
    SetEventHandlers: IEventHandlers => Unit,
    UpdateVaultProperties: (IVaultProperties, Boolean) => Unit,
    VerifyVault: IVerifyVaultJob => IVerifyVaultJobOutput,
    WaitAsyncJob: Double => Unit
  ): IVaultManagementOperations = {
    val __obj = js.Dynamic.literal(ArchiveOldVersions = js.Any.fromFunction1(ArchiveOldVersions), ExportContent = js.Any.fromFunction1(ExportContent), GetEventHandlers = js.Any.fromFunction0(GetEventHandlers), GetVaultProperties = js.Any.fromFunction0(GetVaultProperties), ImportContent = js.Any.fromFunction1(ImportContent), ImportContentAsync = js.Any.fromFunction1(ImportContentAsync), IsAsyncJobRunning = js.Any.fromFunction1(IsAsyncJobRunning), PreviewImportContent = js.Any.fromFunction2(PreviewImportContent), RebuildFullTextSearchIndex = js.Any.fromFunction2(RebuildFullTextSearchIndex), SetEventHandlers = js.Any.fromFunction1(SetEventHandlers), UpdateVaultProperties = js.Any.fromFunction2(UpdateVaultProperties), VerifyVault = js.Any.fromFunction1(VerifyVault), WaitAsyncJob = js.Any.fromFunction1(WaitAsyncJob))
    __obj.asInstanceOf[IVaultManagementOperations]
  }
  @scala.inline
  implicit class IVaultManagementOperationsOps[Self <: IVaultManagementOperations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArchiveOldVersions(value: IArchiveOldVersionsJob => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArchiveOldVersions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExportContent(value: IExportContentJob => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportContent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetEventHandlers(value: () => IEventHandlers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetEventHandlers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVaultProperties(value: () => IVaultProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetVaultProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withImportContent(value: IImportContentJob => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportContent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withImportContentAsync(value: IImportContentJob => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportContentAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsAsyncJobRunning(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsAsyncJobRunning")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPreviewImportContent(value: (IImportContentJob, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreviewImportContent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRebuildFullTextSearchIndex(value: (Boolean, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RebuildFullTextSearchIndex")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetEventHandlers(value: IEventHandlers => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetEventHandlers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateVaultProperties(value: (IVaultProperties, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateVaultProperties")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVerifyVault(value: IVerifyVaultJob => IVerifyVaultJobOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerifyVault")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWaitAsyncJob(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WaitAsyncJob")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

