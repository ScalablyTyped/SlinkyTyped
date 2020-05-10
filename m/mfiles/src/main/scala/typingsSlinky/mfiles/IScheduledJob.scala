package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFScheduledJobType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScheduledJob extends js.Object {
  val BackupVaultJob: IBackupJob = js.native
  var Enabled: Boolean = js.native
  val ExportContentJob: IExportContentJob = js.native
  var ID: Double = js.native
  val ImportContentJob: IImportContentJob = js.native
  var JobName: String = js.native
  var JobType: MFScheduledJobType = js.native
  val OptimizeVaultJob: IOptimizeVaultJob = js.native
  var Temporary: Boolean = js.native
  var Triggers: IScheduledJobTriggers = js.native
  def SetBackupVaultJob(BackupVaultJob: IBackupJob): Unit = js.native
  def SetExportContentJob(ExportContentJob: IExportContentJob): Unit = js.native
  def SetImportContentJob(ImportContentJob: IImportContentJob): Unit = js.native
  def SetOptimizeVaultJob(OptimizeVaultJob: IOptimizeVaultJob): Unit = js.native
}

object IScheduledJob {
  @scala.inline
  def apply(
    BackupVaultJob: IBackupJob,
    Enabled: Boolean,
    ExportContentJob: IExportContentJob,
    ID: Double,
    ImportContentJob: IImportContentJob,
    JobName: String,
    JobType: MFScheduledJobType,
    OptimizeVaultJob: IOptimizeVaultJob,
    SetBackupVaultJob: IBackupJob => Unit,
    SetExportContentJob: IExportContentJob => Unit,
    SetImportContentJob: IImportContentJob => Unit,
    SetOptimizeVaultJob: IOptimizeVaultJob => Unit,
    Temporary: Boolean,
    Triggers: IScheduledJobTriggers
  ): IScheduledJob = {
    val __obj = js.Dynamic.literal(BackupVaultJob = BackupVaultJob.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], ExportContentJob = ExportContentJob.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], ImportContentJob = ImportContentJob.asInstanceOf[js.Any], JobName = JobName.asInstanceOf[js.Any], JobType = JobType.asInstanceOf[js.Any], OptimizeVaultJob = OptimizeVaultJob.asInstanceOf[js.Any], SetBackupVaultJob = js.Any.fromFunction1(SetBackupVaultJob), SetExportContentJob = js.Any.fromFunction1(SetExportContentJob), SetImportContentJob = js.Any.fromFunction1(SetImportContentJob), SetOptimizeVaultJob = js.Any.fromFunction1(SetOptimizeVaultJob), Temporary = Temporary.asInstanceOf[js.Any], Triggers = Triggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScheduledJob]
  }
  @scala.inline
  implicit class IScheduledJobOps[Self <: IScheduledJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupVaultJob(value: IBackupJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupVaultJob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportContentJob(value: IExportContentJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportContentJob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportContentJob(value: IImportContentJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportContentJob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobType(value: MFScheduledJobType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptimizeVaultJob(value: IOptimizeVaultJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptimizeVaultJob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetBackupVaultJob(value: IBackupJob => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetBackupVaultJob")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetExportContentJob(value: IExportContentJob => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetExportContentJob")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetImportContentJob(value: IImportContentJob => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetImportContentJob")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOptimizeVaultJob(value: IOptimizeVaultJob => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetOptimizeVaultJob")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTemporary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Temporary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggers(value: IScheduledJobTriggers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Triggers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

