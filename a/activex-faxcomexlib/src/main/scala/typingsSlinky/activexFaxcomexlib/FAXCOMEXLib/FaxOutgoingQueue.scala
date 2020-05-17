package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxOutgoingQueue Class */
@js.native
trait FaxOutgoingQueue extends js.Object {
  /** How long the failed fax message is kept on the server */
  var AgeLimit: Double = js.native
  /** Are personal cover pages allowed */
  var AllowPersonalCoverPages: Boolean = js.native
  /** Is the queue blocked */
  var Blocked: Boolean = js.native
  /** Does the server generate a brand */
  var Branding: Boolean = js.native
  /** End of the discount rate period */
  var DiscountRateEnd: VarDate = js.native
  /** Start of the discount rate period */
  var DiscountRateStart: VarDate = js.native
  @JSName("FAXCOMEXLib.FaxOutgoingQueue_typekey")
  var FAXCOMEXLibDotFaxOutgoingQueue_typekey: FaxOutgoingQueue = js.native
  /** Is the queue paused */
  var Paused: Boolean = js.native
  /** Number of retries */
  var Retries: Double = js.native
  /** Retry delay */
  var RetryDelay: Double = js.native
  /** Is device Transmitting Station ID used */
  var UseDeviceTSID: Boolean = js.native
  /** Outgoing job by ID */
  def GetJob(bstrJobId: String): IFaxOutgoingJob = js.native
  /** Collection of outgoing jobs */
  def GetJobs(): FaxOutgoingJobs = js.native
  /** Refresh the object */
  def Refresh(): Unit = js.native
  /** Save the object */
  def Save(): Unit = js.native
}

object FaxOutgoingQueue {
  @scala.inline
  def apply(
    AgeLimit: Double,
    AllowPersonalCoverPages: Boolean,
    Blocked: Boolean,
    Branding: Boolean,
    DiscountRateEnd: VarDate,
    DiscountRateStart: VarDate,
    FAXCOMEXLibDotFaxOutgoingQueue_typekey: FaxOutgoingQueue,
    GetJob: String => IFaxOutgoingJob,
    GetJobs: () => FaxOutgoingJobs,
    Paused: Boolean,
    Refresh: () => Unit,
    Retries: Double,
    RetryDelay: Double,
    Save: () => Unit,
    UseDeviceTSID: Boolean
  ): FaxOutgoingQueue = {
    val __obj = js.Dynamic.literal(AgeLimit = AgeLimit.asInstanceOf[js.Any], AllowPersonalCoverPages = AllowPersonalCoverPages.asInstanceOf[js.Any], Blocked = Blocked.asInstanceOf[js.Any], Branding = Branding.asInstanceOf[js.Any], DiscountRateEnd = DiscountRateEnd.asInstanceOf[js.Any], DiscountRateStart = DiscountRateStart.asInstanceOf[js.Any], GetJob = js.Any.fromFunction1(GetJob), GetJobs = js.Any.fromFunction0(GetJobs), Paused = Paused.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), Retries = Retries.asInstanceOf[js.Any], RetryDelay = RetryDelay.asInstanceOf[js.Any], Save = js.Any.fromFunction0(Save), UseDeviceTSID = UseDeviceTSID.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxOutgoingQueue_typekey")(FAXCOMEXLibDotFaxOutgoingQueue_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxOutgoingQueue]
  }
  @scala.inline
  implicit class FaxOutgoingQueueOps[Self <: FaxOutgoingQueue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgeLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AgeLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowPersonalCoverPages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowPersonalCoverPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Blocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBranding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Branding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiscountRateEnd(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiscountRateEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiscountRateStart(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiscountRateStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFAXCOMEXLibDotFaxOutgoingQueue_typekey(value: FaxOutgoingQueue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAXCOMEXLib.FaxOutgoingQueue_typekey")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withPaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Paused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefresh(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Refresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Retries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetryDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetryDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Save")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUseDeviceTSID(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseDeviceTSID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

