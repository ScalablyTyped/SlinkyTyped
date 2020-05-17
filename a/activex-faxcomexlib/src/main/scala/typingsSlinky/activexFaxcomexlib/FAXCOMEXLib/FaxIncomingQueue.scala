package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxIncomingQueue Class */
@js.native
trait FaxIncomingQueue extends js.Object {
  /** Is queue blocked */
  var Blocked: Boolean = js.native
  @JSName("FAXCOMEXLib.FaxIncomingQueue_typekey")
  var FAXCOMEXLibDotFaxIncomingQueue_typekey: FaxIncomingQueue = js.native
  /** Get incoming job by ID */
  def GetJob(bstrJobId: String): FaxIncomingJob = js.native
  /** Collection of incoming jobs */
  def GetJobs(): FaxIncomingJobs = js.native
  /** Refresh the object */
  def Refresh(): Unit = js.native
  /** Save the object */
  def Save(): Unit = js.native
}

object FaxIncomingQueue {
  @scala.inline
  def apply(
    Blocked: Boolean,
    FAXCOMEXLibDotFaxIncomingQueue_typekey: FaxIncomingQueue,
    GetJob: String => FaxIncomingJob,
    GetJobs: () => FaxIncomingJobs,
    Refresh: () => Unit,
    Save: () => Unit
  ): FaxIncomingQueue = {
    val __obj = js.Dynamic.literal(Blocked = Blocked.asInstanceOf[js.Any], GetJob = js.Any.fromFunction1(GetJob), GetJobs = js.Any.fromFunction0(GetJobs), Refresh = js.Any.fromFunction0(Refresh), Save = js.Any.fromFunction0(Save))
    __obj.updateDynamic("FAXCOMEXLib.FaxIncomingQueue_typekey")(FAXCOMEXLibDotFaxIncomingQueue_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxIncomingQueue]
  }
  @scala.inline
  implicit class FaxIncomingQueueOps[Self <: FaxIncomingQueue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Blocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFAXCOMEXLibDotFaxIncomingQueue_typekey(value: FaxIncomingQueue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAXCOMEXLib.FaxIncomingQueue_typekey")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withRefresh(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Refresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Save")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

