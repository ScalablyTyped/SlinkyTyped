package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IServerScheduledJobManagementOperations extends js.Object {
  def AddScheduledJob(ScheduledJob: IScheduledJob): Double = js.native
  def CancelScheduledJob(ID: Double): Unit = js.native
  def GetScheduledJob(ID: Double): IScheduledJob = js.native
  def GetScheduledJobRunInfo(ID: Double): IScheduledJobRunInfo = js.native
  def GetScheduledJobs(): IScheduledJobs = js.native
  def ModifyScheduledJob(ScheduledJob: IScheduledJob): Unit = js.native
  def RemoveScheduledJob(ID: Double): Unit = js.native
  def StartScheduledJob(ID: Double): Unit = js.native
}

object IServerScheduledJobManagementOperations {
  @scala.inline
  def apply(
    AddScheduledJob: IScheduledJob => Double,
    CancelScheduledJob: Double => Unit,
    GetScheduledJob: Double => IScheduledJob,
    GetScheduledJobRunInfo: Double => IScheduledJobRunInfo,
    GetScheduledJobs: () => IScheduledJobs,
    ModifyScheduledJob: IScheduledJob => Unit,
    RemoveScheduledJob: Double => Unit,
    StartScheduledJob: Double => Unit
  ): IServerScheduledJobManagementOperations = {
    val __obj = js.Dynamic.literal(AddScheduledJob = js.Any.fromFunction1(AddScheduledJob), CancelScheduledJob = js.Any.fromFunction1(CancelScheduledJob), GetScheduledJob = js.Any.fromFunction1(GetScheduledJob), GetScheduledJobRunInfo = js.Any.fromFunction1(GetScheduledJobRunInfo), GetScheduledJobs = js.Any.fromFunction0(GetScheduledJobs), ModifyScheduledJob = js.Any.fromFunction1(ModifyScheduledJob), RemoveScheduledJob = js.Any.fromFunction1(RemoveScheduledJob), StartScheduledJob = js.Any.fromFunction1(StartScheduledJob))
    __obj.asInstanceOf[IServerScheduledJobManagementOperations]
  }
  @scala.inline
  implicit class IServerScheduledJobManagementOperationsOps[Self <: IServerScheduledJobManagementOperations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddScheduledJob(value: IScheduledJob => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddScheduledJob")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCancelScheduledJob(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CancelScheduledJob")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetScheduledJob(value: Double => IScheduledJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetScheduledJob")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetScheduledJobRunInfo(value: Double => IScheduledJobRunInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetScheduledJobRunInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetScheduledJobs(value: () => IScheduledJobs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetScheduledJobs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withModifyScheduledJob(value: IScheduledJob => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModifyScheduledJob")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveScheduledJob(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveScheduledJob")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartScheduledJob(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartScheduledJob")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

