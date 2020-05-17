package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxAccountOutgoingQueue Class */
@js.native
trait FaxAccountOutgoingQueue extends js.Object {
  @JSName("FAXCOMEXLib.FaxAccountOutgoingQueue_typekey")
  var FAXCOMEXLibDotFaxAccountOutgoingQueue_typekey: FaxAccountOutgoingQueue = js.native
  /** Get outgoing job by ID */
  def GetJob(bstrJobId: String): IFaxOutgoingJob = js.native
  /** Collection of outgoing jobs */
  def GetJobs(): FaxOutgoingJobs = js.native
}

object FaxAccountOutgoingQueue {
  @scala.inline
  def apply(
    FAXCOMEXLibDotFaxAccountOutgoingQueue_typekey: FaxAccountOutgoingQueue,
    GetJob: String => IFaxOutgoingJob,
    GetJobs: () => FaxOutgoingJobs
  ): FaxAccountOutgoingQueue = {
    val __obj = js.Dynamic.literal(GetJob = js.Any.fromFunction1(GetJob), GetJobs = js.Any.fromFunction0(GetJobs))
    __obj.updateDynamic("FAXCOMEXLib.FaxAccountOutgoingQueue_typekey")(FAXCOMEXLibDotFaxAccountOutgoingQueue_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxAccountOutgoingQueue]
  }
  @scala.inline
  implicit class FaxAccountOutgoingQueueOps[Self <: FaxAccountOutgoingQueue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFAXCOMEXLibDotFaxAccountOutgoingQueue_typekey(value: FaxAccountOutgoingQueue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAXCOMEXLib.FaxAccountOutgoingQueue_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetJob(value: String => IFaxOutgoingJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetJob")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetJobs(value: () => FaxOutgoingJobs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetJobs")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

