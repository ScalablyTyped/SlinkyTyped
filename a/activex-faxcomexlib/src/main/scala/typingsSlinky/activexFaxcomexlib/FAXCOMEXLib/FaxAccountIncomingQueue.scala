package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxAccountIncomingQueue Class */
@js.native
trait FaxAccountIncomingQueue extends js.Object {
  @JSName("FAXCOMEXLib.FaxAccountIncomingQueue_typekey")
  var FAXCOMEXLibDotFaxAccountIncomingQueue_typekey: FaxAccountIncomingQueue = js.native
  /** Get incoming job by ID */
  def GetJob(bstrJobId: String): FaxIncomingJob = js.native
  /** Collection of incoming jobs */
  def GetJobs(): FaxIncomingJobs = js.native
}

object FaxAccountIncomingQueue {
  @scala.inline
  def apply(
    FAXCOMEXLibDotFaxAccountIncomingQueue_typekey: FaxAccountIncomingQueue,
    GetJob: String => FaxIncomingJob,
    GetJobs: () => FaxIncomingJobs
  ): FaxAccountIncomingQueue = {
    val __obj = js.Dynamic.literal(GetJob = js.Any.fromFunction1(GetJob), GetJobs = js.Any.fromFunction0(GetJobs))
    __obj.updateDynamic("FAXCOMEXLib.FaxAccountIncomingQueue_typekey")(FAXCOMEXLibDotFaxAccountIncomingQueue_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxAccountIncomingQueue]
  }
  @scala.inline
  implicit class FaxAccountIncomingQueueOps[Self <: FaxAccountIncomingQueue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFAXCOMEXLibDotFaxAccountIncomingQueue_typekey(value: FaxAccountIncomingQueue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAXCOMEXLib.FaxAccountIncomingQueue_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetJob(value: String => FaxIncomingJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetJob")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetJobs(value: () => FaxIncomingJobs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetJobs")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

