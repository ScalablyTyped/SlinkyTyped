package typingsSlinky.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.mfiles.IScheduledJob
import typingsSlinky.mfiles.IScheduledJobRunInfo
import typingsSlinky.mfiles.IScheduledJobs
import typingsSlinky.mfiles.IVaultScheduledJobManagementOperations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultScheduledJobManagementOperations")
@js.native
class VaultScheduledJobManagementOperations () extends IVaultScheduledJobManagementOperations {
  /* CompleteClass */
  override def AddScheduledJob(ScheduledJob: IScheduledJob): Double = js.native
  /* CompleteClass */
  override def CancelScheduledJob(ID: Double): Unit = js.native
  /* CompleteClass */
  override def GetScheduledJob(ID: Double): IScheduledJob = js.native
  /* CompleteClass */
  override def GetScheduledJobRunInfo(ID: Double): IScheduledJobRunInfo = js.native
  /* CompleteClass */
  override def GetScheduledJobs(): IScheduledJobs = js.native
  /* CompleteClass */
  override def ModifyScheduledJob(ScheduledJob: IScheduledJob): Unit = js.native
  /* CompleteClass */
  override def RemoveScheduledJob(ID: Double): Unit = js.native
  /* CompleteClass */
  override def StartScheduledJob(ID: Double): Unit = js.native
}

@JSGlobal("MFiles.VaultScheduledJobManagementOperations")
@js.native
object VaultScheduledJobManagementOperations extends Instantiable0[IVaultScheduledJobManagementOperations]

