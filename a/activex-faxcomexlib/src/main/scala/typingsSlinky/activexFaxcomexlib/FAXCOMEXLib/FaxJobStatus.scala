package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxJobStatus Class */
@js.native
trait FaxJobStatus extends js.Object {
  /** Available operations, a bit-wise combination of FAX_JOB_OPERATIONS values */
  val AvailableOperations: FAX_JOB_OPERATIONS_ENUM = js.native
  /** Called Station ID */
  val CSID: String = js.native
  /** Caller ID */
  val CallerId: String = js.native
  /** Page currently in transmision */
  val CurrentPage: Double = js.native
  /** Device ID of device that transmits the job */
  val DeviceId: Double = js.native
  /** Extended status description */
  val ExtendedStatus: String = js.native
  /** Code of the job's extended status */
  val ExtendedStatusCode: FAX_JOB_EXTENDED_STATUS_ENUM = js.native
  @JSName("FAXCOMEXLib.FaxJobStatus_typekey")
  var FAXCOMEXLibDotFaxJobStatus_typekey: FaxJobStatus = js.native
  /** Job type */
  val JobType: FAX_JOB_TYPE_ENUM = js.native
  /** Total number of pages */
  val Pages: Double = js.native
  /** Number of failed transmission retries */
  val Retries: Double = js.native
  /** Routing information */
  val RoutingInformation: String = js.native
  /** The time the fax job is scheduled to be transmitted */
  val ScheduledTime: VarDate = js.native
  /** Size in bytes of TIFF file */
  val Size: Double = js.native
  /** Current queue status of the job, a bit-wise combination of FAX_JOB_STATUS values */
  val Status: FAX_JOB_STATUS_ENUM = js.native
  /** Transmitting Station ID */
  val TSID: String = js.native
  /** The time the fax job finished its transmission */
  val TransmissionEnd: VarDate = js.native
  /** The time the fax job started its transmission */
  val TransmissionStart: VarDate = js.native
}

object FaxJobStatus {
  @scala.inline
  def apply(
    AvailableOperations: FAX_JOB_OPERATIONS_ENUM,
    CSID: String,
    CallerId: String,
    CurrentPage: Double,
    DeviceId: Double,
    ExtendedStatus: String,
    ExtendedStatusCode: FAX_JOB_EXTENDED_STATUS_ENUM,
    FAXCOMEXLibDotFaxJobStatus_typekey: FaxJobStatus,
    JobType: FAX_JOB_TYPE_ENUM,
    Pages: Double,
    Retries: Double,
    RoutingInformation: String,
    ScheduledTime: VarDate,
    Size: Double,
    Status: FAX_JOB_STATUS_ENUM,
    TSID: String,
    TransmissionEnd: VarDate,
    TransmissionStart: VarDate
  ): FaxJobStatus = {
    val __obj = js.Dynamic.literal(AvailableOperations = AvailableOperations.asInstanceOf[js.Any], CSID = CSID.asInstanceOf[js.Any], CallerId = CallerId.asInstanceOf[js.Any], CurrentPage = CurrentPage.asInstanceOf[js.Any], DeviceId = DeviceId.asInstanceOf[js.Any], ExtendedStatus = ExtendedStatus.asInstanceOf[js.Any], ExtendedStatusCode = ExtendedStatusCode.asInstanceOf[js.Any], JobType = JobType.asInstanceOf[js.Any], Pages = Pages.asInstanceOf[js.Any], Retries = Retries.asInstanceOf[js.Any], RoutingInformation = RoutingInformation.asInstanceOf[js.Any], ScheduledTime = ScheduledTime.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], TSID = TSID.asInstanceOf[js.Any], TransmissionEnd = TransmissionEnd.asInstanceOf[js.Any], TransmissionStart = TransmissionStart.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxJobStatus_typekey")(FAXCOMEXLibDotFaxJobStatus_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxJobStatus]
  }
  @scala.inline
  implicit class FaxJobStatusOps[Self <: FaxJobStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailableOperations(value: FAX_JOB_OPERATIONS_ENUM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailableOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCSID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CSID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtendedStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtendedStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtendedStatusCode(value: FAX_JOB_EXTENDED_STATUS_ENUM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtendedStatusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFAXCOMEXLibDotFaxJobStatus_typekey(value: FaxJobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAXCOMEXLib.FaxJobStatus_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobType(value: FAX_JOB_TYPE_ENUM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Retries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoutingInformation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoutingInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheduledTime(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduledTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: FAX_JOB_STATUS_ENUM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransmissionEnd(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransmissionEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransmissionStart(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransmissionStart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

