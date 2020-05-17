package typingsSlinky.activexOffice.Office

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sync extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  val ErrorType: MsoSyncErrorType = js.native
  val LastSyncTime: VarDate = js.native
  @JSName("Office.Sync_typekey")
  var OfficeDotSync_typekey: Sync = js.native
  val Parent: js.Any = js.native
  val Status: MsoSyncStatusType = js.native
  val WorkspaceLastChangedBy: String = js.native
  def GetUpdate(): Unit = js.native
  def OpenVersion(SyncVersionType: MsoSyncVersionType): Unit = js.native
  def PutUpdate(): Unit = js.native
  def ResolveConflict(SyncConflictResolution: MsoSyncConflictResolutionType): Unit = js.native
  def Unsuspend(): Unit = js.native
}

object Sync {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    ErrorType: MsoSyncErrorType,
    GetUpdate: () => Unit,
    LastSyncTime: VarDate,
    OfficeDotSync_typekey: Sync,
    OpenVersion: MsoSyncVersionType => Unit,
    Parent: js.Any,
    PutUpdate: () => Unit,
    ResolveConflict: MsoSyncConflictResolutionType => Unit,
    Status: MsoSyncStatusType,
    Unsuspend: () => Unit,
    WorkspaceLastChangedBy: String
  ): Sync = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ErrorType = ErrorType.asInstanceOf[js.Any], GetUpdate = js.Any.fromFunction0(GetUpdate), LastSyncTime = LastSyncTime.asInstanceOf[js.Any], OpenVersion = js.Any.fromFunction1(OpenVersion), Parent = Parent.asInstanceOf[js.Any], PutUpdate = js.Any.fromFunction0(PutUpdate), ResolveConflict = js.Any.fromFunction1(ResolveConflict), Status = Status.asInstanceOf[js.Any], Unsuspend = js.Any.fromFunction0(Unsuspend), WorkspaceLastChangedBy = WorkspaceLastChangedBy.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.Sync_typekey")(OfficeDotSync_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sync]
  }
  @scala.inline
  implicit class SyncOps[Self <: Sync] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorType(value: MsoSyncErrorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetUpdate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLastSyncTime(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastSyncTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotSync_typekey(value: Sync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.Sync_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenVersion(value: MsoSyncVersionType => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenVersion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPutUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PutUpdate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResolveConflict(value: MsoSyncConflictResolutionType => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolveConflict")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStatus(value: MsoSyncStatusType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnsuspend(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unsuspend")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWorkspaceLastChangedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkspaceLastChangedBy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

