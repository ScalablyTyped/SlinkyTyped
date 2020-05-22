package typingsSlinky.activexOffice.global.Office

import typingsSlinky.activexOffice.Office.MsoSyncConflictResolutionType
import typingsSlinky.activexOffice.Office.MsoSyncErrorType
import typingsSlinky.activexOffice.Office.MsoSyncStatusType
import typingsSlinky.activexOffice.Office.MsoSyncVersionType
import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.Sync")
@js.native
class Sync protected ()
  extends typingsSlinky.activexOffice.Office.Sync {
  /* CompleteClass */
  override val Application: js.Any = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val ErrorType: MsoSyncErrorType = js.native
  /* CompleteClass */
  override val LastSyncTime: VarDate = js.native
  /* CompleteClass */
  @JSName("Office.Sync_typekey")
  override var OfficeDotSync_typekey: typingsSlinky.activexOffice.Office.Sync = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Status: MsoSyncStatusType = js.native
  /* CompleteClass */
  override val WorkspaceLastChangedBy: String = js.native
  /* CompleteClass */
  override def GetUpdate(): Unit = js.native
  /* CompleteClass */
  override def OpenVersion(SyncVersionType: MsoSyncVersionType): Unit = js.native
  /* CompleteClass */
  override def PutUpdate(): Unit = js.native
  /* CompleteClass */
  override def ResolveConflict(SyncConflictResolution: MsoSyncConflictResolutionType): Unit = js.native
  /* CompleteClass */
  override def Unsuspend(): Unit = js.native
}

